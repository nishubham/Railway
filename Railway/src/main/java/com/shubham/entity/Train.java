package com.shubham.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "Train")
public class Train 
{
	@Id
	private Long trainNo ;
	
	@Column(nullable = false)
	private String trainName ;
	
	@Column(nullable = false)
	private String source ;
	
	@Column(nullable = false)
	private String destination ;
	
	private double fare ;
}
