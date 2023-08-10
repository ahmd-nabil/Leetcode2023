SELECT (
           SELECT
               DISTINCT salary
           FROM Employee
           ORDER BY salary DESC
           LIMIT 1, 1
) AS SecondHighestSalary

SELECT
    MAX(salary) AS SecondHighestSalary
FROM Employee
WHERE salary != (SELECT MAX(salary) FROM employee)

SELECT
    MAX(e1.salary) AS SecondHighestSalary
FROM Employee e1
         JOIN Employee e2
              ON e1.salary < e2.salary