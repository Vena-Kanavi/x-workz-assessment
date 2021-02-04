package com.xworkz.aquarium.dao;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import com.xworkz.aquarium.dto.AquariumDTO;

public class AquariumDAOImpl implements AquariumDAO {

	private List<AquariumDTO> list;

	public AquariumDAOImpl() {
		this.list = new ArrayList<AquariumDTO>();
	}

	@Override
	public boolean save(AquariumDTO dto) {
		boolean added = false;
		if (dto != null) {
			System.out.println("DTO is not null can add");
			if (!this.list.contains(dto)) {
				this.list.add(dto);
				System.out.println("added " + dto);
				added = true;
			} else {
				System.out.println("element already present");
				added = false;
			}
		}
		return false;
	}

	@Override
	public boolean updateShapeByNoOfFish(String shape, int noOfFish) {
		System.out.println("invoked updateShapeByNoOfFish");
		for (AquariumDTO aquariumDTO : list) {
			String shapeOfAqua = aquariumDTO.getShape();
			int number = aquariumDTO.getNoOfFish();
			if (shapeOfAqua != null && number > 0) {
				if (shapeOfAqua.equals(shape)) {
					System.out.println("before updating " + aquariumDTO);
					aquariumDTO.setNoOfFish(noOfFish);
					System.out.println("after updated shape " + aquariumDTO);
					return true;
				} else {
					System.out.println("shape and noOfFish not found");
					return false;
				}
			}
		}
		return false;
	}

	@Override
	public boolean deleteByShape(String shape) {
		System.out.println("invoked deleteByShape");
		Iterator<AquariumDTO> iterator = this.list.iterator();
		while (iterator.hasNext()) {
			AquariumDTO dto = iterator.next();
			if (dto.getShape().equals(shape)) {
				iterator.remove();
				System.out.println("deleted shape");
				return true;
			}
		}
		return false;
	}

	@Override
	public boolean saveMultipleValues(List<AquariumDTO> dtos) {
		boolean added = false;
		System.out.println("invoked saveMultipleValues methods");
		if (dtos != null && !this.list.contains(dtos)) {
			System.out.println("can add multiple values");
			this.list.addAll(dtos);
			System.out.println("multiple elemets added " + dtos);
			added = true;
		} else {
			System.out.println("dto already present");
			added = false;
		}

		return false;
	}

	@Override
	public int size() {
		return this.list.size();
	}

}
