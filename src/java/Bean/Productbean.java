package Bean;

import java.math.BigDecimal;
import java.time.LocalDate;

/**
 * Data Transfer Object (DTO) class for Product.
 * This class is used to encapsulate product details and facilitate
 * the transfer of product data between different layers of the application.
 * Author - Chiranjeev Singh , Khushpreet Kaur
 */
public class Productbean {

    // Fields to store product details
    private int productId;         // Unique identifier for the product
    private String productName;    // Name of the product
    private String category;       // Category to which the product belongs
    private String description;    // Description of the product
    private BigDecimal sellerPrice;// Price at which the product is sold
    private LocalDate addedDate;   // Date when the product was added
    private String foodCondition;  // Condition of the food product (if applicable)
    private int userId;            // ID of the user who added the product
    private String imageUrl;       // URL of the product image

    /**
     * Default constructor.
     * Initializes a new instance of the Productbean class without setting any fields.
     */
    public Productbean() {
        // No-arg constructor
    }

    /**
     * Parameterized constructor.
     * Initializes a new instance of the Productbean class with the provided values.
     *
     * @param productName  Name of the product
     * @param category     Category of the product
     * @param description  Description of the product
     * @param sellerPrice  Price at which the product is sold
     * @param addedDate    Date when the product was added
     * @param foodCondition Condition of the food product
     * @param userId       ID of the user who added the product
     * @param imageUrl     URL of the product image
     */
    public Productbean(String productName, String category, String description, BigDecimal sellerPrice, LocalDate addedDate, String foodCondition, int userId, String imageUrl) {
        this.productName = productName;
        this.category = category;
        this.description = description;
        this.sellerPrice = sellerPrice;
        this.addedDate = addedDate;
        this.foodCondition = foodCondition;
        this.userId = userId;
        this.imageUrl = imageUrl;
    }

    // Getter and setter methods for each field

    /**
     * Gets the product ID.
     *
     * @return Product ID
     */
    public int getProductId() {
        return productId;
    }

    /**
     * Sets the product ID.
     *
     * @param productId Product ID
     */
    public void setProductId(int productId) {
        this.productId = productId;
    }

    /**
     * Gets the product name.
     *
     * @return Product name
     */
    public String getProductName() {
        return productName;
    }

    /**
     * Sets the product name.
     *
     * @param productName Product name
     */
    public void setProductName(String productName) {
        this.productName = productName;
    }

    /**
     * Gets the product category.
     *
     * @return Product category
     */
    public String getCategory() {
        return category;
    }

    /**
     * Sets the product category.
     *
     * @param category Product category
     */
    public void setCategory(String category) {
        this.category = category;
    }

    /**
     * Gets the product description.
     *
     * @return Product description
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the product description.
     *
     * @param description Product description
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * Gets the seller price of the product.
     *
     * @return Seller price
     */
    public BigDecimal getSellerPrice() {
        return sellerPrice;
    }

    /**
     * Sets the seller price of the product.
     *
     * @param sellerPrice Seller price
     */
    public void setSellerPrice(BigDecimal sellerPrice) {
        this.sellerPrice = sellerPrice;
    }

    /**
     * Gets the date when the product was added.
     *
     * @return Added date
     */
    public LocalDate getAddedDate() {
        return addedDate;
    }

    /**
     * Sets the date when the product was added.
     *
     * @param addedDate Added date
     */
    public void setAddedDate(LocalDate addedDate) {
        this.addedDate = addedDate;
    }

    /**
     * Gets the food condition.
     *
     * @return Food condition
     */
    public String getFoodCondition() {
        return foodCondition;
    }

    /**
     * Sets the food condition.
     *
     * @param foodCondition Food condition
     */
    public void setFoodCondition(String foodCondition) {
        this.foodCondition = foodCondition;
    }

    /**
     * Gets the user ID of the user who added the product.
     *
     * @return User ID
     */
    public int getUserId() {
        return userId;
    }

    /**
     * Sets the user ID of the user who added the product.
     *
     * @param userId User ID
     */
    public void setUserId(int userId) {
        this.userId = userId;
    }

    /**
     * Gets the URL of the product image.
     *
     * @return Image URL
     */
    public String getImageUrl() {
        return imageUrl;
    }

    /**
     * Sets the URL of the product image.
     *
     * @param imageUrl Image URL
     */
    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }
}
