SELECT
    customer_id
FROM Customer
GROUP by customer_id
HAVING COUNT(DISTINCT product_key) = (SELECT COUNT(*) FROM product)