# 找出与之前（昨天的）日期相比温度更高的所有日期的 id 。
select b.id
from weather a join weather b on datediff(b.recordDate,a.recordDate)=1 and b.temperature>a.temperature;