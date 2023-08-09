# 对每三个线段报告它们是否可以形成一个三角形。
select x,y,z,(if((x+y>z and y+z>x and x+z>y),'Yes','No')) as triangle from triangle;

select x,y,z,
       case
            when x+y>z && x+z>y && y+z>x then 'Yes'
            else 'No'
        end
       as triangle from triangle;



