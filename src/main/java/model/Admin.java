package model;

public class Admin {
	private int adminId;
    private String adminCode;
    private String passWord;
    public Admin(){
    	super();
	}
	public Admin(int adminId, String adminCode, String passWord) {
		super();
		this.adminId = adminId;
		this.adminCode = adminCode;
		this.passWord = passWord;
	}
	public int getAdminId() {
		return adminId;
	}
	public void setAdminId(int adminId) {
		this.adminId = adminId;
	}
	public String getAdminCode() {
		return adminCode;
	}
	public void setAdminCode(String adminCode) {
		this.adminCode = adminCode;
	}
	public String getPassWord() {
		return passWord;
	}
	public void setPassWord(String passWord) {
		this.passWord = passWord;
	}
	
    
}
