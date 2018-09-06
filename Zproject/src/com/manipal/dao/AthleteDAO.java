package com.manipal.dao;

import java.util.List;

import com.manipal.beans.Athlete;


public interface AthleteDAO {

	public int[] insert(Athlete a);
	public List<Athlete> listAll();
	public int delete(int eno);
	public int update(String amo, int randnum);
	public List<Athlete> search(int randnum);
	public List<Athlete> searchbycat(String cat);
	
}
