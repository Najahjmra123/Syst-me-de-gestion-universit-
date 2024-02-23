package com.example.td.entity.mappers;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import com.example.td.entity.Cours;
import com.example.td.entity.Professeur;
import com.example.td.entity.dto.CoursDto;
import com.example.td.entity.dto.ProfesseurDto;

@Mapper
public interface ProfesseurMapper {
	ProfesseurMapper INSTANCE = Mappers.getMapper(ProfesseurMapper.class);
	ProfesseurDto ProfesseurToProfesseurDto(Professeur professeur);

	Professeur ProfesseurDtoToProffesseur(ProfesseurDto professeur  );

}
