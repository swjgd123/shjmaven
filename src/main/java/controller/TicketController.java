package controller;

import java.awt.List;
import model.Ticket;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import service.TicketServiceImpl;

@Controller
public class TicketController {
	@Autowired
	private TicketServiceImpl tsi;
	@RequestMapping(value="/ticket")
	   public String test(Model model){
		tsi.getAllstudent();
		model.addAttribute("tests",tsi.getAllstudent());
		return "ticket";
	}    
}
