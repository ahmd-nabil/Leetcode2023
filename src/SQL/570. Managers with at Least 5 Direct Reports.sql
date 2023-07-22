SELECT
    m.name
FROM employee e
         JOIN employee m
              ON e.managerID = m.id
GROUP BY e.managerId
HAVING count(e.managerId) >= 5