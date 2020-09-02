package com.projet.liste;

import java.util.Date;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.projet.webapplication.ValidPassword;


@Controller
@SessionAttributes("login")
public class ServiceController {
	
	@Autowired
   ListeAfaireService listAffairService;

	@RequestMapping(value = "/liste", method = RequestMethod.GET)
	public String ListTaches( Model model) {
		model.addAttribute("list", listAffairService.ListeTaches("Mes éléves"));
		
		return "liste";
	}
	@RequestMapping(value="/ajout-liste", method = RequestMethod.GET)
	public String AjoutTache( Model model) {
		
	model.addAttribute("liste", new ListeAfaire(0,"Mes éléves", "TEST", new Date(), false));
		
		return "ajout-liste";
		
	}
	
	@RequestMapping(value="/Bienvenue", method = RequestMethod.GET)
	public String retourBienvenue( Model model) {
		
	//	model.addAttribute("ajouteTache", listAffairService.AjouteTache("Mes éléves", description, new Date(), false));
		
		return "Bienvenue";
		
	}
	

	
	@RequestMapping(value="/ajout-liste", method = RequestMethod.POST)
	public String ListeTacheFinal(@RequestParam String description, @Valid @ModelAttribute("liste") ListeAfaire listeAfaire ,
			BindingResult result){
//		          if(result.hasErrors()) {
//		        	  return "ajout-liste";
//		          }else

	              listAffairService.AjouteTache("Mes éléves", description, new Date(), false);
		
		          return "redirect:liste";
		
	}
	
	@RequestMapping(value="/supprime-tache", method = RequestMethod.GET)
	public String supprimeTache(@RequestParam int id, Model model) {
		
	 listAffairService.Delete(id);
		
		return "redirect:liste";
		
	}
	
	@RequestMapping(value="/modifie-tache", method = RequestMethod.GET)
	public String modifietache(@RequestParam int id, Model model) {
		ListeAfaire tache = listAffairService.recuperTache(id);
	     model.addAttribute("liste", tache);
		
		return "modifie-tache";
		
	}
}
