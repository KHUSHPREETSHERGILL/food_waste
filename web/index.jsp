<%-- 
    Document   : index
    Author     : chiranjeev
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Index page</title>
         
    </head>
    <body class="body-wrapper>
       <jsp:include page="header.jsp" />
    <section class="hero-area text-center overly">
      <div class="bg-1"></div>
      <!-- Container Start -->
      <div class="container">
        <div class="row">
          <div class="col-md-12">
            <!-- Header Contetnt -->
            <div
              class="content-block text-start d-flex flex-column align-items-start text-left"
            >
              <h1>Waste Food Recycling Marketplace</h1>
              <p>Join the Movement, Save the Planet, One Plate at a Time.</p>
              <div>
                <a class="nav-link text-white add-button" href="register.jsp"
                  >Join With Us</a
                >
              </div>
            </div>
          </div>
        </div>
      </div>
      <!-- Container End -->
    </section>

    <!-- Popular Products -->
   

    <!-- Call to Action   -->
    <section class="call-to-action overly bg-3 section-sm">
      <!-- Container Start -->
      <div class="container">
        <div class="row justify-content-md-center text-center">
          <div class="col-md-8">
            <div class="content-holder">
              <h2>Join Us Today to Make a Difference</h2>
              <p class="text-light">
                Start now and be part of the movement to reduce food waste and
                promote sustainability.
              </p>
              <ul class="list-inline mt-30">
                <li class="list-inline-item">
                  <a
                    class="nav-link text-white login-button"
                    href="aboutus.jsp"
                    >Learn More</a
                  >
                </li>
                
              </ul>
            </div>
          </div>
        </div>
      </div>
      <!-- Container End -->
    </section>
     <jsp:include page="footer.jsp" />
    </<body>
</html>
