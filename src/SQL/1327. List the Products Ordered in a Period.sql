-- using LIKE comparison in WHERE clause
SELECT p.product_name, SUM(unit) AS unit
FROM Products p
         JOIN Orders o USING (product_id)
WHERE o.order_date LIKE '2020-02%'
GROUP BY p.product_id
HAVING unit >= 100

-- using LEFT() function in WHERE clause
SELECT p.product_name, SUM(unit) AS unit
FROM Products p
JOIN Orders o USING (product_id)
WHERE LEFT(o.order_date, 7) = '2020-02'
GROUP BY p.product_id
HAVING SUM(unit) >= 100
