SELECT
    q1.person_name
FROM Queue q1
JOIN Queue q2
    ON q1.turn >= q2.turn
GROUP BY q1.person_id
HAVING SUM(q2.weight) <= 1000
ORDER BY q1.turn DESC
LIMIT 1