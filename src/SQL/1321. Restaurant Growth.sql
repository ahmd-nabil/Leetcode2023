SELECT
    b.visited_on AS visited_on,
    SUM(a.day_amount) AS amount,
    ROUND(AVG(a.day_amount), 2) AS average_amount
FROM
    (SELECT visited_on, SUM(amount) AS day_amount FROM customer GROUP BY visited_on) AS a,
    (SELECT visited_on, SUM(amount) AS day_amount FROM customer GROUP BY visited_on) AS b
WHERE DATEDIFF(b.visited_on, a.visited_on) BETWEEN 0 AND 6 -- which is b-a
GROUP BY b.visited_on
HAVING COUNT(a.visited_on) = 7