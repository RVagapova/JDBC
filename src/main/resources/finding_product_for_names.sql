select o.product_name from netology_joins.orders o
                               inner join netology_joins.customers c
                                          on o.customer_id  = c.id
where lower(c.name) = :name;