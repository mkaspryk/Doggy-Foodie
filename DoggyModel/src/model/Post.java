package model;

import java.util.Date;

public class Post {

	int idPost;                                                 // identyfikator posta
	String title;                                               // nazwa posta
	String content;                                             // zawartosc posta
	Date dateOfCreate;                                          // data utworzenia posta
	String author;                                              // autor posta userName
	boolean approved;                                           // zatwierdzone przez admina
	
	public Post(int idPost,String title,String content,String author) {
		
		this.idPost=idPost;
		this.title=title;
		this.content=content;
		this.author=author;
		this.dateOfCreate= new Date();
		this.approved = false;
	}

	public int getIdPost() {
		return idPost;
	}

	public void setIdPost(int idPost) {
		this.idPost = idPost;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public boolean isApproved() {
		return approved;
	}

	public void setApproved(boolean approved) {
		this.approved = approved;
	}
	
	public String getDateOfCreate() {
		return this.dateOfCreate.toString();
	}
	
}
