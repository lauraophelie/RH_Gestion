<%-- 
    Document   : page
    Created on : 1 oct. 2023, 22:27:22
    Author     : Laura Ophélie
--%>

<%
    String pageRequest = "/" + request.getParameter("page") + ".jsp";
%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="../assets/template-1-assets/css/styles.min.css">
        <link rel="stylesheet" href="../assets/css/element.css">
        <link href="https://fonts.googleapis.com/css?family=Open+Sans:300,300i,400,400i,600,600i,700,700i|Raleway:300,300i,400,400i,600,600i,700,700i" rel="stylesheet">

        <link href="../assets/template-2-assets/vendor/aos/aos.css" rel="stylesheet">
        <link href="../assets/template-2-assets/vendor/bootstrap/css/bootstrap.min.css" rel="stylesheet">
        <link href="../assets/template-2-assets/vendor/bootstrap-icons/bootstrap-icons.css" rel="stylesheet">
        <link href="../assets/template-2-assets/vendor/boxicons/css/boxicons.min.css" rel="stylesheet">
        <link href="../assets/template-2-assets/vendor/glightbox/css/glightbox.min.css" rel="stylesheet">
        <link href="../assets/template-2-assets/vendor/swiper/swiper-bundle.min.css" rel="stylesheet">

        <link href="../assets/template-2-assets/css/style.css" rel="stylesheet">

        <title> Ressources Humaines </title>
    </head>
    <body>
        <div class="page-wrapper" id="main-wrapper" data-layout="vertical" data-navbarbg="skin6" data-sidebartype="full"
             data-sidebar-position="fixed" data-header-position="fixed">
            <!-- Sidebar Start -->
            <aside class="left-sidebar">
              <!-- Sidebar scroll-->
              <div>
                <div class="brand-logo d-flex align-items-center justify-content-between">
                  <div class="close-btn d-xl-none d-block sidebartoggler cursor-pointer" id="sidebarCollapse">
                    <i class="ti ti-x fs-8"></i>
                  </div>
                </div>
                <nav class="sidebar-nav scroll-sidebar" data-simplebar="">
                  <ul id="sidebarnav">
                    <li class="nav-small-cap">
                      <i class="ti ti-dots nav-small-cap-icon fs-4"></i>
                      <span class="hide-menu">Home</span>
                    </li>
                    <li class="sidebar-item">
                      <a class="sidebar-link" href="" aria-expanded="false">
                        <span>
                          <i class="ti ti-layout-dashboard"></i>
                        </span>
                        <span class="hide-menu"> Postes </span>
                      </a>
                    </li>
                    <!--<li class="sidebar-item">
                      <a class="sidebar-link" href="./page.jsp?page=poste/poste" aria-expanded="false">
                        <span>
                          <i class="ti ti-layout-dashboard"></i>
                        </span>
                        <span class="hide-menu"> Annonces </span>
                      </a>
                    </li>-->
                  </ul>
                </nav>
              </div>
              <!-- End Sidebar scroll-->
            </aside>
            <div class="body-wrapper">
                <header class="app-header">
                  <nav class="navbar navbar-expand-lg navbar-light">
                    <ul class="navbar-nav">
                      <li class="nav-item d-block d-xl-none">
                        <a class="nav-link sidebartoggler nav-icon-hover" id="headerCollapse" href="javascript:void(0)">
                          <i class="ti ti-menu-2"> </i>
                        </a>
                      </li>
                      <li class="nav-item">
                      </li>
                    </ul>
                  </nav>
                </header>
                <div class="container-fluid">
                    <jsp:include page="<%= pageRequest %>"/>
                </div>
            </div>
        </div>
      <script src="../assets/template-1-assets/libs/jquery/dist/jquery.min.js"></script>
      <script src="../assets/template-1-assets/libs/bootstrap/dist/js/bootstrap.bundle.min.js"></script>
      <script src="../assets/template-1-assets/js/sidebarmenu.js"></script>
      <script src="../assets/template-1-assets/js/app.min.js"></script>
      <script src="../assets/template-1-assets/libs/simplebar/dist/simplebar.js"></script>

      <script src="../assets/js/questionnaire.js"> </script>
      <script src="../assets/js/reponses.js"> </script>

      <script src="../assets/template-2-assets/vendor/aos/aos.js"></script>
      <script src="../assets/template-2-assets/vendor/bootstrap/js/bootstrap.bundle.min.js"></script>
      <script src="../assets/template-2-assets/vendor/glightbox/js/glightbox.min.js"></script>
      <script src="../assets/template-2-assets/vendor/isotope-layout/isotope.pkgd.min.js"></script>
      <script src="../assets/template-2-assets/vendor/swiper/swiper-bundle.min.js"></script>
      <script src="../assets/template-2-assets/vendor/php-email-form/validate.js"></script>

      <script src="../assets/template-2-assets/js/main.js"> </script>
    </body>
</html>
