#include <stdio.h>
int main()
{
    double a1, b1, c1, a2, b2, c2, x, y;
    printf("请依次输入A1、B1、C1、A2、B2、C2\n");
    scanf("%lf%lf%lf%lf%lf%lf", &a1, &b1, &c1, &a2, &b2, &c2);
    double u, w, v = a1 * b2 - b1 * a2;
    if (v == 0)
    {
        w = a1 * c2 - c1 * a2;
        if (w)
            printf("无解");
        else
            printf("有无穷个解");
    }
    else
    {
        u = c1 * b2 - b1 * c2;
        w = a1 * c2 - c1 * a2;
        x = u / v;
        y = w / v;
        printf("%lf   %lf", x, y);
    }
    return 0;
}