#include <stdio.h>

void main()
{
	int n;
 printf("enter the no of nodes : ");
 scanf("%d",&n);
 int ar[n][n],v[n];
printf("enter the matrix : \n");
for(int i=0;i<n;i++)
{
	v[i]=0;
	for(int j=0;j<n;j++)
	{
	scanf("%d",&ar[i][j]);
	if(ar[i][j]==0)
	ar[i][j]=999;
	
	}

}

int min=999,e=0,u,k,cost=0;
v[0]=1;
while(e<n-1)
{

	min=999;
	for(int i=0;i<n;i++)
	{	
		if(v[i]==1)
		{
			for(int j=0;j<n;j++)
			{
				if(ar[i][j]<min && v[j]==0)
				{
					min=ar[i][j];
					u=i;
					k=j;

				}

			}


		}

	}
	cost=cost+min;
	v[k]=1;

	printf("Edge {%d , %d } => %d \n",u,v,min);
	e++;

}


printf(" \n cost is : %d",cost);



}
