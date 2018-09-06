package com.manipal.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.manipal.beans.Athlete;

import com.manipal.service.AthleteService;


@Controller
@RequestMapping("/")
public class AthleteController {

	@Autowired
	AthleteService es;
	@RequestMapping(value="/add", method=RequestMethod.POST)
	
	
	public String addEmployee(@RequestParam (name="aname") String an,
			@RequestParam (name="agender") String ag,
			@RequestParam (name="acategory") String ac,
			@RequestParam (name="aemail") String ae,
			@RequestParam (name="amobile")String am,
			ModelMap model)
	{
		
		
		Athlete e =new Athlete();
		e.setRandnum(e.getRandomNumberInts(1000,3000));
   e.setName(an);
   e.setGender(ag);
   e.setCategory(ac);
   e.setEmail(ae);
   e.setMobile(am);
        
		String msg=  es.addEmployee(e);
	model.addAttribute("result",msg);
		
		return "show";
	}
	
	
	@RequestMapping(value="/showall")


	public ModelAndView listEmpl()
	{
		ModelAndView m=new ModelAndView();
		List<Athlete> data= es.getAll();
		m.setViewName("Alldetails");
		m.addObject("data",data);
		return m;	
	}


@RequestMapping(value="/remove",method=RequestMethod.POST)
	
	
	public String removeAthl(@RequestParam (name="erid") int eno,ModelMap model)
{
		
		
	
		String msg=  es.removeAthe(eno);
	model.addAttribute("result",msg);
		
		return "show";
	}
	
	
@RequestMapping(value="/update",method=RequestMethod.POST)


public String updateAthee(@RequestParam (name="arandnum") int randnum,
		@RequestParam (name="amobile") String amo,
		ModelMap model)
{
	
	
	String msg= es.updateAthe(randnum, amo);
model.addAttribute("result",msg);
	
	return "show";
}



@RequestMapping(value="/search",method=RequestMethod.POST)

public ModelAndView searchAthele(@RequestParam (name="randnum") int randnum,ModelMap model)
{
	
	ModelAndView m=new ModelAndView();
	List<Athlete> data= es.search(randnum);
	m.setViewName("Alldetails");
	m.addObject("data",data);
	return m;	
}


@RequestMapping(value="/searchcat",method=RequestMethod.POST)

public ModelAndView searchcat(@RequestParam (name="acategory") String cat,ModelMap model)
{
	
	ModelAndView m=new ModelAndView();
	List<Athlete> data= es.searchbycat(cat);
	m.setViewName("Alldetails");
	m.addObject("data",data);
	return m;	
}


}
