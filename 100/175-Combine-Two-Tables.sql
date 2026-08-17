# Write your MySQL query statement below
select p.lastName, p.firstName , a.city,a.state from person p left join Address a on P.PersonId = a.personId;