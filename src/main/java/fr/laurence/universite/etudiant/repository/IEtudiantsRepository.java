package fr.laurence.universite.etudiant.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import fr.laurence.universite.etudiant.domain.Etudiants;

public interface IEtudiantsRepository extends JpaRepository<Etudiants, Integer>{
	
}
