package com.example.td.service;

import java.util.List;
import java.util.Optional;

import com.example.td.entity.Etudiant;
import com.example.td.entity.dto.EtudiantDto;

public interface EtudiantService {
	public EtudiantDto addOneEtudiant(Etudiant etudiant );
	public List<EtudiantDto> getAllEtudiants();
	public Optional<EtudiantDto> findOneEtudiant(long id);
	public Optional<EtudiantDto> findEtudiantWithEmail(String email);
	public List<EtudiantDto> findOneWithName(String name);
	public void DeleteOneEtudiant(long id);


}
