# 查询并对分数进行排序。排名按以下规则计算:
# 分数应按从高到低排列。
# 如果两个分数相等，那么两个分数的排名应该相同。
# 在排名相同的分数后，排名数应该是下一个连续的整数。换句话说，排名之间不应该有空缺的数字。
# 按 score 降序返回结果表。
select s1.score,(
    select count(distinct s2.score) from scores s2
    where s1.score<=s2.score) as 'rank'
from scores s1 order by s1.score desc ;



SELECT Score,
dense_rank() over(order by Score desc) as 'rank'
FROM Scores