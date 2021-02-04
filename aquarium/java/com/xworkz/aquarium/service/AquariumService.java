package com.xworkz.aquarium.service;

import java.util.List;

import com.xworkz.aquarium.dto.AquariumDTO;

public interface AquariumService {
	boolean validateAndSave(AquariumDTO dto);

	boolean validateAndUpdateShapeByNoOfFish(String shape, int noOfFish);

	boolean validateAndDeleteByShape(String shape);

	boolean validateAndSaveMultipleValues(List<AquariumDTO> dtos);

	int validateSize();
}
