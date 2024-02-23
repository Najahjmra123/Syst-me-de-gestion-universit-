package com.example.td.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.td.entity.Professeur;

public interface ProfesseurRepository extends JpaRepository<Professeur, Long> {
	List<Professeur> findByNom(String nom);
	List<Professeur> findBySpecialite(String specialite);
}
