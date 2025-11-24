package org.example.restaurant.Model;

import jakarta.persistence.*;

@Entity
@Table(name = "servers")
public class Server extends Staff {

    @Column(nullable = false)
    private String designation;

    public Server() {}

    public Server(String name, String experience, String designation) {
        super(name, experience);
        this.designation = designation;
    }

    public String getDesignation() { return designation; }
    public void setDesignation(String designation) { this.designation = designation; }
}
