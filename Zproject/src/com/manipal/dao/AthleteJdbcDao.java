package com.manipal.dao;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.manipal.beans.Athlete;






@Repository
public class AthleteJdbcDao implements AthleteDAO{

	
	
	
	
	@Autowired
	JdbcTemplate jdbcTemplate;

	@Override
	public int[] insert(Athlete a) {
		// TODO Auto-generated method stub
		int[] r=new int[2];
		r[0]=a.getRandnum();
		String query="insert into athlete values(?,?,?,?,?,?)";
		
		 r[1]=jdbcTemplate.update(query,r[0],a.getName(),a.getGender(),a.getCategory(),a.getEmail(),a.getMobile());
		return r;
		//r is returned to the service
		//if r is 1 it is done correctly...else not
		
		
		
		
		
	
	}

	@Override
	public List<Athlete> listAll() {
		// TODO Auto-generated method stub
String query="select * from athlete";
		
		List<Athlete> list=jdbcTemplate.query(query,new AthleteRowMapper());
				return list;

	}

	@Override

		public int delete(int eno) {
			
			
			
			String query="delete from Athlete where rand_num= ?";
			
			int r=jdbcTemplate.update(query,eno);
			return r;


	}

	@Override
	public int update(String amo, int randnum) {

		String query="update Athlete set mobile=? where rand_num=?";
		int r=jdbcTemplate.update(query,amo,randnum);
		
		return r;
	}

	@Override
	public List<Athlete> search(int randnum)
	{
    String query="select * from athlete where rand_num="+randnum;
		
		List<Athlete> list=jdbcTemplate.query(query,new AthleteRowMapper());
				return list;
	}

	@Override
	public List<Athlete> searchbycat(String cat) {
		 String query="select * from athlete where category='"+cat+"'";
			
			List<Athlete> list=jdbcTemplate.query(query,new AthleteRowMapper());
					return list;
	}
	
	
	
	
	}
	
	
	
	
	
	
	
	

