package com.example.td.entity.mappers;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import com.example.td.entity.Etudiant;
import com.example.td.entity.dto.EtudiantDto;

@Mapper
public interface EtudiantMapper {

	EtudiantMapper INSTANCE = Mappers.getMapper(EtudiantMapper.class);
	EtudiantDto etudiantToEtudiantDto(Etudiant etudiant);

	Etudiant EtudiantDtoToEtudiant(EtudiantDto etudiant );
	
}
