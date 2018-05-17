package service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dao.TicketDao;
import dao.TicketDaoImpl;
import model.Ticket;
@Service
public class TicketServiceImpl implements TicketService{
   
   
	public List<Ticket> getAllstudent() {

    	TicketDaoImpl tdi=new TicketDaoImpl();
    	 	List<Ticket> t=tdi.getAllstudent();
    	 	return t;
	}
    
}
