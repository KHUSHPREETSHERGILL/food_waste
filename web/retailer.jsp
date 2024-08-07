<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Retailer Home</title>
</head>
<body>
    <jsp:include page="header.jsp" />
    <h1>Welcome Retailer!</h1>
    <div class="container">
        <div class="row justify-content-center">
          <div class="col-lg-5 col-md-8 align-item-center">
    <div class="border">
    <h2>Add Product</h2>
    <form action="RetailerServlet" method="post" class="bg-gray p-4">
        <label for="productName">Product Name:</label><br>
        <input type="text" id="productName" name="productName" required><br>
        
        <label for="category">Category:</label><br>
        <input type="text" id="category" name="category" required><br>
        
        <label for="description">Description:</label><br>
        <textarea id="description" name="description" required></textarea><br>
        
        <label for="sellerPrice">Seller Price:</label><br>
        <input type="text" id="sellerPrice" name="sellerPrice" required><br>
        
        <label for="addedDate">Expire Date:</label><br>
        <input type="date" id="addedDate" name="addedDate" required><br>
        
        <label for="foodCondition">Food Condition:</label><br>
        <input type="text" id="foodCondition" name="foodCondition" required><br>
        
        <label for="userId">User ID:</label><br>
        <input type="text" id="userId" name="userId" required><br>
        
        <label for="imageUrl">Image URL:</label><br>
        <input type="text" id="imageUrl" name="imageUrl" required><br>
        
        <label for="imageInput">Image Upload here:</label><br><!-- comment -->
        <imput
        
        <input type="submit" value="Add Product">
    </form>
    </div>
              </div>
            </div>
</body>
</html>
