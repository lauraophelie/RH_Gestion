<%-- 
    Document   : note_exp
    Created on : 29 sept. 2023, 09:21:04
    Author     : HERINIAINA
--%>

<div class="card">
    <div class="card-body">
      <h2 class="card-title fw-semibold mb-4" id="main-title">
        Notation expérience
      </h2>
      <div>
        <div class="card-body">
          <form>
            <div class="row">
              <div class="col-lg-4">
                <label for="poste-horaire-input" class="form-label"> 
                  Minimum
                </label>
              </div>
              <div class="col-lg-4">
                <label for="poste-horaire-input" class="form-label">
                  Maximum
                </label>
              </div>
              <div class="col-lg-4">
                <label for="poste-horaire-input" class="form-label">
                  Note
                </label>
              </div>
            </div>

            <div class="row critere-poste-line">
              <div class="col-lg-4">
                <input type="text" min="0" class="form-control input-formulaire" value="0" readonly>
              </div>
              <div class="col-lg-4">
                <input type="text" min="0" class="form-control input-formulaire" value="3" readonly>
              </div>
              <div class="col-lg-4">
                <input type="number" min="0" class="form-control input-formulaire">
              </div>
            </div>

            <div class="row critere-poste-line">
                <div class="col-lg-4">
                  <input type="text" min="0" class="form-control input-formulaire" value="3" readonly>
                </div>
                <div class="col-lg-4">
                  <input type="text" min="0" class="form-control input-formulaire" value="5" readonly>
                </div>
                <div class="col-lg-4">
                  <input type="number" min="0" class="form-control input-formulaire">
                </div>
            </div>

            <div class="row critere-poste-line">
                <div class="col-lg-4">
                  <input type="text" min="0" class="form-control input-formulaire" value="5" readonly>
                </div>
                <div class="col-lg-4">
                  <input type="text" min="0" class="form-control input-formulaire" value="7" readonly>
                </div>
                <div class="col-lg-4">
                  <input type="number" min="0" class="form-control input-formulaire">
                </div>
            </div>

            <button type="submit" class="btn btn-success btn-validation-critere">
              Suivant
            </button>
          </form>
        </div>
      </div>
    </div>
</div>