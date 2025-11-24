package org.example.restaurant.Model;

import jakarta.persistence.*;

@Entity
@Table(name = "order_assignments")
public class OrderAssignment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "order_id", nullable = false)
    private Long orderId;

    @Column(name = "staff_id", nullable = false)
    private Long staffId;

    public OrderAssignment() {}

    public OrderAssignment(Long orderId, Long staffId) {
        this.orderId = orderId;
        this.staffId = staffId;
    }

    public Long getId() { return id; }
    public Long getOrderId() { return orderId; }
    public void setOrderId(Long orderId) { this.orderId = orderId; }
    public Long getStaffId() { return staffId; }
    public void setStaffId(Long staffId) { this.staffId = staffId; }
}
