package ru.netology.jdbc.repository.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.time.LocalDate;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@Table(name = "orders", schema = "netology_joins")
public class Orders {
    @Id
    @GeneratedValue
    private long id;

    private LocalDate date;

    @ManyToOne
    @JoinColumn(name = "customer_id")
    private Customers customerId;

    @Column(name = "product_name")
    private String productName;

    private int amount;

    @Override
    public String toString() {
        return "Orders{" +
                "id=" + id +
                ", date=" + date +
                ", customerId=" + customerId +
                ", productName='" + productName + '\'' +
                ", amount=" + amount +
                '}';
    }
}
