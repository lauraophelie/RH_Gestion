var urlParams   = new URLSearchParams(window.location.search);
var jsonData    = urlParams.get('data');

const questions         = JSON.parse(jsonData);
const reponse_container = document.getElementById("reponse-container");

console.log(questions);

for (let i = 0; i < questions.length; i++) {
    const element           = questions[i];

    const numeroQuestion    = element.numeroQuestion;
    const question          = element.question;
    const point             = element.nombrePoint;

    const card              = document.createElement("div");
    const cardHeader        = document.createElement("div");
    const cardBody          = document.createElement("div");

    const idCardBody        = "reponse_display_" + i;

    card.setAttribute("class", "card");
    cardHeader.setAttribute("class", "card-header");
    cardBody.setAttribute("class", "card-body reponse-display");
    cardBody.setAttribute("id", idCardBody);

    cardHeader.innerHTML    = numeroQuestion;

    const row   = document.createElement("div");

    row.setAttribute("class", "row");

    const col1  = document.createElement("div");
    const col2  = document.createElement("div");

    col1.setAttribute("class", "col-lg-10");
    col2.setAttribute("class", "col-lg-2");

    const p1    = document.createElement("p");

    p1.setAttribute("class", "card-text");
    p1.innerHTML = question;

    const btn       = document.createElement("button");
    const idBtn     = i;

    btn.setAttribute("class", "btn btn-outline-secondary btn-add-reponse");
    btn.setAttribute("id", idBtn);

    btn.innerHTML = "Réponse";

    col1.appendChild(p1);
    col2.appendChild(btn);

    row.appendChild(col1);
    row.appendChild(col2);

    cardBody.appendChild(row);

    card.appendChild(cardHeader);
    card.appendChild(cardBody);

    reponse_container.appendChild(card);
}

// popup

const addReponse        = document.querySelectorAll(".btn-add-reponse");
const popupReponse      = document.getElementById("popup-reponse");
const reponseText       = document.getElementById("input-reponse");
const solutionReponse   = document.getElementById("input-solution-reponse");
const addReponseInput   = document.getElementById("btn-add-reponse-question"); 

var l = 1;
var idClick;
var n = {};

addReponse.forEach((btn) => {
    btn.addEventListener("click", () => {
        popupReponse.style.display  = "block";
        
        idClick = Number(btn.id);

        const questionDisplay       = document.getElementById("popup-question");
        questionDisplay.innerHTML   = questions[idClick].question;

        if (!n[idClick]) {
            n[idClick] = 1;
        }
    });
});

addReponseInput.addEventListener("click", () => {
    const reponseValue  = reponseText.value;
    const solutionValue = solutionReponse.value;

    questions[idClick].reponses.push({
        numeroReponse: n[idClick],
        reponse: reponseValue,
        solution: solutionValue
    });

    const idCard                = "reponse_display_" + idClick;
    const cardReponse           = document.getElementById(idCard);
    const rowReponse            = document.createElement("div");
    const rowContainerReponse   = document.createElement("div");

    rowContainerReponse.setAttribute("class", "row container-reponse");
    rowReponse.setAttribute("class", "row");

    const p0 = document.createElement("p");
    const p1 = document.createElement("p");

    p0.setAttribute("class", "num-reponse");

    p0.innerHTML = n[idClick];
    p1.innerHTML = reponseValue;

    if(solutionValue == "false") {
        p0.style.color = "red";
        p1.style.color = "red";
    } else if(solutionValue == "true") {
        p0.style.color = "green";
        p1.style.color = "green";
    }

    const c0 = document.createElement("div");
    const c1 = document.createElement("div");

    c0.setAttribute("class", "col-lg-2");
    c1.setAttribute("class", "col-lg-8");

    c0.appendChild(p0);
    c1.appendChild(p1);

    rowReponse.appendChild(c0);
    rowReponse.appendChild(c1);

    rowContainerReponse.appendChild(rowReponse);
    cardReponse.appendChild(rowContainerReponse);

    n[idClick]++;
    
    popupReponse.style.display = "none";
    console.log(questions);
});

// close popup


// envoi questionnaire 

const validerQuestionnaire = document.getElementById("btn-valider-reponse");

validerQuestionnaire.addEventListener("click", function(e) {
    e.preventDefault();

    if(questions != null) {
        $.ajax({
            url: "http://localhost:8080/RH_Gestion/Reponse",
            method: 'POST',
            data: JSON.stringify(questions),
            contentType: 'application/json',
            success: function(response) {
                window.location.href = "./page.jsp?page=questionnaire/questions";
            },
            error: function(xhr, status, error) {
                console.error("Error: " + xhr.responseText);
            }
        });
    }
});



