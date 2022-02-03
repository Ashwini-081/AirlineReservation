package Ashwini.Engineer.AirlineReservation.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Admin {
    @Id
    private String name;
    @Column(unique = true)
    private String email;

    public Admin(String name, String email) {
        this.name = name;
        this.email = email;
    }
    public Admin(){}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
