package com.example.td.entity.dto;
import com.example.td.entity.Departement;

import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ProfesseurDto {
	private long id;
	@NotBlank
	private String nom,specialite;
	@NotBlank
	private Departement departement;


}