<%@page contentType="text/html" pageEncoding="UTF-8"%>
    <div class="containter-fluid" id="reponse-container">
        <!--- affichage question --->
    </div>
    <div class="card popup-reponse" id="popup-reponse">
      <div class="popup-reponse-content">
        <div class="card-header">
          <div class="row">
            <div class="col-lg-10">
              <p id="popup-question"> Question </p>
            </div>
            <div class="col-lg-2">
              <button type="button" class="btn btn-outline-link m-1 btn-close-reponse-popup">
                Fermer
              </button>
            </div>
          </div>
        </div>
        <div class="card-body">
            <div class="row">
              <div class="col-lg-9">
                <input type="text" name="" id="input-reponse" class="form-control input-reponse" placeholder="RÃ©ponse">
              </div>
              <div class="col-lg-3">
                <select name="" id="input-solution-reponse" class="form-control input-solution-reponse">
                  <option value="true"> Vrai </option>
                  <option value="false"> Faux </option>
                </select>
              </div>
            </div>
            <div class="row valider-reponse">
              <div class="col-lg-12">
                <button type="submit" class="btn btn-outline-success btn-add-reponse-question" id="btn-add-reponse-question">
                  Ajouter
                </button>
              </div>
            </div>
        </div>
      </div>
    </div>
    <button type="submit" class="btn btn-success btn-formulaire btn-valider-questionnaire" id="btn-valider-reponse">
        Valider
    </button>