<%@page contentType="text/html" pageEncoding="UTF-8"%>
    <div class="card">
        <div class="card-body">
            <h2 class="card-title fw-semibold mb-4" id="main-title">
                Insertion question 
            </h2>
            <div id="form-questionnaire">
                <div class="card-body">
                    <div class="mb-3">
                        <label for="question" class="form-label">
                            Question
                        </label>
                        <textarea name="" id="question" cols="20" rows="10" class="form-control input-question"></textarea>

                        <label for="point-question" class="form-label" id="label2">
                            Nombre de point
                        </label>
                        <input type="number" name="" id="point-question" class="form-control">

                        <button type="submit" class="btn btn-success btn-formulaire" id="add-question">
                            Ajouter
                        </button>
                    </div>
                </div>
            </div>
        </div>
    </div>
    <button type="submit" class="btn btn-success btn-formulaire btn-valider-questionnaire" id="btn-valider-questions">
        Valider
    </button>