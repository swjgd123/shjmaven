package controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import model.Admin;
import service.AdminService;

@Controller
public class AdminController {
	@Autowired
	private AdminService asi;

	@RequestMapping(value = "/login")
	public ModelAndView loginByap(String adminCode,String passWord) {
		ModelAndView mav = new ModelAndView();
		List<Admin> admin=asi.loginByap(adminCode, passWord);
    	mav.addObject("admin",admin);
    	mav.setViewName("backstage");
    	return mav;
	}
}