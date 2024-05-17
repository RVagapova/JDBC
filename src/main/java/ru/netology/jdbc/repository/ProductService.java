package ru.netology.jdbc.repository;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;
import ru.netology.jdbc.repository.entity.Orders;

import java.util.List;
import java.util.Locale;

@Repository
public class ProductService {
    @PersistenceContext
    private EntityManager entityManager;

    public List<Orders> getOrdersByName(String name) {
        String query = "select o from Orders o inner join o.customerId c where lower(c.name) = :name";
        return entityManager.createQuery(query, Orders.class)
                .setParameter("name", name.toLowerCase(Locale.ROOT))
                .getResultList();
    }
}
