# Write your MySQL query statement below
Select firstName, lastName, city, state
from person as p
left join address a
on p.personId = a.personId;
