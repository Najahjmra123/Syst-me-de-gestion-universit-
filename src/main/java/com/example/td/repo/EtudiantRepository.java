package com.example.td.repo;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.td.entity.Etudiant;

public interface EtudiantRepository  extends JpaRepository<Etudiant, Long> {
	List<Etudiant> findByNom(String nom);
	Optional<Etudiant> findByEmail(String email);

}
