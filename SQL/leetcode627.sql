# 交换所有的 'f' 和 'm' （即，将所有 'f' 变为 'm' ，反之亦然），
# 仅使用 单个 update 语句 ，且不产生中间临时表。
select * from salary;
update salary set sex =
    case
        when sex = 'm' then 'f'
        else 'm'
    end;
update salary set sex = if(sex='m','f','m');
