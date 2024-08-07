
package DAO;

import Bean.Productbean;
import java.util.List;

/**
 * Data Access Object (DAO) interface for Product.
 * This interface defines the contract for interacting with the Product data.
 * It provides methods for CRUD operations and specific queries related to products.
 * Author - Chiranjeev Singh , Khushpreet Kaur
 */
public interface ProductDAO {

    /**
     * Retrieves a product by its unique identifier.
     *
     * @param productId The unique identifier of the product.
     * @return The Productbean object representing the product, or null if not found.
     */
    Productbean getProductById(int productId);

    /**
     * Retrieves all products.
     *
     * @return A list of Productbean objects representing all products.
     */
    List<Productbean> getAllProducts();

    /**
     * Retrieves products added by a specific user.
     *
     * @param userId The unique identifier of the user.
     * @return A list of Productbean objects representing the products added by the specified user.
     */
    List<Productbean> getProductsByUserId(int userId);

    /**
     * Adds a new product.
     *
     * @param product The Productbean object representing the product to be added.
     */
    void addProduct(Productbean product);

    /**
     * Updates an existing product.
     *
     * @param product The Productbean object representing the updated product data.
     */
    void updateProduct(Productbean product);

    /**
     * Deletes a product by its unique identifier.
     *
     * @param productId The unique identifier of the product to be deleted.
     */
    void deleteProduct(int productId);

    /**
     * Retrieves all surplus products (products with a seller price of 0).
     *
     * @return A list of Productbean objects representing the surplus products.
     */
    List<Productbean> getAllsurplusProducts();
}
