package org.example.restaurant.Model;

import jakarta.persistence.*;

@Entity
@Table(name = "order_lines")
public class OrderLine {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "menu_item_id", nullable = false)
    private Long menuItemId;

    @Column(nullable = false)
    private double quantity;

    @Column
    private String allergens;

    public OrderLine() {}

    public OrderLine(Long menuItemId, double quantity, String allergens) {
        this.menuItemId = menuItemId;
        this.quantity = quantity;
        this.allergens = allergens;
    }

    public Long getId() { return id; }
    public Long getMenuItemId() { return menuItemId; }
    public void setMenuItemId(Long menuItemId) { this.menuItemId = menuItemId; }
    public double getQuantity() { return quantity; }
    public void setQuantity(double quantity) { this.quantity = quantity; }
    public String getAllergens() { return allergens; }
    public void setAllergens(String allergens) { this.allergens = allergens; }
}
