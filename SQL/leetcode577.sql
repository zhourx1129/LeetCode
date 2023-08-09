# 选出所有 bonus < 1000 的员工的 name 及其 bonus。
select e.name,b.bonus from employee as e left join bonus as b on e.empId=b.empId where b.bonus<1000 or b.bonus is null;





