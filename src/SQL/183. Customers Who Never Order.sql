SELECT
    name AS Customers
FROM Customers AS c
WHERE c.id NOT IN (SELECT customerId FROM orders);