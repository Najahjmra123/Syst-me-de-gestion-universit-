package com.example.td.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.td.entity.Cours;

public interface CoursRepository extends JpaRepository<Cours, Long> {
	List<Cours> findByNom(String nom);

	}