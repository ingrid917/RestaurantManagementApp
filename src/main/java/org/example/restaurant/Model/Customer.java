package org.example.restaurant.Model;

import jakarta.persistence.*;

@Entity
@Table(name = "customers")
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String name;

    @Column(name = "order_ids", columnDefinition = "TEXT")
    private String orderIds; // ex: "1,4,9"

    public Customer() {}

    public Customer(String name, String orderIds) {
        this.name = name;
        this.orderIds = orderIds;
    }

    public Long getId() { return id; }
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public String getOrderIds() { return orderIds; }
    public void setOrderIds(String orderIds) { this.orderIds = orderIds; }
}
