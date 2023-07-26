-- 查找重复的电子邮箱
SELECT email
FROM Person
GROUP BY email
HAVING count(email) > 1