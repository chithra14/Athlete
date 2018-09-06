package com.manipal.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.manipal.beans.Athlete;
import com.manipal.dao.AthleteDAO;
import com.manipal.dao.AthleteJdbcDao;

public class AthleteServiceImpl implements AthleteService{

	@Autowired
	AthleteDAO edao;

	 public AthleteServiceImpl() {
		this.edao = new AthleteJdbcDao();
	}


	@Override
	public String addEmployee(Athlete e) {
      int[] r=new int[2];
		r=edao.insert(e);
		String msg=null;
		if(r[1]==1)
		{
			msg="Athlete added Successfully and  the Athlete ID is "+r[0];
		}
		else
		{
			msg="Sorry.Try Again!! Row not added properly";
		}
		return msg;
	}


	@Override
	public List<Athlete> getAll() {

		List<Athlete> list=edao.listAll();
		for(Athlete e:list)
			System.out.println(e);
		return list;
		

	}


	@Override
	public String removeAthe(int eno) {
		int r=edao.delete(eno);
		String msg=null;
		if(r==1)
			msg="Row removed Successfully";
		else
			msg="Sorry.Try Again!! Row not removed properly";
		return msg;
		
	}


	@Override
	public String updateAthe(int randnum, String amo) {
		int r=edao.update(amo,randnum);
		String msg=null;
				
				if(r==1)
					msg="Row updated Successfully";
				else
				   msg="Sorry.Try Again!! Row not upadated properly";
				return msg;
				
				
	}


	


	@Override
	public List<Athlete> search(int randnum) {
		edao.search(randnum);
		List<Athlete> list=edao.search(randnum);
		
		return list;
		
	}


	@Override
	public List<Athlete> searchbycat(String cat) {
		
		List<Athlete> list=edao.searchbycat(cat);
		
		return list;
	}


}
