package fr.laurence.universite.enseignant.controller.impl;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import fr.laurence.universite.enseignant.controller.IEnseignantController;
import fr.laurence.universite.enseignant.domain.Enseignant;
import fr.laurence.universite.enseignant.service.impl.EnseignantServiceImpl;

@Controller
public class EnseignantControllerImpl implements IEnseignantController{
	Logger log = LoggerFactory.getLogger(EnseignantControllerImpl.class);
	
	@Autowired
	EnseignantServiceImpl es;
	
	@Override
	@GetMapping("/enseignants")
	public String findAll(Model model) {
		List<Enseignant> liste = es.findAll();
		model.addAttribute("listeEnseignants", liste);
		return "enseignant/enseignants";
	}

	@Override
	@GetMapping("/enseignant-infos")
	public String infosEnseignant(Model model, Integer id) {
		Enseignant OneEnseignant = es.getOneEnseignant(id);
		model.addAttribute("enseignant", OneEnseignant);
		return "enseignant/enseignant-infos";
	}

	@Override
	@GetMapping("/supprimer-enseignant")
	public String supprimerEnseignant(Model model, Integer id) {
		es.supprimer(id);
		return "redirect:/enseignants";
	}

	@Override
	@GetMapping("/ajouter-enseignant-formulaire")
	public String ajouterEnseignant(Model model) {
		Enseignant ajouterEnseignant = new Enseignant();
		model.addAttribute("newEnseignant", ajouterEnseignant);
		return "enseignant/ajouter-enseignant-formulaire";
	}

	@Override
	@PostMapping("/valider-enseignant")
	public String validerEnseignant(Model model, @ModelAttribute Enseignant validerEnseignant) {
		log.info("Nom enseignant : {}", validerEnseignant.getNom());
		log.info("Nom enseignant : {}", validerEnseignant.getPrenom());
		log.info("Nom enseignant : {}", validerEnseignant.getNumero_enseignant());
		log.info("Nom enseignant : {}", validerEnseignant.getDate_naissance());
		log.info("Nom enseignant : {}", validerEnseignant.getDate_embauche());
		log.info("Nom enseignant : {}", validerEnseignant.getGrade());
		log.info("Nom enseignant : {}", validerEnseignant.getSexe());
		log.info("Nom enseignant : {}", validerEnseignant.getPhoto());
		//appel du service pour sauvegarder dans la base de données
		
		Enseignant en = es.ajouterEnseignant(validerEnseignant);
		
		if(en == null) {
			return "redirect:/ajouter-enseignant-formulaire";
		}else {
			return "redirect:/enseignants";
		}

	}

	@Override
	@GetMapping("/modifier-enseignant")
	public String modifierEnseignant(Model model, @RequestParam("id") Integer id) {
		Enseignant modifEnseignant = es.getOneEnseignant(id);
		model.addAttribute("modifEnseignant", modifEnseignant);
		return "enseignant/modifier-enseignant-formulaire";
	}

	@Override
	@PostMapping("/valider-correction-enseignant")
	public String validerModifEnseignant(Model model, @ModelAttribute Enseignant modifEnseignant) {
		es.modifierEnseignant(modifEnseignant);
		return "redirect:/enseignants";
	}



}
