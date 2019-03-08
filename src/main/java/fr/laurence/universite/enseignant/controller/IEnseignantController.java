package fr.laurence.universite.enseignant.controller;

import org.springframework.ui.Model;

import fr.laurence.universite.enseignant.domain.Enseignant;

public interface IEnseignantController {
	
	public String findAll(Model model);
	
	public String infosEnseignant(Model model, Integer id); 
	
	public String supprimerEnseignant(Model model, Integer id);
	
	public String ajouterEnseignant(Model model);
		
	public String validerEnseignant(Model model, Enseignant validerEnseignant);
	
	public String modifierEnseignant(Model model, Integer id);
	
	public String validerModifEnseignant(Model model, Enseignant modifEnseignant);
}
