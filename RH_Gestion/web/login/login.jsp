<%-- 
    Document   : login
    Created on : 29 sept. 2023, 09:29:14
    Author     : HERINIAINA
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="../assets/template-1-assets/css/styles.min.css">
        <link rel="stylesheet" href="../assets/css/login.css">
        <title> Login </title>
    </head>
    <body>
      <!--  Body Wrapper -->
      <div class="page-wrapper" id="main-wrapper" data-layout="vertical" data-navbarbg="skin6" data-sidebartype="full"
        data-sidebar-position="fixed" data-header-position="fixed">
        <div
          class="position-relative overflow-hidden radial-gradient min-vh-100 d-flex align-items-center justify-content-center">
          <div class="d-flex align-items-center justify-content-center w-100">
            <div class="row justify-content-center w-100">
              <div class="col-md-8 col-lg-6 col-xxl-3">
                <div class="card mb-0 login-form-card">
                  <div class="card-body">
                    <h2 class="card-title fw-semibold mb-4" id="login-title">
                      Login
                    </h2>
                    <form method="post" action="http://localhost:8080/RH_Gestion/Utilisateur">
                      <div class="mb-3">
                        <label for="exampleInputEmail1" class="form-label">
                          Email
                        </label>
                        <input name="email" type="email" class="form-control login-input" id="exampleInputEmail1" aria-describedby="emailHelp">
                      </div>
                      <div class="mb-4">
                        <label for="exampleInputPassword1" class="form-label">
                          Mot de passe
                        </label>
                        <input name="mdp" type="password" class="form-control login-input" id="exampleInputPassword1">
                      </div>
                      <button type="submit"class="btn btn-primary w-100 py-8 fs-4 mb-4 rounded-2 submit-button submit-button-login">
                        Se connecter
                      </button>
                    </form>
                  </div>
                </div>
              </div>
            </div>
          </div>
        </div>
      </div>
      <script src="../assets/template-1-assets/libs/jquery/dist/jquery.min.js"></script>
      <script src="../assets/template-1-assets/libs/bootstrap/dist/js/bootstrap.bundle.min.js"></script>
    </body>
</html>
