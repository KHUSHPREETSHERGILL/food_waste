<%-- 
    Document   : register
    Author     : chiranjeev
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>


<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">

<f:view>
   <!DOCTYPE html>
<html lang="en">
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

  <body class="body-wrapper">
    <!-- Header -->
    <jsp:include page="header.jsp" />

    <!-- Register -->
    <section class="login py-5 border-top-1">
      <div class="container">
        <div class="row justify-content-center">
          <div class="col-lg-5 col-md-8 align-item-center">
            <div class="border border">
              <h3 class="bg-gray p-4">Register Now</h3>
              <form action="./register" method="post">
                <fieldset class="p-4">
                  <input
                    class="form-control mb-3"
                    type="text"
                    placeholder="UserName"
                    name="username"
                    required
                  />
                  <input
                    class="form-control mb-3"
                    type="text"
                    placeholder="FirstName"
                    name="firstName"
                    required
                  />
                  <input
                    class="form-control mb-3"
                    type="text"
                    placeholder="LastName"
                    name="lastName"
                    required
                  />

                  <select name="userType" id="userType" class="form-control w-100 mb-3">
                    <option value="1">Select Role</option>
                    <option value="Retailer">Retailer</option>
                    <option value="Consumer">Consumer</option>
                    <option value="Charitable Consumer">Charitable Consumer</option>
                  
                </select>
                  <input
                    class="form-control mb-3"
                    type="password"
                    placeholder="Password*"
                    name="password"
                    required
                  />
                  <input
                  class="form-control mb-3"
                  type="password"
                  placeholder="Confirm Password*"
                  name="confirmPassword"
                  required
                />
                
                  <button
                    type="submit"
                    class="btn add-button font-weight-bold mt-3"
                  >
                    Register Now
                  </button>
                  <div>
                    <a
                      class="mt-3 d-inline-block text-primary"
                      href="login.jsp"
                      >Login Now</a
                    >
                  </div>
                </fieldset>
              </form>
            </div>
          </div>
        </div>
      </div>
    </section>

    <!-- Footer -->
    <footer class="footer section section-sm">
      <!-- Container Start -->
      <div class="container">
        <div class="row">
          <div class="col-lg-3 col-md-7 offset-md-1 offset-lg-0 mb-4 mb-lg-0">
            
          </div>
          <!-- Link list -->
          <div class="col-lg-2 offset-lg-1 col-md-3 col-6 mb-4 mb-lg-0">
            <div class="block">
              <h4>Site Pages</h4>
              <ul>
                <li><a href="index.jsp">Home</a></li>
                <li>
                  <a href="aboutus.jsp">About Us</a>
                </li>
              </ul>
            </div>
          </div>
          <!-- Link list -->
          <div
            class="col-lg-2 col-md-3 offset-md-1 offset-lg-0 col-6 mb-4 mb-md-0"
          >
            <div class="block">
              <h4>Product</h4>
              <ul>
                <li><a href="product.jsp">All Product</a></li>
                
              </ul>
            </div>
          </div>
          
        </div>
      </div>
      <!-- Container End -->
    </footer>
    <!-- Footer Bottom -->
    <footer class="footer-bottom">
      <!-- Container Start -->
      <div class="container">
        <div class="row">
          <div class="col-lg-6 text-center text-lg-left mb-3 mb-lg-0">
            <!-- Copyright -->
            <div class="copyright">
              <p>
                Copyright &copy;
                <script>
                  var CurrentYear = new Date().getFullYear();
                  document.write(CurrentYear);
                </script>
                . EcoPlateSaver
              </p>
            </div>
          </div>
          <div class="col-lg-6">
            <!-- Social Icons -->
            <ul class="social-media-icons text-center text-lg-right">
              <li>
                <a class="fa fa-facebook" href="#"></a>
              </li>
              <li>
                <a class="fa fa-twitter" href="#"></a>
              </li>
              <li>
                <a class="fa fa-pinterest-p" href="#"></a>
              </li>
              <li>
                <a class="fa fa-github-alt" href="#"></a>
              </li>
            </ul>
          </div>
        </div>
      </div>
      <!-- Container End -->
      <!-- To Top -->
      <div class="scroll-top-to">
        <i class="fa fa-angle-up"></i>
      </div>
    </footer>

    <!-- 
Essential Scripts
=====================================-->
    <script src="plugins/jquery/jquery.min.js"></script>
    <script src="plugins/bootstrap/popper.min.js"></script>
    <script src="plugins/bootstrap/bootstrap.min.js"></script>
    <script src="plugins/bootstrap/bootstrap-slider.js"></script>
    <script src="plugins/tether/js/tether.min.js"></script>
    <script src="plugins/raty/jquery.raty-fa.js"></script>
    <script src="plugins/slick/slick.min.js"></script>
    <script src="plugins/jquery-nice-select/js/jquery.nice-select.min.js"></script>
    <!-- google map -->
    <script
      src="https://maps.googleapis.com/maps/api/js?key=AIzaSyCcABaamniA6OL5YvYSpB3pFMNrXwXnLwU"
      defer
    ></script>
    <script src="plugins/google-map/map.js" defer></script>

    <script src="js/script.js"></script>
  </body>
</html>

</f:view>