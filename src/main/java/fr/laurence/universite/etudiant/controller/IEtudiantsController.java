package fr.laurence.universite.etudiant.controller;

import org.springframework.ui.Model;

public interface IEtudiantsController {
	
	public String findAll(Model model);

	public String infosEtudiant (Model model, Integer id);
	
	public String supprimerEtudiant (Model model, Integer id);
	
	public String ajouterEtudiant (Model model);
}
