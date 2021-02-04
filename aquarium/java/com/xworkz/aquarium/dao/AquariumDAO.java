package com.xworkz.aquarium.dao;

import java.util.List;

import com.xworkz.aquarium.dto.AquariumDTO;

public interface AquariumDAO {

	boolean save(AquariumDTO dto);

	boolean updateShapeByNoOfFish(String shape, int noOfFish);

	boolean deleteByShape(String shape);

	boolean saveMultipleValues(List<AquariumDTO> dtos);

	int size();

}
