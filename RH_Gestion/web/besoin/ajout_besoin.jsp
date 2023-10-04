<%-- 
    Document   : ajout_besoin
    Created on : 29 sept. 2023, 09:20:14
    Author     : HERINIAINA
--%>

<div class="card">
    <div class="card-body">
      <h2 class="card-title fw-semibold mb-4" id="main-title">
        Définissez vos besoins
      </h2>
      <div>
        <div class="card-body">
          <form method="post" action="./insertion_critere_cv.html">
            <div class="mb-3">
              <!----------------Choix poste-->
              <label for="poste-input" class="form-label">
                Titre du poste
              </label>
              <select name="poste" id="poste-input" class="form-control input-formulaire">
                  <option value="1">
                    Développeur Back End
                  </option>
                  <option value="2">
                    Développeur Front End
                  </option>
                  <option value="3">
                    Administrateur Système
                  </option>
                  <option value="4">
                    Architecte Logiciel
                  </option>
              </select>
            </div>
            <!----------------Volume horaire-->
            <div class="mb-3">
              <label for="poste-horaire-input" class="form-label">
                Volume horaire
              </label>
              <div class="row">
                <div class="col-lg-6">
                  <input name="volume_tache" type="number" min="0" class="form-control input-formulaire" id="poste-horaire-input">
                </div>
                <div class="col-lg-6">
                  <select name="unite" id="poste-horaire-frequence-input" class="form-control input-formulaire">
                    <option value="1">
                        Par Semaine
                    </option>
                    <option value="2">
                        Par Mois
                    </option>
                  </select>
                </div>
              </div>
            </div>
            <!----------------Critères-->
            <h2 class="card-title fw-semibold mb-4" id="main-title">
              Critères
            </h2>
            <div class="row">
              <div class="col-lg-4"> </div>
              <div class="col-lg-4">
                <label for="poste-horaire-input" class="form-label">
                  Coefficient
                </label>
              </div>
              <div class="col-lg-4">
                <label for="poste-horaire-input" class="form-label">
                  Critère requis
                </label>
              </div>
            </div>

            <div class="row critere-poste-line">
              <div class="col-lg-4">
                <label for="poste-horaire-input" class="form-label">
                  Situation matrimoniale
                </label>
              </div>
              <div class="col-lg-4">
                <input name="coeff_sm" type="number" min="0" class="form-control input-formulaire">
              </div>
              <div class="col-lg-4">
                <select name="s_matrimoniale" id="" class="form-control input-formulaire">
                  <option value="1"> Célibataire </option>
                  <option value="2"> Marié(e) </option>
                </select>
              </div>
            </div>

            <div class="row critere-poste-line">
              <div class="col-lg-4">
                <label for="poste-horaire-input" class="form-label">
                  Diplôme
                </label>
              </div>
              <div class="col-lg-4">
                <input name="coef_dipl" type="number" min="0" class="form-control input-formulaire">
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
                  Expérience
                </label>
              </div>
              <div class="col-lg-4">
                <input name="coef_exp" type="number" min="0" class="form-control input-formulaire">
              </div>
              <div class="col-lg-4">
                <select name="experience" id="" class="form-control input-formulaire">
                  <option value="1"> 2 à 3 ans </option>
                  <option value="1"> 3 à 4 ans </option>
                </select>
              </div>
            </div>

            <div class="row critere-poste-line">
              <div class="col-lg-4">
                <label for="poste-horaire-input" class="form-label">
                  Nationalité
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