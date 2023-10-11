<%-- 
    Document   : ajout_besoin
    Created on : 29 sept. 2023, 09:20:14
    Author     : HERINIAINA
--%>

<div class="card">
    <div class="card-body">
      <h2 class="card-title fw-semibold mb-4" id="main-title">
        Cr�er un CV
      </h2>
      <div>
        <div class="card-body">
          <form method="post" action="./insertion_critere_cv.html">
            <div class="mb-3">
              <!----------------Choix poste-->
              <label for="poste-input" class="form-label">
                Choix du poste
              </label>
              <select name="poste" id="poste-input" class="form-control input-formulaire">
                  <option value="1">
                    D�veloppeur Back End
                  </option>
                  <option value="2">
                    D�veloppeur Front End
                  </option>
                  <option value="3">
                    Administrateur Syst�me
                  </option>
                  <option value="4">
                    Architecte Logiciel
                  </option>
              </select>
            </div>
            <!----------------Crit�res-->
            <h2 class="card-title fw-semibold mb-4" id="main-title">
              Informations personnelles
            </h2>

            <div class="row critere-poste-line">
              <div class="col-lg-4">
                <label for="poste-horaire-input" class="form-label">
                  Situation matrimoniale
                </label>
              </div>
              <div class="col-lg-4">
                <select name="s_matrimoniale" id="" class="form-control input-formulaire">
                  <option value="1"> C�libataire </option>
                  <option value="2"> Mari�(e) </option>
                </select>
              </div>
            </div>

            <div class="row critere-poste-line">
              <div class="col-lg-4">
                <label for="poste-horaire-input" class="form-label">
                  Dipl�me
                </label>
              </div>
              <div class="col-lg-4">
                <select name="diplome" id="" class="form-control input-formulaire">
                  <option value="1"> CEPE </option>
                  <option value="1"> BEPC </option>
                </select>
              </div>
            </div>

            <div class="row critere-poste-line">
              <div class="col-lg-4">
                <label for="poste-horaire-input" class="form-label">
                  Exp�rience
                </label>
              </div>
              <div class="col-lg-4">
                <select name="experience" id="" class="form-control input-formulaire">
                  <option value="1"> 2 � 3 ans </option>
                  <option value="1"> 3 � 4 ans </option>
                </select>
              </div>
            </div>

            <div class="row critere-poste-line">
              <div class="col-lg-4">
                <label for="poste-horaire-input" class="form-label">
                  Nationalit�
                </label>
              </div>
              <div class="col-lg-4">
                <input name="coef_nat" type="number" min="0" class="form-control input-formulaire">
              </div>
              <div class="col-lg-4">
                <select name="nationalite" id="" class="form-control input-formulaire">
                  <option value="1"> Malagasy </option>
                  <option value="2"> Autre </option>
                </select>
              </div>
            </div>

            <!---<div class="row critere-poste-line">
              <div class="col-lg-4">
                <label for="poste-horaire-input" class="form-label">
                  Adresse
                </label>
              </div>
              <div class="col-lg-4">
                <input name="coeff_adresse" type="number" min="0" class="form-control input-formulaire">
              </div>
              <div class="col-lg-4">
                <input name="critere_adresse" type="number" min="0" class="form-control input-formulaire" placeholder="Distance maximum">
              </div>
            </div>--->

            <button type="submit" class="btn btn-success btn-formulaire">
              Valider
            </button>
          </form>
        </div>
  </div>
</div>
</div>