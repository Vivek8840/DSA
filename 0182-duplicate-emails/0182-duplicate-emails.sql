# Write your MySQL query statement below
-- select distinct(p.email) as Email from person p
-- join  person k
-- on p.email=k.email 
-- where p.id !=k.id;
select email from person 
group by email 
having count(email)>1;
