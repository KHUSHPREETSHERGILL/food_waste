<%-- 
    Document   : header
    Author     : chiranjeev
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
    <!-- ** Basic Page Needs ** -->
    <meta charset="utf-8" />
    <title>Food Waste Reduction Platform</title>

    <!-- ** Mobile Specific Metas ** -->
    <meta http-equiv="X-UA-Compatible" content="IE=edge" />
    <meta name="description" content="Agency HTML Template" />
    <meta
      name="viewport"
      content="width=device-width, initial-scale=1.0, maximum-scale=5.0"
    />
    <meta name="author" content="Themefisher" />
    <meta
      name="generator"
      content="Themefisher Classified Marketplace Template v1.0"
    />

    <meta name="FoodSaverHub" content="Food Waste Reduction Platform" />

    <link href="plugins/bootstrap/bootstrap.min.css" rel="stylesheet" />
    <link href="plugins/bootstrap/bootstrap-slider.css" rel="stylesheet" />
    <link
      href="plugins/font-awesome/css/font-awesome.min.css"
      rel="stylesheet"
    />
    <link href="plugins/slick/slick.css" rel="stylesheet" />
    <link href="plugins/slick/slick-theme.css" rel="stylesheet" />
    <link
      href="plugins/jquery-nice-select/css/nice-select.css"
      rel="stylesheet"
    />

    <link href="css/style.css" rel="stylesheet" />
  </head>

  
    <!-- Header -->
    <header class="bg-light">
    <div class="container">
        <div class="row">
            <div class="col-md-12">
                <nav class="navbar navbar-expand-lg navbar-light navigation">
                    <a class="navbar-brand text-success" href="index.html">
                        <img src="images/logo/logo-light.png" alt="" />
                        <!-- FoodSaverHub -->
                    </a>
                    <button class="navbar-toggler" type="button" data-toggle="collapse"
                            data-target="#navbarSupportedContent" aria-controls="navbarSupportedContent"
                            aria-expanded="false" aria-label="Toggle navigation">
                        <span class="navbar-toggler-icon"></span>
                    </button>
                    <div class="collapse navbar-collapse" id="navbarSupportedContent">
                        <ul class="navbar-nav ml-auto main-nav">
                            <li class="nav-item active">
                                <a class="nav-link" href="index.jsp">Home</a>
                            </li>
                            <li class="nav-item active">
                                <a class="nav-link" href="product.jsp">Products</a>
                            </li>
                        </ul>
                        <ul class="navbar-nav ml-auto">
                            <li class="nav-item">
                            <c:choose> 
                                
                                  <li class="nav-item">
        <a class="nav-link" href="login.jsp">Login</a>
    </li>
    <li class="nav-item">
        <a class="nav-link text-white add-button" href="register.jsp">Signup</a>
    </li
    </c:when>
<c:otherwise>
    <c:when test="${pageContext.request.servletPath == '/product.jsp' || pageContext.request.servletPath == '/caritable.jsp' || pageContext.request.servletPath == '/retailer.jsp'}">
    <form action="Logout" method="post">
        <button type="submit" class="nav-link login-button">Logout</button>
    </form>
    </c:otherwise>
    </c:choose>


                            </li>
                        </ul>
                    </div>
                </nav>
            </div>
        </div>
    </div>
</header>

    
</html>
