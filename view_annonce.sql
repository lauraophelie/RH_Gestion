CREATE view v_besoin_poste as (select besoin.id_besoin,poste.nom_poste,poste.id_service,besoin.date_limite from besoin join poste on poste.id_poste=besoin.id_poste); 

-- view besoin poste par service
CREATE view v_poste_service as (select v_besoin_poste.id_besoin,v_besoin_poste.nom_poste,services.nom_service,v_besoin_poste.date_limite from v_besoin_poste join services on v_besoin_poste.id_service=services.id_service);

-- view besoin diplome avec note et niveau
CREATE view v_besoin_diplome as (select diplome.id_diplome,diplome.niveau,diplome.designation,notation_diplome.id_note_dip,notation_diplome.id_besoin,notation_diplome.note from notation_diplome join diplome on diplome.id_diplome=notation_diplome.id_diplome);

-- view besoin nationalite avec note et niveau
CREATE view v_besoin_nationalite as (select nationalite.id_nat,nationalite.niveau,nationalite.designation,notation_nat.id_note_nat,notation_nat.id_besoin,notation_nat.note from notation_nat join nationalite on nationalite.id_nat=notation_nat.id_nat);

--view besoin matrimoniale avec note et niveau
CREATE view v_besoin_matrimoniale as (select s_matrimoniale.id_s_matrimo,s_matrimoniale.niveau,s_matrimoniale.designation,notation_s_mat.id_besoin,notation_s_mat.note from notation_s_mat join s_matrimoniale on s_matrimoniale.id_s_matrimo=notation_s_mat.id_s_mat);

--view besoin experience avec note et niveau
CREATE view v_besoin_experience as (select experience.id_exp,experience.minimum,experience.maximum,experience.niveau,notation_exp.id_besoin,notation_exp.note from notation_exp join experience on experience.id_exp=notation_exp.id_exp);

-- view  diplome experience par besoin
CREATE view v_diplome_exp_by_besoin as (select v_besoin_experience.id_exp,v_besoin_experience.minimum,v_besoin_experience.maximum,v_besoin_experience.niveau as niveau_experience,v_besoin_experience.id_besoin,v_besoin_diplome.id_diplome,v_besoin_diplome.niveau as niveau_diplome,v_besoin_diplome.designation from v_besoin_experience join v_besoin_diplome on v_besoin_experience.id_besoin=v_besoin_diplome.id_besoin);


-- view diplome experience matrimoniale par besoin
CREATE view v_diplome_exp_mat_by_besoin as (select v_diplome_exp_by_besoin.id_exp,v_diplome_exp_by_besoin.minimum,v_diplome_exp_by_besoin,maximum,v_diplome_exp_by_besoin.niveau_experience,v_diplome_exp_by_besoin.id_besoin,v_diplome_exp_by_besoin.niveau_diplome,v_diplome_exp_by_besoin.designation as designation_diplome ,v_besoin_matrimoniale.id_s_matrimo,v_besoin_matrimoniale.niveau as niveau_mat,v_besoin_matrimoniale.designation as designation_mat from v_diplome_exp_by_besoin join v_besoin_matrimoniale on v_diplome_exp_by_besoin.id_besoin=v_besoin_matrimoniale.id_besoin);

CREATE view v_annonce as (select v_diplome_exp_mat_by_besoin.id_besoin,v_diplome_exp_mat_by_besoin.id_exp,v_diplome_exp_mat_by_besoin.minimum as exp_min,v_diplome_exp_mat_by_besoin.maximum as exp_max, v_diplome_exp_mat_by_besoin.niveau_experience,v_diplome_exp_mat_by_besoin.niveau_diplome,v_diplome_exp_mat_by_besoin.designation_diplome,v_diplome_exp_mat_by_besoin.niveau_mat,v_diplome_exp_mat_by_besoin.designation_mat,v_poste_service.nom_poste,v_poste_service.nom_service,v_poste_service.date_limite from v_diplome_exp_mat_by_besoin join v_poste_service on v_diplome_exp_mat_by_besoin.id_besoin=v_poste_service.id_besoin );





