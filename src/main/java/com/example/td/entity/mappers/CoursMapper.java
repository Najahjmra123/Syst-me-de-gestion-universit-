package com.example.td.entity.mappers;



import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import com.example.td.entity.Cours;
import com.example.td.entity.Etudiant;
import com.example.td.entity.dto.CoursDto;
import com.example.td.entity.dto.EtudiantDto;
@Mapper
public interface CoursMapper {

	CoursMapper INSTANCE = Mappers.getMapper(CoursMapper.class);
	CoursDto coursToCoursDto(Cours cours);

	Cours CoursDtoToCours(CoursDto cours );
}