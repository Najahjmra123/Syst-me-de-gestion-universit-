package com.example.td.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.PrimaryKeyJoinColumn;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Builder
@Getter
@Setter

@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@JsonIgnoreProperties({"hibernateLazyInitialiser","handler"})
public class Etudiant extends Audit{
	private String nom;
	private String email;
	private Date date;
	
	@OneToOne(mappedBy = "etudiant",cascade = CascadeType.ALL)
	@PrimaryKeyJoinColumn
	@JsonIgnoreProperties("etudiant")
	private  ProfilEtudiant profiletudiant; 
	
	@ManyToMany(mappedBy = "etudiants",cascade = CascadeType.MERGE)
	@JsonIgnoreProperties(value = "etudiants")
	private List<Cours> cours=new ArrayList<Cours>();
	

}
