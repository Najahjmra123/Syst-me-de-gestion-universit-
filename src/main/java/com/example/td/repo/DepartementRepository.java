package com.example.td.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.td.entity.Departement;

public interface DepartementRepository extends JpaRepository<Departement, Long> {
	List<Departement> findByNom(String nom);

	}
