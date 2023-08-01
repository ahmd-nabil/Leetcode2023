SELECT
    manager.employee_id AS employee_id,
    manager.name,
    COUNT(*) AS reports_count,
    ROUND(AVG(emp.age)) AS average_age
FROM Employees AS emp
         JOIN Employees AS manager
            ON emp.reports_to = manager.employee_id
GROUP BY employee_id
ORDER BY employee_id