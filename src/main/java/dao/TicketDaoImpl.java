package dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import model.Ticket;

public class TicketDaoImpl implements TicketDao {
    
	public List<Ticket> getAllstudent() {
		List<Ticket> t=new ArrayList<Ticket>();
		Ticket t1=new Ticket();
		t1.setTid("121");
		t1.setDeparture_add("SHN");
		t1.setDestination_add("LOA");
		t1.setDeparture_time("1305");
		t1.setArrival_time("1825");
		t1.setPrice("67.8");
		t1.setUname_code("C93832");
		t.add(t1);
		Ticket t2=new Ticket();
		t2.setTid("122");
		t2.setDeparture_add("HND");
		t2.setDestination_add("ALA");
		t2.setDeparture_time("0640");
		t2.setArrival_time("1135");
		t2.setPrice("127");
		t2.setUname_code("D85414");
		t.add(t2);
		Ticket t3=new Ticket();		
		t3.setTid("123");
		t3.setDeparture_add("JFK");
		t3.setDestination_add("DAM");
		t3.setDeparture_time("0755");
		t3.setArrival_time("2235");
		t3.setPrice("458");
		t3.setUname_code("A58451");
		t.add(t3);
		return t;
		
	}

}
