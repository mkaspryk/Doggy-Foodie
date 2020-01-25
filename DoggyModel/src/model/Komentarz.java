package model;

public class Komentarz {

	String comment;                                           // komentarz
	String author;                                            // autor
	
	public Komentarz(String comment,String author) {
		
		this.comment=comment;
		this.author=author;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}
}
