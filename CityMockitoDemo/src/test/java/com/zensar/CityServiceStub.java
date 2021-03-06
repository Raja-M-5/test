package com.zensar;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CityServiceStub implements CityService{

	
	public List<String> findCitiesByCountries(String country){
	List<String> cities = new ArrayList<String>();
	if(country.equalsIgnoreCase("INDIA")) {
		cities = Arrays.asList("Pune","Mumbai","Chennai");
	}
	
	else if(country.equalsIgnoreCase("USA")) {
		cities = Arrays.asList("New York","Washington");
	}
	
	return cities;
}
}