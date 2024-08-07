package Serverlet;

import java.io.IOException;
import java.math.BigDecimal;
import java.sql.Connection;
import java.time.LocalDate;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import Utils.DBUtil; // Import your DBUtil class
import DAO.ProductDAO;
import DAO.ProductDAOImpl;
import Bean.Productbean;

/**
 * Servlet implementation class RetailerServlet.
 * This servlet handles requests for adding a product to the database.
 * author Chiranjeev Singh , Khushpreet Kaur
 */
@WebServlet("/RetailerServlet")
public class RetailerServlet extends HttpServlet {
    private ProductDAO productDAO;

    /**
     * Constructor to initialize ProductDAO.
     * Establishes a connection to the database and initializes the ProductDAOImpl instance.
     */
    public RetailerServlet() {
        // Initialize ProductDAOImpl here with your database connection
        Connection connection = DBUtil.provideConnection(); // Get connection from DBUtil
        this.productDAO = new ProductDAOImpl(connection);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     * Processes the request to add a new product to the database.
     *
     * @param request  The HttpServletRequest object that contains the request the client has made of the servlet.
     * @param response The HttpServletResponse object that contains the response the servlet sends to the client.
     * @throws ServletException If a servlet-specific error occurs.
     * @throws IOException If an I/O error occurs.
     */
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Retrieve form parameters
        String productName = request.getParameter("productName");
        String category = request.getParameter("category");
        String description = request.getParameter("description");
        BigDecimal sellerPrice = new BigDecimal(request.getParameter("sellerPrice"));
        LocalDate addedDate = LocalDate.parse(request.getParameter("addedDate"));
        String foodCondition = request.getParameter("foodCondition");
        int userId = Integer.parseInt(request.getParameter("userId"));
        String imageUrl = request.getParameter("imageUrl");

        // Create Productbean object
        Productbean product = new Productbean();
        product.setProductName(productName);
        product.setCategory(category);
        product.setDescription(description);
        product.setSellerPrice(sellerPrice);
        product.setAddedDate(addedDate);
        product.setFoodCondition(foodCondition);
        product.setUserId(userId);
        product.setImageUrl(imageUrl);

        // Add product to the database
        productDAO.addProduct(product);

        // Redirect back to retailer home page or display a success message
        response.sendRedirect(request.getContextPath() + "/AddProductMessage.jsp");
    }
}
