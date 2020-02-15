package pl.polsl.gr6.proj.io.DoggyFoodie.model;

import javax.persistence.Column;

/**
 *
 * @author Radosław Płachta
 */
public class Administrator extends Uzytkownik {

    @Column(name = "isAdmin")
    boolean adminPrivileges;

    boolean getAdminPrivileges() {
        return this.adminPrivileges;
    }

    void setAdminPrivileges(boolean adminPrivileges) {
        this.adminPrivileges = adminPrivileges;
    }
}
