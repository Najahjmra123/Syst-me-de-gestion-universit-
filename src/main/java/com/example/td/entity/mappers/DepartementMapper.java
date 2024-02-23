package com.example.td.entity.mappers;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import com.example.td.entity.Cours;
import com.example.td.entity.Departement;
import com.example.td.entity.dto.CoursDto;
import com.example.td.entity.dto.DepartementDto;

@Mapper
public interface DepartementMapper {

	DepartementMapper INSTANCE = Mappers.getMapper(DepartementMapper.class);
	DepartementDto departementToDepartementDto(Departement departement);

	Departement DepartementDtoToDepartement(DepartementDto departement );
}
