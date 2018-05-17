package service;

import java.util.List;

import model.Admin;

public interface AdminService {
	public List<Admin> loginByap(String adminCode,String passWord);
}
