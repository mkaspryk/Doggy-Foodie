package model;

public class Osoba {
	
	int id;                                       // identyfikator osoby odwiedzajacej strone
	
	public Osoba(int id){
		this.id=id;
	}
	
	void setId(int id) {
		this.id=id;
	}
	
	int getId() {
		return id;
	}
}
