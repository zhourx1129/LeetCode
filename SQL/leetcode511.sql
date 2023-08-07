# 查询每位玩家 第一次登陆平台的日期。
select player_id,min(event_date) first_login from activity group by player_id;