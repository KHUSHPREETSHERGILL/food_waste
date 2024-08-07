<%-- 
    Document   : loginFailed
    Author     : chiranjeev
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Login Failed</title>

</head>
<jsp:include page="header.jsp" />
<body>
     <div class="container">
        <div class="row justify-content-center">
          <div class="col-lg-5 col-md-8 align-item-center">
    <div class="message">
        <h1>Login Failed</h1>
        <p>${errorMessage}</p>
        <a href="login.jsp">Back to Login</a>
    </div>
        </div>
        </div>
        </div>
        
</body>
</html>