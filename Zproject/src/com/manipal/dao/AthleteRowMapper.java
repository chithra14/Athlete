package com.manipal.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.manipal.beans.Athlete;


public class AthleteRowMapper implements RowMapper<Athlete> {

	@Override
	public Athlete mapRow(ResultSet arg0, int arg1) throws SQLException {
		// TODO Auto-generated method stub
		Athlete e= new Athlete();

		e.setRandnum(arg0.getInt(1));
		e.setName(arg0.getString(2));
        
        e.setGender(arg0.getString(3));
        e.setCategory(arg0.getString(4));
        e.setEmail(arg0.getString(5));
        e.setMobile(arg0.getString(6));
   
		
		
		return e;
	}

}
