# 删除 所有重复的电子邮件，只保留一个具有最小 id 的唯一电子邮件。
delete from person where Id not in (
    select result.Id from (select min(Id) Id from person group by Email) as result
    );

select * from person;
