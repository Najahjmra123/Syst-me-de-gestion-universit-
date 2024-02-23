package com.example.td.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.td.entity.Etudiant;
import com.example.td.entity.dto.EtudiantDto;
import com.example.td.entity.mappers.EtudiantMapper;
import com.example.td.repo.EtudiantRepository;

public class EtudiantServiceImplement implements EtudiantService {
	@Autowired
	EtudiantRepository etudiantRepository;

	@Override
	public EtudiantDto addOneEtudiant(Etudiant etudiant) {
		// TODO Auto-generated method stub
		return EtudiantMapper.INSTANCE.etudiantToEtudiantDto(etudiantRepository.save(etudiant));
	}

	@Override
	public List<EtudiantDto> getAllEtudiants() {
		// TODO Auto-generated method stub
		List<EtudiantDto> etudiants=new ArrayList<EtudiantDto>();
		etudiantRepository.findAll().forEach(st->{
			etudiants.add(EtudiantMapper.INSTANCE.etudiantToEtudiantDto(st));
		});
		return etudiants;
	}

	@Override
	public Optional<EtudiantDto> findOneEtudiant(long id) {
		// TODO Auto-generated method stub
		return Optional.ofNullable(EtudiantMapper.INSTANCE.etudiantToEtudiantDto(etudiantRepository.findById(id).get()));
	}

	@Override
	public Optional<EtudiantDto> findEtudiantWithEmail(String email) {
		// TODO Auto-generated method stub
		return Optional.ofNullable(EtudiantMapper.INSTANCE.etudiantToEtudiantDto(etudiantRepository.findByEmail(email).get()));	}
	

	@Override
	public List<EtudiantDto> findOneWithName(String name) {
		// TODO Auto-generated method stub
		List<EtudiantDto> students=new ArrayList<EtudiantDto>();
		etudiantRepository.findByNom(name).forEach(st->
		{
			students.add(EtudiantMapper.INSTANCE.etudiantToEtudiantDto(st));
		}
				);
		return students;	}

	@Override
	public void DeleteOneEtudiant(long id) {
		// TODO Auto-generated method stub
		
	}

}
