# 编写一个SQL查询来查找收入比经理高的员工。
select e1.name Employee from employee e1 join employee e2 on e1.managerId=e2.id and e1.salary>e2.salary