# Write your MySQL query statement below
select distinct(p.email) as Email from person p
join  person k
on p.email=k.email 
where p.id !=k.id;
