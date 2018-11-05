

//function validation(){

	//var nameValue = document.querySelector("#nom").value;
	//if(nameValue) = ="") {
//	document.querySelector("#error").textContent = " le nom est obligatiore";
//}
//}

 
var validation = document.getElementById("validation"); // nous permet d'acceder à notre id=boutton_envoi
var nom = document.getElementById("nom");
var nom_m = document.getElementById("nom_manquant");

var prénom = document.getElementById("prénom");
var prénom_m = document.getElementById("prénom_manquant");

var naissance = document.getElementById("naissance");
var naissance_m = document.getElementById("date_de_naissance_manquant");

var postal = document.getElementById("postale");
var postale_m= document.getElementById("adresse_postale_manquant"); 

var mail = document.getElementById("mail");
var mail_m= document.getElementById("mail_manquant"); 

validation.addEventListener("click", f_valid);//on cree  un gestionnaire de  validation de type click et on va lui envoyer une fonction f_valid

function f_valid(e) {
	if (nom.validity.valueMissing) { //verifie si le champs nom est vide ou pas
		e.preventDefault(); //si la condition est vrai blocquer l'envoi du formulaire
		document.getElementById("error").removeAttribute("hidden");
	     nom_m.textContent = "Le champs nom est obligatoire";
		
		//nom_m.style.color = "red";
      

	}
	else if (document.getElementById("nom").value.length < 5){
		document.getElementById("error").innerHTML = "le nom doit contenir au moins 5 caracteres";
		document.getElementById("error").removeAttribute("hidden");
	}
	else if (prénom.validity.valueMissing) { 
		e.preventDefault(); 
		document.getElementById("error").removeAttribute("hidden"); 
	    prénom_m.textContent = "Le champs prénom est obligatoire";

		}
		else if (document.getElementById("prénom").value.length < 5){
		document.getElementById("error").innerHTML = "le prénom doit contenir au moins 5 caracteres";
		document.getElementById("error").removeAttribute("hidden");

}
else if (naissance.validity.valueMissing) { 
		e.preventDefault(); 
		document.getElementById("error").removeAttribute("hidden"); 
	   naissance_m.textContent = "Le champs date de naissance  est obligatoire";
}


else if (postale.validity.valueMissing) { 
		e.preventDefault(); 
		document.getElementById("error").removeAttribute("hidden"); 
	   postale_m.textContent = "Le champs adresse postale est obligatoire";

}

else if (mail.validity.valueMissing) { 
		e.preventDefault(); 
		document.getElementById("error").removeAttribute("hidden"); 
	   mail_m.textContent = "Le champs mail est obligatoire";
}
else{
document.getElementById("result").removeAttribute("hidden");
document.getElementById("result").innerHTML = "Bienvenue " +  document.querySelector(" #nom").value;
}
}