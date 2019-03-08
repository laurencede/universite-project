package fr.laurence.universite.enseignant.service.impl;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.laurence.universite.enseignant.domain.Enseignant;
import fr.laurence.universite.enseignant.repository.IEnseignantRepository;
import fr.laurence.universite.enseignant.service.IEnseignantService;

@Service
public class EnseignantServiceImpl implements IEnseignantService{
		Logger log = LoggerFactory.getLogger(EnseignantServiceImpl.class);
		
		@Autowired
		IEnseignantRepository er;

		@Override
		public List<Enseignant> findAll() {
			List<Enseignant> listeEnseignants = (List<Enseignant>)
			er.findAll();
			// vérifier l'image pour chaque enseignant
			// si l'enseignant ne possède pas d'image on lui donne une image par défaut
			// imageDefaut.png ou url
			for (int i = 0; i < listeEnseignants.size(); i++) {
				Enseignant e = listeEnseignants.get(i);
				log.info("Image de l'enseignant : {}", e.getPhoto());
				if(e.getPhoto() == null || e.getPhoto().equals("")) {
				listeEnseignants.get(i).setPhoto("/images/imageDefaut.png");
			}
			}
			return listeEnseignants;
		}

		@Override
		public Enseignant getOneEnseignant(Integer id) {
			Enseignant enseignantInfos = er.getOne(id);
			// afficher une photos si l'enseignant n'en a pas
			if(enseignantInfos.getPhoto() == null || enseignantInfos.getPhoto().equals("")) {
				enseignantInfos.setPhoto("/images/imageDefaut.png");
			}
			return enseignantInfos;
		}

		@Override
		public void supprimer(Integer id) {
			er.deleteById(id);
			
		}

		@Override
		public Enseignant ajouterEnseignant(Enseignant newEnseignant) {
			Enseignant nouvelEnseignant= er.save(newEnseignant);
			return nouvelEnseignant;
		}

		@Override
		public Enseignant modifierEnseignant(Enseignant modifEnseignant) {
			Enseignant enseignantModifier = er.save(modifEnseignant);
			return enseignantModifier;
		}




}
