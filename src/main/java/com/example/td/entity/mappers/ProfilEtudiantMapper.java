package com.example.td.entity.mappers;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import com.example.td.entity.Cours;
import com.example.td.entity.ProfilEtudiant;
import com.example.td.entity.dto.CoursDto;
import com.example.td.entity.dto.ProfilEtudiantDto;

@Mapper
public interface ProfilEtudiantMapper {
	ProfilEtudiantMapper INSTANCE = Mappers.getMapper(ProfilEtudiantMapper.class);
	ProfilEtudiantDto coursToProfilEtudiantDto(ProfilEtudiant profilEtudiant);

	ProfilEtudiant ProfilEtudiantDtoToProfilEtudiant(ProfilEtudiantDto profilEtudiant );
	
}
