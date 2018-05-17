package dao;

import java.util.List;

import model.Admin;

public interface AdminDao {
	List<Admin> loginByap(String adminCode,String passWord);
}
