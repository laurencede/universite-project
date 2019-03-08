package fr.laurence.universite.enseignant.domain;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name="t_enseignant")
public class Enseignant {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="ID")
	private Integer id;
	
	@Column(name="NUMERO_ENSEIGNANT")
	private Integer numero_enseignant;
	
	@Column(name="NOM")
	private String nom;
	
	@Column(name="PRENOM")
	private String prenom;
	
	@Column(name="DATE_NAISSANCE")
	@DateTimeFormat(pattern="yyyy-MM-dd")
	private Date date_naissance;
	
	@Column(name="SEXE")
	private Character sexe;
	
	@Column(name="GRADE")
	private String grade;
	
	@Column(name="DATE_EMBAUCHE")
	@DateTimeFormat(pattern="yyyy-MM-dd")
	private Date date_embauche;

	@Column(name="PHOTO")
	private String photo;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getNumero_enseignant() {
		return numero_enseignant;
	}

	public void setNumero_enseignant(Integer numero_enseignant) {
		this.numero_enseignant = numero_enseignant;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public Date getDate_naissance() {
		return date_naissance;
	}

	public void setDate_naissance(Date date_naissance) {
		this.date_naissance = date_naissance;
	}

	public Character getSexe() {
		return sexe;
	}

	public void setSexe(Character sexe) {
		this.sexe = sexe;
	}

	public String getGrade() {
		return grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}

	public Date getDate_embauche() {
		return date_embauche;
	}

	public void setDate_embauche(Date date_embauche) {
		this.date_embauche = date_embauche;
	}

	public String getPhoto() {
		return photo;
	}

	public void setPhoto(String photo) {
		this.photo = photo;
	}
	
	
	

	
	
}
