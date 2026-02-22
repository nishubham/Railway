package com.shubham.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Positive;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class TrainDto 
{
	private Long trainNo;

	@NotBlank(message = "Must Enter Train Name")
	private String trainName;

	@NotBlank(message = "Must Enter Train Source")
	private String source;

	@NotBlank(message = "Must Enter Train Destination")
	private String destination;

	@Positive(message = "Value Not be Negative")
	private double fare;

}
