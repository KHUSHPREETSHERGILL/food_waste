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
    <div class="product-container">
        <h1>Charitable Products</h1>
        
        <%
            // Retrieve product data from the database
            ProductDAOImpl productDAO = new ProductDAOImpl(DBUtil.provideConnection());
            List<Productbean> productsurplusList = productDAO.getAllsurplusProducts();

            // Iterate over the product surplus list and generate HTML dynamically for each product
            for (Productbean product : productsurplusList) {
        %>
            <div class="product">
                <h2><%= product.getProductName() %></h2>
                <p>Category: <%= product.getCategory() %></p>
                <p>Description: <%= product.getDescription() %></p>
                <p>Seller Price: $<%= product.getSellerPrice() %></p>
                <p>Expire Date: <%= product.getAddedDate() %></p>
                <p>Food Condition: <%= product.getFoodCondition() %></p>
                <img src="<%= product.getImageUrl() %>" alt="<%= product.getProductName() %>">
            </div>
        <% } %>
    </div>

    <div class="product-container">
        <h1>Regular Products</h1>
        
        <%
            // Retrieve product data from the database
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
            </div>
        <% } %>
    </div>

</body>
</html>
