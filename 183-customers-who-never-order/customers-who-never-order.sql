# Write your MySQL query statement below
select c1.name as Customers from customers c1 
left join orders o on c1.id=o.customerId
where o.customerId is null;