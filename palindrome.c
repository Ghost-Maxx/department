#include<stdio.h>
int main(){
	int num;
	int rev=0;
	printf("Enter a Number ");
	scanf("%d",&num);
	int check=num;
	while(num!=0){
		rev=rev*10+num%10;
		num=num/10;
	}
	if(check==rev){
		printf("it is a palindrome number");
	}
	else{
			printf("it is not a palindrome number");
	}
	return 0;
}
