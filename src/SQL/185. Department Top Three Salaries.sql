-- using sub-query
SELECT
    d.name AS Department,
    e1.name AS Employee,
    e1.salary AS Salary
FROM Employee e1
JOIN Department d ON d.id = e1.departmentId
WHERE 3 > (
    SELECT COUNT(DISTINCT e2.salary)
    FROM Employee e2
    WHERE e1.departmentId = e2.departmentId AND e2.salary > e1.salary
)

-- using join (better)
SELECT
    d.name AS Department,
    e1.name AS Employee,
    e1.salary AS Salary
FROM Employee e1
         LEFT JOIN Employee e2 ON e1.departmentId = e2.departmentId AND e2.salary > e1.salary
         JOIN Department d ON e1.departmentId = d.id
GROUP BY e1.id
HAVING COUNT(DISTINCT e2.salary) < 3