const add_question = document.getElementById('add-question');

var question = document.getElementById('question');
var point_question = document.getElementById('point-question');

const form_questionnaire = document.getElementById('form-questionnaire');

const dataQuestions = [];

var i = 1;

function mettreAJourNumerosQuestions() {
    const rows = form_questionnaire.querySelectorAll('.row');
    let index = 1;
    rows.forEach(row => {
        const numeroElement = row.querySelector('.p-num-question');
        numeroElement.textContent = index;
        index++;
    });
}

add_question.addEventListener('click', function() {
    const row = document.createElement('div');

    row.setAttribute("class", "row");

    const col0 = document.createElement('div');
    const col1 = document.createElement('div');
    const col2 = document.createElement('div');
    const col3 = document.createElement('div');

    col0.setAttribute("class", "col-lg-2");
    col1.setAttribute("class", "col-lg-6");
    col2.setAttribute("class", "col-lg-2");
    col3.setAttribute("class", "col-lg-2");

    var questionValue   = question.value;
    var pointValue      = point_question.value;

    dataQuestions.push({
        numeroQuestion: i,
        question: questionValue,
        nombrePoint: pointValue,
        reponses: []
    });

    const deleteButton = document.createElement('button');

    deleteButton.setAttribute("class", "btn btn-danger bouton-questionnaire");

    deleteButton.innerHTML = "Supprimer";

    deleteButton.addEventListener('click', function() {
        form_questionnaire.removeChild(card);

        const index = dataQuestions.findIndex(q => q.numero === i);
        if (index !== -1) {
            dataQuestions.splice(index, 1);
        }
        mettreAJourNumerosQuestions();
        console.log(dataQuestions);
    });

    const p0 = document.createElement('p');
    const p1 = document.createElement('p');
    const p2 = document.createElement('p');

    p0.setAttribute("class", "p-num-question");

    p1.setAttribute("class", "p-question");
    p2.setAttribute("class", "p-question-point");

    p0.innerHTML = i;
    p1.innerHTML = questionValue;
    p2.innerHTML = pointValue;

    col0.appendChild(p0);
    col1.appendChild(p1);
    col2.appendChild(p2);

    col3.appendChild(deleteButton);

    row.appendChild(col0);
    row.appendChild(col1);
    row.appendChild(col2);
    row.appendChild(col3);

    const card = document.createElement('div');

    card.setAttribute("class", "card-body");
    card.appendChild(row);

    console.log(card);

    form_questionnaire.appendChild(card);
    i++;

    console.log(dataQuestions);
});

// envoi questions, ajout questionnaire

const validerQuestion = document.getElementById("btn-valider-questions");

validerQuestion.addEventListener("click", function(e) {
    e.preventDefault();

    if(dataQuestions.length != 0) {
        var data = JSON.stringify(dataQuestions);

        $.ajax({
            url: "http://localhost:8080/RH_Gestion/Questionnaire",
            method: 'POST',
            data: {
                besoin: 1
            },
            success: function(response) {
                window.location.href = "./page.jsp?page=questionnaire/reponses&data=" + encodeURIComponent(data);
            },
            error: function(xhr, status, error) {
                window.location.href = "./page.jsp?page=questionnaire/questions&error" + error;
                console.error("Error: " + xhr.responseText);
            }
        });
    }
});
