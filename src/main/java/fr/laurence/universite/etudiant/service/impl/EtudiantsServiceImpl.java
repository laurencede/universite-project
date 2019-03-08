package fr.laurence.universite.etudiant.service.impl;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.laurence.universite.etudiant.domain.Etudiants;
import fr.laurence.universite.etudiant.repository.IEtudiantsRepository;
import fr.laurence.universite.etudiant.service.IEtudiantsService;

@Service
public class EtudiantsServiceImpl implements IEtudiantsService{
	Logger log = LoggerFactory.getLogger(EtudiantsServiceImpl.class);
	
	@Autowired
	IEtudiantsRepository ier;
	
	@Override
	public List<Etudiants> findAll() {
		List<Etudiants> listeEtudiants = (List<Etudiants>)
		ier.findAll();

		for (int i = 0; i <listeEtudiants.size(); i++) {
		Etudiants e = listeEtudiants.get(i);
		log.info("Image de l'étudiant : {}", e.getPhoto());
		
		if(e.getPhoto() == null || e.getPhoto().equals("")) {
		listeEtudiants.get(i).setPhoto("/images/imageDefaut.png");
		}		
		}
		return listeEtudiants;
	}

	@Override
	public Etudiants getOneEtudiants(Integer id) {
		Etudiants etudiantInfos = ier.getOne(id);
		if(etudiantInfos.getPhoto() == null || etudiantInfos.getPhoto().equals("")) {
			etudiantInfos.setPhoto("/images/imageDefaut.png");
		}
		return etudiantInfos;
	}

	@Override
	public void supprimer(Integer id) {
		ier.deleteById(id);	
	}

	@Override
	public Etudiants ajouterEnseignant(Etudiants newEtudiant) {
		Etudiants nouvelEtudiant = ier.save(newEtudiant);
		return nouvelEtudiant;
	}
	
	



}
