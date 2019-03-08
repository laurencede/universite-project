console.log("JS chargé !");


//validation formulaire
function validerLeFormulaire() {

	let gradeElement = document.getElementById("grade");
    let grade = gradeElement.value;
    if(grade == ""){
        gradeElement.classList.add("erreur");
    }else{
        gradeElement.classList.remove("erreur");
    }
    
 // check nom
	let nomElement = document.getElementById("nom");
    let nom = nomElement.value;
    if(nom === ""){
        nomElement.classList.add("erreur");
    }else{
        nomElement.classList.remove("erreur");
    }

    // check prenom
    let prenomBlock = document.getElementById("prenom");
    let prenom = prenomBlock.value

    if(prenom === ""){
        prenomBlock.classList.add("erreur");
    }else{
        prenomBlock.classList.remove("erreur");
    }
    
    // check numero
    let numero_enseignantBlock = document.getElementById("numero_enseignant");
    let prenom_enseignant = numero_enseignantBlock.value

    if(prenom_enseignant === ""){
    	numero_enseignantBlock.classList.add("erreur");
    }else{
    	numero_enseignantBlock.classList.remove("erreur");
    }

    // check date_naissance
    let date_naissanceBlock = document.getElementById("date_naissance");
    let date_naissance = date_naissanceBlock.value

    if(date_naissance === ""){
    	date_naissanceBlock.classList.add("erreur");
    }else{
    	date_naissanceBlock.classList.remove("erreur");
    }
    
    // check date_embauche
    let date_embaucheBlock = document.getElementById("date_embauche");
    let date_embauche = date_embaucheBlock.value

    if(date_embauche === ""){
    	date_embaucheBlock.classList.add("erreur");
    }else{
    	date_embaucheBlock.classList.remove("erreur");
    }
    
    // check photo
    let photoBlock = document.getElementById("photo");
    let photo = photoBlock.value

    if(photo === ""){
    	photoBlock.classList.add("erreur");
    }else{
    	photoBlock.classList.remove("erreur");
    }
    
    let lesClassErreur = document.getElementsByClassName("Erreur");
    console.log(lesClassErreur);
    console.log("taille du tableau" +lesClassErreur.length);
    if(lesClassErreur.length == 0){
    	console.log("Envoyer le formulaire")
    }
    document.getElementById("formulaire").submit();
}