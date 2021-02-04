package com.xworkz.aquarium;

import java.util.ArrayList;
import java.util.List;

import com.xworkz.aquarium.dao.AquariumDAO;
import com.xworkz.aquarium.dao.AquariumDAOImpl;
import com.xworkz.aquarium.dto.AquariumDTO;

public class AquariumTester {

	public static void main(String[] args) {

		AquariumDAO dao = new AquariumDAOImpl();

		AquariumDTO dto = new AquariumDTO(4, 150, "square");
		dao.save(dto);

		AquariumDTO dto2 = new AquariumDTO(2, 100, "round");
		dao.save(dto2);
		AquariumDTO dto3 = new AquariumDTO(5, 400, "rectangle");
		dao.save(dto3);

		List<AquariumDTO> dtos = new ArrayList<AquariumDTO>();
		dtos.add(dto);
		dtos.add(dto2);
		dtos.add(dto3);
		dao.saveMultipleValues(dtos);

		dao.updateShapeByNoOfFish("square", 5);

		System.out.println("size of list before deleting " + dao.size());
		dao.deleteByShape("square");

		System.out.println("size of list after deleting " + dao.size());

	}

}
