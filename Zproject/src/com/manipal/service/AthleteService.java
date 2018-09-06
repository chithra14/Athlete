package com.manipal.service;

import java.util.List;

import com.manipal.beans.Athlete;



public interface AthleteService {

	
	public String addEmployee(Athlete e);
	public List<Athlete> getAll();
	public String removeAthe(int eno);
	public String updateAthe(int randnum, String amo);
	public List<Athlete> search(int randnum);
	public List<Athlete> searchbycat(String cat);

}
