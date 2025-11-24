package org.example.restaurant.Model;

import jakarta.persistence.*;

@Entity
@Table(name = "chefs")
public class Chef extends Staff {

    @Column(nullable = false)
    private String specialization;

    public Chef() {}

    public Chef(String name, String experience, String specialization) {
        super(name, experience);
        this.specialization = specialization;
    }

    public String getSpecialization() { return specialization; }
    public void setSpecialization(String specialization) { this.specialization = specialization; }
}
