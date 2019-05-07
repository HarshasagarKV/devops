package com.wipro.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.wipro.MainModel.Mainmodel;
import com.wipro.Mainservice.Service;

@Controller
public class Fromtcontroller {
@Autowired Service service;
@RequestMapping(value="/")
public String toindex()
{
	return "index";
}
@RequestMapping(value="/tologin")
public String tologin()
{
	return "login";
}
@RequestMapping(value="/toregister")
public String toregister()
{
	return "register";
}
@RequestMapping(value="/newuser")
public String tonewuser(Model model,@ModelAttribute("bean")Mainmodel bean)
{
		service.tonewuser(bean);
	return "register";
}
@RequestMapping(value="/tologincheck")
public String tologincheck(Model model,@ModelAttribute("bean")Mainmodel bean)
{
	return service.tologincheck(bean);

}
@RequestMapping(value="/insertbook")
public String toinsertbook(Model model,@ModelAttribute("bean")Mainmodel bean)
{
	return service.toinsert(bean);

}
@RequestMapping(value="/update")
public String toupdate(Model model,@ModelAttribute("bean")Mainmodel bean)
{
	return service.toupdate(bean);

}
}
