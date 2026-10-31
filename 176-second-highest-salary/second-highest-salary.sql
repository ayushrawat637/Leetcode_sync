SELECT MAX(e.salary) as SecondHighestSalary
FROM Employee e
WHERE e.salary < (SELECT MAX(e2.salary) FROM Employee e2);