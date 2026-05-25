-- Last updated: 5/25/2026, 11:09:27 AM
# use gap and island approach to partition rows into groups
with grps as (
    select *
    , id - row_number() over (order by id) as grp 
    from stadium 
    where people >= 100
)
# get dates that 3 rows of 100 people
, date_grp as (
    select grp
    from grps
    group by grp 
    having count(*) >= 3
)
# join back on the grp to get the rows for output 
select g.id, g.visit_date, g.people
from grps g
join date_grp d
on g.grp = d.grp