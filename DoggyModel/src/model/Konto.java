package model;

import model.Uzytkownik;

import model.Post;

public class Konto {

	int idAccount;                       // id konta
	Uzytkownik owner;                    // uzytkownik konta
	Post post;                           // post pochodzacy z konta
	
	public void createAccount(int id, String userName, String firstName, String lastName, String password) {
		
		owner = new Uzytkownik(id,userName,firstName,lastName,password);
		this.idAccount=id;                                               // id uzytkownika jest rowne id konta
	}
	
	public void changeUserName(String newUserName) {
		
		owner.setUserName(newUserName);
	}
	
	public void changePassword(String newPassword) {
		
		owner.setPassword(newPassword);
	}
	
	public void changeLastName(String newLastName) {
		
		owner.setLastName(newLastName);
	}
	
	// zaimplementowac usuwanie konta zgodnie z baza danych
	
	// TO DO
	
	// tworzenie posta
	
	public void createPost(int idPost,String title, String content) {
		
		post = new Post(idPost,title,content,owner.getUserName());
	}
	
}
