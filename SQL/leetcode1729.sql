# 编写解决方案，对于每一个用户，返回该用户的关注者数量。
#
# 按 user_id 的顺序返回结果表。

select user_id,count(follower_id) as followers_count from followers group by user_id order by user_id;