package serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dao.AdminDao;
import model.Admin;
import service.AdminService;
@Service("AdminService")

public class AdminServiceImpl implements AdminService {
    @Autowired
    private AdminDao AD;
    
	public List<Admin> loginByap(String adminCode, String passWord) {
		// TODO Auto-generated method stub
		List<Admin> Admin = AD.loginByap(adminCode, passWord);
		return Admin;
	}

}
