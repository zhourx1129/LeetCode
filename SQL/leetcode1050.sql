# 编写解决方案找出合作过至少三次的演员和导演的 id 对 (actor_id, director_id)
select actor_id,director_id
from actordirector
group by actor_id,director_id
having count(actor_id)>=3;
