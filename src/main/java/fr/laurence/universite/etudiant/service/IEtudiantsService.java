package fr.laurence.universite.etudiant.service;

import java.util.List;

import fr.laurence.universite.etudiant.domain.Etudiants;

public interface IEtudiantsService {
	
	public List<Etudiants> findAll();
	
	public Etudiants getOneEtudiants(Integer id);
	
	public void supprimer (Integer id);
	
	public Etudiants ajouterEnseignant(Etudiants newEtudiant);
	
}
