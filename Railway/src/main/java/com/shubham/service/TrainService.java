package com.shubham.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.shubham.dto.TrainDto;
import com.shubham.entity.Train;
import com.shubham.repository.TrainRepository;

@Service
public class TrainService {
	
	@Autowired
	private TrainRepository repo;
	

	
	public String add(TrainDto dto){
		
		Train t=new Train();
		BeanUtils.copyProperties(dto, t);
		Train save = repo.save(t);
		return save.getTrainName()+" is save";
	}
	
	
	public TrainDto findByTrainNo( Long id){
		TrainDto dto=new TrainDto();
		Train byId = repo.findById(id).get();
		
		BeanUtils.copyProperties(byId, dto);
		return dto;
	}
	

	
	public List<TrainDto> findAllTrain(){
		List<TrainDto> list=new ArrayList<>();
		List<Train> all = repo.findAll();
		
		for(Train val:all) {
			TrainDto dto=new TrainDto();
			BeanUtils.copyProperties(val, dto);
			list.add(dto);
		}
		return list;
	}

}
