# Write your MySQL query statement below
Select   ( select distinct salary from Employee  order By salary Desc
 limit 1 OFFSET 1 ) as SecondHighestSalary;