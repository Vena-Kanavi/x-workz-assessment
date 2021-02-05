package com.xworkz.aquarium.service;

import java.util.List;

import com.xworkz.aquarium.dao.AquariumDAO;
import com.xworkz.aquarium.dto.AquariumDTO;

public class AquariumServiceImpl implements AquariumService {

	private AquariumDAO dao;

	public AquariumServiceImpl(AquariumDAO dao) {
		this.dao = dao;
	}

	@Override
	public boolean validateAndSave(AquariumDTO dto) {
		boolean validData = false;
		System.out.println("invoked validate and save method");
		if (dto != null) {
			System.out.println("can add values");
			int noOfFish = dto.getNoOfFish();
			if (noOfFish > 0 && noOfFish <= 5) {
				System.out.println("valid data");
				validData = true;
			} else {
				System.out.println("data is invalid");
				validData = false;
			}
			if (validData) {
				double price = dto.getPrice();
				if (price > 0 && price <= 500) {
					System.out.println("valid data");
					validData = true;
				} else {
					System.out.println("invalid data");
					validData = false;
				}
			}
			if (validData) {
				String shape = dto.getShape();
				if (shape != null && shape.length() <= 10 && !shape.isEmpty() && !shape.contains(" ")) {
					System.out.println("valid data");
					validData = true;
				} else {
					System.out.println("invalid data");
					validData = false;
				}
			}
			if (validData) {
				System.out.println("all data is valid can save");
				this.dao.save(dto);
				// System.out.println("data saved " + dto);
			}
		}
		// System.out.println("there are no elements to add");
		return false;
	}

	@Override
	public boolean validateAndUpdateShapeByNoOfFish(String shape, int noOfFish) {
		System.out.println("invoked validateAndUpdateShapeByNoOfFish method");
		if (shape != null && shape.length() <= 10 && !shape.isEmpty() && !shape.contains(" ") && noOfFish > 0
				&& noOfFish <= 5) {
			System.out.println("can update shape");
			this.dao.updateShapeByNoOfFish(shape, noOfFish);
			return true;
		} else {
			System.out.println("can not update shape");
		}
		return false;
	}

	@Override
	public boolean validateAndDeleteByShape(String shape) {
		System.out.println("invoked validateAndDeleteByShape");
		if (shape != null && shape.length() <= 10 && !shape.isEmpty() && !shape.contains(" ")) {
			this.dao.deleteByShape(shape);
			return true;
		} else {
			System.out.println("can not delete shape");
		}
		return false;
	}

	@Override
	public boolean validateAndSaveMultipleValues(List<AquariumDTO> dtos) {
		boolean valid = false;
		System.out.println("invoked validateAndSaveMultipleValues");
		if (dtos != null && dtos.size() >= 0) {
			int size = dtos.size();
			int tempSize = 0;
			boolean saved = dao.saveMultipleValues(dtos);
			if (saved) {
				System.out.println("dto not saved");
				valid = false;
			} else {
				System.out.println("dto saved");
				tempSize++;
			}
			if (tempSize == size) {
				valid = true;
			}
		}
		return valid;
	}

	@Override
	public int validateSize() {
		return this.dao.size();
	}

	@Override
	public List<AquariumDTO> validateAndGetAll() {
		return this.dao.getAll();
	}

	@Override
	public int validateAndGetByNoOfFish(int noOfFish) {
		System.out.println("invoked validateAndGetByNoOfFish");
		if(noOfFish>0 && noOfFish<=5) {
			this.dao.getByNoOfFish(noOfFish);
		}
		return 0;
	}

}
