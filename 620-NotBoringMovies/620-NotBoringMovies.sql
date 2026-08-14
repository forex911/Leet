-- Last updated: 8/14/2026, 10:47:24 AM
# Write your MySQL query statement below
select * from cinema c
where c.id%2=1
and 
c.description!='boring'
Order by c.rating desc;