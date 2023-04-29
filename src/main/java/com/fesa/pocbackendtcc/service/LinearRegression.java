package com.fesa.pocbackendtcc.service;


import com.fesa.pocbackendtcc.dto.PredictEggDTO;
import com.fesa.pocbackendtcc.model.PredictEgg;


public class LinearRegression {
	
	public Float predict(PredictEgg obj) {
		double prediction = 349.2887167 * obj.getWeekly_average_temperature() - 28.22620125 * obj.getAverage_relative_humidity()
				+ 97.55762104 * obj.getAge_in_weeks() - 767.699485807072;
		return (float) Math.round(prediction);
	}
	
	public PredictEgg fromDTO(PredictEggDTO objDTO) {
		return new PredictEgg(objDTO.getWeekly_average_temperature(), objDTO.getAverage_relative_humidity(), objDTO.getAge_in_weeks());
	}
}
