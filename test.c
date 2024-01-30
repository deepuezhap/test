#include <stdio.h>
#include <stdlib.h>

struct node
{
    int data;
    struct node* next;

};
struct node *temp,*head;

struct node* create(int val)
{
    struct node* node = (struct node*)malloc(sizeof(struct node));
    node->data=val;
    node->next=NULL;
    return node;
    
}
void display()
{
    temp=head;
    while(temp!=NULL)
    {
    
    printf("%d  ",temp->data);
    temp=temp->next;
    }
}


void insertion()
{
int val;
printf("ENter the value : ");
scanf("%d",&val);
struct node* new=create(val);

if(head==NULL)
head=new;
else
{
temp=head;
while(temp->next!=NULL)
temp=temp->next;
temp->next=new;

}
}


void insertat()
{
    int val,pos;
    printf("enter the value and pos : ");
    scanf("%d %d",&val,&pos);
    struct node* new=create(val);
    temp=head;
    if(pos==1)
    {
        new->next=head;
        head=new;

    }
    else
    {
        int i=1;
        while(i<pos-1)
        {
            if(temp->next==NULL)
            {
                printf("invalid pos \n");
                return;
            }
            temp=temp->next;
            i++;
        }
        
        new->next=temp->next;
        temp->next=new;
    }

}
struct node* del;

void deleteend()
{
    temp=head;
    while(temp->next->next!=NULL)
    temp=temp->next;
    del=temp->next;
    printf("%d is  deleted ",del->data);
    temp->next=NULL;
    free(del);

}

void deletebeg()
{
del=head;
head=head->next;
printf("%d is deleted",del->data);
free(del);
}

void deleteat()
{
    int pos;
    printf("entert the pos : ");
    scanf("%d",&pos);
    temp=head;
    if(pos==1)
    deletebeg();
    else{
        int i=1;
        while(i<pos-1)
        {
            if(temp->next==NULL)
            {
                printf("Invalid pos \n");
                return;
            }
            temp=temp->next;
            i++;
        }
        del=temp->next;
        printf("%d is deleted \n",del->data);

        temp->next=del->next;
        free(del);



    }





}















void main()
{
	int n;
	printf("1.Creation \n2.Display\n3.Insertion at a particular position\n4.delete at beg \n5.delete at end \n6.delete at particular pos\n7.exit \n");

	while (1)
	{
		printf("\n Enter your choice : ");
		scanf("%d", &n);
		switch (n)
		{
		case 1:
			insertion();
			break;

		case 2:
			display();
			break;

		case 3:
			insertat();
			break;

		case 4:
			deletebeg();
			break;

		case 5:
			deleteend();
			break;

		case 6 :
			display(); 
			deleteat();
			break;

		case 7:
			exit(0);
			

		default:
			printf("enter a valid choice!!");
			break;
		}
	}
}
