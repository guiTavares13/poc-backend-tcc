package com.fesa.pocbackendtcc.model;

import java.io.Serializable;

public class PredictEgg implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private float weekly_average_temperature;
	private float average_relative_humidity;
	private float age_in_weeks;
	
	public float getWeekly_average_temperature() {
		return weekly_average_temperature;
	}
	
	public void setWeekly_average_temperature(float weekly_average_temperature) {
		this.weekly_average_temperature = weekly_average_temperature;
	}
	
	public float getAverage_relative_humidity() {
		return average_relative_humidity;
	}
	
	public void setAverage_relative_humidity(float average_relative_humidity) {
		this.average_relative_humidity = average_relative_humidity;
	}
	
	public float getAge_in_weeks() {
		return age_in_weeks;
	}
	
	public void setAge_in_weeks(float age_in_weeks) {
		this.age_in_weeks = age_in_weeks;
	}
	
	public PredictEgg(float weekly_average_temperature, float average_relative_humidity, float age_in_weeks) {
		super();
		this.weekly_average_temperature = weekly_average_temperature;
		this.average_relative_humidity = average_relative_humidity;
		this.age_in_weeks = age_in_weeks;
	}
	
	
	
}
