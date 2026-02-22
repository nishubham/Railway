package com.shubham.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.shubham.dto.TrainDto;
import com.shubham.service.TrainService;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/train-api")
public class TrainController {
	
	@Autowired
	private TrainService service;
	
	
	@PostMapping("/add")
	public ResponseEntity<String> add(@Valid @RequestBody TrainDto dto){
		String message=service.add(dto);
		return new ResponseEntity<String>(message,HttpStatus.CREATED);
	}
	
	@GetMapping("/findByTrainNo/{id}")
	public ResponseEntity<TrainDto> findByTrainNo(@PathVariable Long id){
		TrainDto trainDto=service.findByTrainNo(id);
		return new ResponseEntity<>(trainDto,HttpStatus.OK);
	}
	

	@GetMapping("/findAllTrain")
	public ResponseEntity<List<TrainDto>> findAllTrain(){
		List<TrainDto> trainDto=service.findAllTrain();
		return new ResponseEntity<>(trainDto,HttpStatus.OK);
	}

	
}
