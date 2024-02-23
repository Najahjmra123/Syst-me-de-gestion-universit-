package com.example.td.entity.dto;


import java.util.List;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter

@NoArgsConstructor
@AllArgsConstructor
public class EtudiantDto {
	private long id;
	@NotBlank
	private String nom;
	@NotBlank
	private String prenom;
	@Email
	@NotBlank
	private String email;
	
	private ProfilEtudiantDto ProfilEtudiant;
	private List<CoursDto> cours;
	
	
	
	

}