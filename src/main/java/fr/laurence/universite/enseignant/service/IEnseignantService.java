package fr.laurence.universite.enseignant.service;

import java.util.List;

import fr.laurence.universite.enseignant.domain.Enseignant;

public interface IEnseignantService {
	public List<Enseignant> findAll();
	
	public Enseignant getOneEnseignant(Integer id);
	
	public void supprimer(Integer id);
	
	public Enseignant ajouterEnseignant(Enseignant newEnseignant);
	
	public Enseignant modifierEnseignant(Enseignant modifEnseignant);
	
	
}
