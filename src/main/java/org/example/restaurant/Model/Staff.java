package org.example.restaurant.Model;

import jakarta.persistence.*;

@MappedSuperclass
public abstract class Staff {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    protected Long id;

    @Column(nullable = false)
    protected String name;

    @Column(nullable = false)
    protected String experience;

    public Staff() {}

    public Staff(String name, String experience) {
        this.name = name;
        this.experience = experience;
    }

    public Long getId() { return id; }
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public String getExperience() { return experience; }
    public void setExperience(String experience) { this.experience = experience; }
}
