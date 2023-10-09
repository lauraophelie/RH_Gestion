----------------------------- 05/10/2023 ---------------------------------------

CREATE  TABLE questionnaire ( 
	id                   integer  NOT NULL ,
	id_besoin            integer   REFERENCES besoin(id_besoin),
	date_creation        date DEFAULT now(),
	CONSTRAINT pk_questionnaire_id PRIMARY KEY ( id )
 );

CREATE  TABLE question ( 
	id                   serial  NOT NULL ,
	id_questionnaire     integer   REFERENCES questionnaire ( id ),
	numero_question      integer   ,
	question             text  NOT NULL ,
	nombre_point         integer DEFAULT 1 NOT NULL ,
	CONSTRAINT pk_question_id PRIMARY KEY ( id )
 );

CREATE  TABLE reponse ( 
	id_question          integer   REFERENCES question (id),
	numero_reponse 		 integer,
	reponse              text  NOT NULL ,
	solution             bool DEFAULT false NOT NULL
 );