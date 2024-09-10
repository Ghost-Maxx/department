#include<stdio.h>
void main(){
	int n1, n2, x, y, temp, lcm, gcd;
	printf("Enter the two number:  \n");
	scanf("%d%d", &x, &y);
	 n1=x;
	 n2=y;
	 
	 while(n2!=0){
	 	temp=n2;
	 	n2=n1%n2;
	 	n1=temp;
	 }
	 gcd =n1;
	 lcm=((x*y)/gcd);
	 
	 printf("the hcf is %d and LCM is %d",gcd, lcm);
	 
}