package pl.polsl.gr6.proj.io.DoggyFoodie.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 *
 * @author Radosław Płachta
 */
@Entity
@Table(name = "users")
public class Uzytkownik extends Osoba {   
    
    @Column(name = "userFirstName")
    String firstName;
    
    @Column(name = "userLastName")
    String lastName;
    
    @Column(name = "userPassword")
    String password;

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
}
