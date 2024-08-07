
package DAO;

import Bean.Productbean;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Implementation of the ProductDAO interface.
 * This class provides methods to interact with the database for CRUD operations on Productbean objects.
 * Author- Chiranjeev Singh , Khushpreet Kaur
 */
public class ProductDAOImpl implements ProductDAO {
    private Connection connection;

    /**
     * Constructor to initialize the connection.
     *
     * @param connection The database connection.
     */
    public ProductDAOImpl(Connection connection) {
        this.connection = connection;
    }

    /**
     * Retrieves a product by its unique identifier.
     *
     * @param productId The unique identifier of the product.
     * @return The Productbean object representing the product, or null if not found.
     */
    @Override
    public Productbean getProductById(int productId) {
        Productbean product = null;
        String sql = "SELECT * FROM Product WHERE product_id = ?";
        try (PreparedStatement stmt = connection.prepareStatement(sql)) {
            stmt.setInt(1, productId);
            ResultSet rs = stmt.executeQuery();
            if (rs.next()) {
                product = mapResultSetToProduct(rs);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return product;
    }

    /**
     * Retrieves all products.
     *
     * @return A list of Productbean objects representing all products.
     */
    @Override
    public List<Productbean> getAllProducts() {
        List<Productbean> productList = new ArrayList<>();
        String sql = "SELECT * FROM Product WHERE seller_price != 0";
        try (Statement stmt = connection.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {
            while (rs.next()) {
                Productbean product = mapResultSetToProduct(rs);
                productList.add(product);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return productList;
    }

    /**
     * Retrieves all surplus products (products with a seller price of 0).
     *
     * @return A list of Productbean objects representing the surplus products.
     */
    @Override
    public List<Productbean> getAllsurplusProducts() {
        List<Productbean> productsurplusList = new ArrayList<>();
        String sql = "SELECT * FROM Product WHERE seller_price = 0";
        try (Statement stmt = connection.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {
            while (rs.next()) {
                Productbean product = mapResultSetToProduct(rs);
                productsurplusList.add(product);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return productsurplusList;
    }

    /**
     * Retrieves products added by a specific user.
     *
     * @param userId The unique identifier of the user.
     * @return A list of Productbean objects representing the products added by the specified user.
     */
    @Override
    public List<Productbean> getProductsByUserId(int userId) {
        List<Productbean> productList = new ArrayList<>();
        String sql = "SELECT * FROM Product WHERE user_id = ?";
        try (PreparedStatement stmt = connection.prepareStatement(sql)) {
            stmt.setInt(1, userId);
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                Productbean product = mapResultSetToProduct(rs);
                productList.add(product);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return productList;
    }

    /**
     * Adds a new product.
     *
     * @param product The Productbean object representing the product to be added.
     */
    @Override
    public void addProduct(Productbean product) {
        String sql = "INSERT INTO Product (product_name, category, description, seller_price, added_date, Food_condition, user_id, image_url) VALUES (?, ?, ?, ?, ?, ?, ?, ?)";
        try (PreparedStatement stmt = connection.prepareStatement(sql)) {
            stmt.setString(1, product.getProductName());
            stmt.setString(2, product.getCategory());
            stmt.setString(3, product.getDescription());
            stmt.setBigDecimal(4, product.getSellerPrice());
            stmt.setDate(5, Date.valueOf(product.getAddedDate()));
            stmt.setString(6, product.getFoodCondition());
            stmt.setInt(7, product.getUserId());
            stmt.setString(8, product.getImageUrl());
            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    /**
     * Updates an existing product.
     *
     * @param product The Productbean object representing the updated product data.
     */
    @Override
    public void updateProduct(Productbean product) {
        String sql = "UPDATE Product SET product_name = ?, category = ?, description = ?, seller_price = ?, added_date = ?, Food_condition = ?, user_id = ?, image_url = ? WHERE product_id = ?";
        try (PreparedStatement stmt = connection.prepareStatement(sql)) {
            stmt.setString(1, product.getProductName());
            stmt.setString(2, product.getCategory());
            stmt.setString(3, product.getDescription());
            stmt.setBigDecimal(4, product.getSellerPrice());
            stmt.setDate(5, Date.valueOf(product.getAddedDate()));
            stmt.setString(6, product.getFoodCondition());
            stmt.setInt(7, product.getUserId());
            stmt.setString(8, product.getImageUrl());
            stmt.setInt(9, product.getProductId());
            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    /**
     * Deletes a product by its unique identifier.
     *
     * @param productId The unique identifier of the product to be deleted.
     */
    @Override
    public void deleteProduct(int productId) {
        String sql = "DELETE FROM Product WHERE product_id = ?";
        try (PreparedStatement stmt = connection.prepareStatement(sql)) {
            stmt.setInt(1, productId);
            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    /**
     * Helper method to map ResultSet to Productbean object.
     *
     * @param rs The ResultSet containing the product data.
     * @return A Productbean object with the data from the ResultSet.
     * @throws SQLException If an SQL error occurs.
     */
    private Productbean mapResultSetToProduct(ResultSet rs) throws SQLException {
        Productbean product = new Productbean();
        product.setProductId(rs.getInt("product_id"));
        product.setProductName(rs.getString("product_name"));
        product.setCategory(rs.getString("category"));
        product.setDescription(rs.getString("description"));
        product.setSellerPrice(rs.getBigDecimal("seller_price"));
        product.setAddedDate(rs.getDate("added_date").toLocalDate());
        product.setFoodCondition(rs.getString("Food_condition"));
        product.setUserId(rs.getInt("user_id"));
        product.setImageUrl(rs.getString("image_url"));
        return product;
    }
}
