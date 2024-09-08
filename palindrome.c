#include<stdio.h>
void  main(){
	int n;
	int rev=0;
	printf("Enter the number: \n");
	scanf("%d", &n);
	int alpha;
	alpha = n;
	while(n!=0){
		rev=rev*10 + n%10;
		n=n/10;
	}

	if(alpha==rev){
		printf("Entered numbr is palindron");
	}else{
		printf("entred number is NOT! palindrom");
	}
	
}