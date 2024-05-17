package ru.netology.jdbc.repository.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@Table(name = "customers", schema = "netology_joins")
public class Customers {
    @Id
    @GeneratedValue
    private long id;

    private String name;
    private String surname;
    private int age;

    @Column(name = "phone_number")
    private String phoneNumber;

    @Override
    public String toString() {
        return "Customers{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                ", phoneNumber='" + phoneNumber + '\'' +
                '}';
    }
}
