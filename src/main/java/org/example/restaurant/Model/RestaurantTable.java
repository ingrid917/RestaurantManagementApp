package org.example.restaurant.Model;

import jakarta.persistence.*;

@Entity
@Table(name = "restaurant_tables")
public class RestaurantTable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "table_number", nullable = false)
    private int number;

    @Column(name = "occupied_status", nullable = false)
    private String occupiedStatus; // "free", "occupied"

    @Column(name = "order_ids", columnDefinition = "TEXT")
    private String orderIds;
    // vor fi stocate ca: "1,5,7" (CSV) – STRICT cerința din PDF (doar ID-uri)

    public RestaurantTable() {}

    public RestaurantTable(int number, String occupiedStatus, String orderIds) {
        this.number = number;
        this.occupiedStatus = occupiedStatus;
        this.orderIds = orderIds;
    }

    public Long getId() { return id; }
    public int getNumber() { return number; }
    public void setNumber(int number) { this.number = number; }
    public String getOccupiedStatus() { return occupiedStatus; }
    public void setOccupiedStatus(String occupiedStatus) { this.occupiedStatus = occupiedStatus; }
    public String getOrderIds() { return orderIds; }
    public void setOrderIds(String orderIds) { this.orderIds = orderIds; }
}
