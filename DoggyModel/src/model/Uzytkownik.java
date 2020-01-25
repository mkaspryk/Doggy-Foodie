package model;

import java.util.Date;
import model.Osoba;

public class Uzytkownik extends Osoba{

	
	String userName;
	String firstName;
	String lastName;
	String password;
	Date dateOfCreateAccount;
	
	public Uzytkownik(int id,String userName,String firstName, String lastName, String password) {  // konstruktor tworzony dla u¿ytkownika jest tylko raz !!! Przy tworzeniu konta
		super(id);
		this.userName = userName;
		this.firstName = firstName;
		this.lastName = lastName;
		this.password = password;
		this.dateOfCreateAccount = new Date();	
	}
	
	public void setUserName(String userName) {
		
		this.userName = userName;
	}
	
	public String getUserName() {
		
		return this.userName;
	}
	
	public void setFirstName(String firstName) {
		
		this.firstName = firstName;
	}
	
	public String getFirstName() {
		
		return this.firstName;
	}
	
	public void setLastName(String lastName) {
		
		this.lastName = lastName;
	}
	
	public String getLastName() {
		
		return this.lastName;
	}
	
	public void setPassword(String password) {
		
		this.password = password;
	}
	
	public String getPassword() {
		
		return this.password;
	}
	
	public String getDateOfCreateAccount() {
		
		return this.dateOfCreateAccount.toString();
	}
	
}
