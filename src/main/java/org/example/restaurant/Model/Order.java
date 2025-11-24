package org.example.restaurant.Model;

import jakarta.persistence.*;

@Entity
@Table(name = "orders")
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long customerId;
    private Long tableId;

    private String status; // "new", "preparing", etc.

    @Column(name = "order_line_ids", columnDefinition = "TEXT")
    private String orderLineIds; // "1,3,7"

    @Column(name = "assignment_ids", columnDefinition = "TEXT")
    private String assignmentIds; // "2,5,6"

    private String paymentMethod;

    public Order() {}

    public Order(Long customerId, Long tableId, String status,
                 String orderLineIds, String assignmentIds, String paymentMethod) {

        this.customerId = customerId;
        this.tableId = tableId;
        this.status = status;
        this.orderLineIds = orderLineIds;
        this.assignmentIds = assignmentIds;
        this.paymentMethod = paymentMethod;
    }

    public Long getId() { return id; }
    public Long getCustomerId() { return customerId; }
    public void setCustomerId(Long customerId) { this.customerId = customerId; }

    public Long getTableId() { return tableId; }
    public void setTableId(Long tableId) { this.tableId = tableId; }

    public String getStatus() { return status; }
    public void setStatus(String status) { this.status = status; }

    public String getOrderLineIds() { return orderLineIds; }
    public void setOrderLineIds(String orderLineIds) { this.orderLineIds = orderLineIds; }

    public String getAssignmentIds() { return assignmentIds; }
    public void setAssignmentIds(String assignmentIds) { this.assignmentIds = assignmentIds; }

    public String getPaymentMethod() { return paymentMethod; }
    public void setPaymentMethod(String paymentMethod) { this.paymentMethod = paymentMethod; }
}
