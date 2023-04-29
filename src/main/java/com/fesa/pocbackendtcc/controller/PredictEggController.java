package com.fesa.pocbackendtcc.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fesa.pocbackendtcc.dto.PredictEggDTO;
import com.fesa.pocbackendtcc.model.PredictEgg;
import com.fesa.pocbackendtcc.service.LinearRegression;

@RestController
@RequestMapping(value="/predictEgg")
public class PredictEggController {
	
	
	
	@PostMapping
	public ResponseEntity<Float> predict(@RequestBody PredictEggDTO objDTO) {
		
		LinearRegression lr = new LinearRegression();
		PredictEgg obj = lr.fromDTO(objDTO);
		Float x = lr.predict(obj);
		
		return ResponseEntity.ok().body(x);
	}
}
