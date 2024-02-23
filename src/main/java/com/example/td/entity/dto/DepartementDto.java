package com.example.td.entity.dto;


import java.util.HashSet;
import java.util.Set;

import com.example.td.entity.Professeur;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Positive;

public class DepartementDto {
	private long id;
	@NotBlank
	private String nom;
	@Positive
	private double budget;
	private Set<Professeur> professeurs=new HashSet<Professeur>();

}