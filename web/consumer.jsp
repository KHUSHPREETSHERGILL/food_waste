<%@page import="java.util.List"%>
<%@page import="DAO.ProductDAOImpl"%>
<%@page import="Bean.Productbean"%>
<%@page import="Utils.DBUtil"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Product Page</title>
    <!-- Add any necessary CSS styles here -->
    <style>
        /* Example CSS styles */
        body {
            font-family: Arial, sans-serif;
            margin: 0;
            padding: 0;
        }
        .product-container {
            width: 80%;
            margin: auto;
            padding: 20px;
        }
        .product {
            border: 1px solid #ccc;
            border-radius: 5px;
            margin-bottom: 20px;
            padding: 20px;
        }
        .product img {
            max-width: 100%;
            height: auto;
            margin-bottom: 10px;
        }
        .button {
            background-color: #007bff;
            color: #fff;
            border: none;
            padding: 8px 16px;
            cursor: pointer;
            border-radius: 5px;
            outline: none;
            margin-right: 10px;
        }
        .button:hover {
            background-color: #0056b3;
        }
    </style>
</head>
<body>
    <jsp:include page="header.jsp" />
    
    <%
	/* Checking the user credentials */
//	String userName = (String) session.getAttribute("username");
//	String password = (String) session.getAttribute("password");
//
//	if (userName == null || password == null) {
//
//		response.sendRedirect("login.jsp?message=Session Expired, Login Again!!");
//
//	}
	%>
        
    <div class="product-container">
        <h1>Products</h1>
        
        <%
    // Retrieve product data from the database
    ProductDAOImpl productDAO = new ProductDAOImpl(DBUtil.provideConnection());
    List<Productbean> productList = productDAO.getAllProducts();

    // Iterate over the product list and generate HTML dynamically for each product
    for (Productbean product : productList) {
%>
    <div class="product">
        <h2><%= product.getProductName() %></h2>
        <p>Category: <%= product.getCategory() %></p>
        <p>Description: <%= product.getDescription() %></p>
        <p>Seller Price: $<%= product.getSellerPrice() %></p>
        <p>Expire Date: <%= product.getAddedDate() %></p>
        <p>Food Condition: <%= product.getFoodCondition() %></p>
        <img src="<%= product.getImageUrl() %>" alt="<%= product.getProductName() %>">
        <!-- Add to Cart and Buy Now buttons here -->
        <button class="button add-to-cart" onclick="addToCart(<%= product.getProductId() %>)">Add to Cart</button>
        <button class="button buy-now" onclick="buyNow(<%= product.getProductId() %>)">Buy Now</button>
    </div>
<%
    }
%>
        <!-- Add more products here -->
    </div>

<script>
    // Function to add product to cart
    function addToCart(productId) {
        // Find product details based on productId
        let productName = document.getElementById('productName_' + productId).innerText;
        let sellerPrice = parseFloat(document.getElementById('sellerPrice_' + productId).innerText.replace('$', ''));

        // Add product to cart
        let product = { productId, productName, sellerPrice };
        cart.push(product);

        // Optional: Update UI to indicate successful addition to cart
        alert(productName + ' added to cart!');

        // Optional: Log cart contents to console
        console.log('Cart:', cart);
    }

    // Function to handle buy now action
    function buyNow(productId) {
        // Find product details based on productId
        let productName = document.getElementById('productName_' + productId).innerText;
        let sellerPrice = parseFloat(document.getElementById('sellerPrice_' + productId).innerText.replace('$', ''));

        // Create an order with the product
        let order = [{ productId, productName, sellerPrice }];

        // Encode the order data
        let encodedOrder = encodeURIComponent(JSON.stringify(order));

        // Redirect to checkout page with encoded order details
        // Replace 'checkout.html' with your actual checkout page URL
        window.location.href = 'checkout.html?order=' + encodedOrder;
    }
</script>

</body>
</html>