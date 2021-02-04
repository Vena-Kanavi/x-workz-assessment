package com.xworkz.aquarium;

import java.util.ArrayList;
import java.util.List;

import com.xworkz.aquarium.dao.AquariumDAO;
import com.xworkz.aquarium.dao.AquariumDAOImpl;
import com.xworkz.aquarium.dto.AquariumDTO;
import com.xworkz.aquarium.service.AquariumService;
import com.xworkz.aquarium.service.AquariumServiceImpl;

public class ValidationTester {

	public static void main(String[] args) {
		AquariumDAO dao = new AquariumDAOImpl();
		AquariumService service = new AquariumServiceImpl(dao);

		AquariumDTO dto = new AquariumDTO(4, 250, "square");

		service.validateAndSave(dto);

		AquariumDTO dto2 = new AquariumDTO(2, 150, "round");
		service.validateAndSave(dto2);

		AquariumDTO dto3 = new AquariumDTO(5, 200, "rectangle");
		service.validateAndSave(dto3);

		List<AquariumDTO> list = new ArrayList<AquariumDTO>();
		list.add(dto);
		list.add(dto2);
		list.add(dto3);

		service.validateAndSaveMultipleValues(list);

		service.validateAndUpdateShapeByNoOfFish("square", 5);

		System.out.println("before deleting shape " + service.validateSize());

		service.validateAndDeleteByShape("round");

		System.out.println("after deleting shape " + service.validateSize());

	}

}
