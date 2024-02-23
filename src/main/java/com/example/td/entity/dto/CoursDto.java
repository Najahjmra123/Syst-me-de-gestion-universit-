package com.example.td.entity.dto;

import java.util.HashSet;
import java.util.Set;

import com.example.td.entity.Etudiant;
import com.example.td.entity.Professeur;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Positive;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CoursDto {
	private long id;
	@NotBlank
	private String nom;
	@Positive
	private int credit;
	private Professeur professeur;
	
	private Set<Etudiant> etudiants=new HashSet<Etudiant>();

}
