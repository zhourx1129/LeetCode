#include<stdio.h>
double myPow(double x, long n){
    if (x==0||x==1){
        return x;
    }
    if (n==0){
        return 1;
    }else if (n>0){
        if(n%2==0){
            return myPow(x * x, n / 2);
        }else{
            return x * myPow(x * x, n / 2);
        }
    }else{
        return myPow(1 / x, -n);
    }
}
int main(){
    printf("%lf", myPow(2.0, -2171848));
}


