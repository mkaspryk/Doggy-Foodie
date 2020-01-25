package model;

import model.Uzytkownik;

public class Administrator extends Uzytkownik{

	
	boolean adminPrivileges;
	
	public Administrator(int id, String userName, String firstName, String lastName, String password) {
		
		super(id, userName, firstName, lastName, password);
		this.adminPrivileges=true; 
	}
	
	boolean getAdminPrivileges() {
		
		return this.adminPrivileges;
	}
	
	void setAdminPrivileges(boolean adminPrivileges) {
		
		this.adminPrivileges = adminPrivileges;
	}
}
