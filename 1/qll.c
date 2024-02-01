#include <stdio.h>
#include <stdlib.h>

struct node
{
	int data;
	struct node *next;
};
struct node *temp, *head,*rear;

struct node *create(int val)
{
	struct node *node = (struct node *)malloc(sizeof(struct node));
	node->data = val;
	node->next = NULL;
	return node;

}
void display()
{
	temp = head;
	while (temp != NULL)
	{

		printf("%d  ", temp->data);
		temp = temp->next;
	}
}



void insertion()
{
	int val;
	printf("ENter the value : ");
	scanf("%d", &val);
	struct node *new = create(val);

	if (head == NULL)
		head = new;
	else
	{
		temp = head;
		while (temp->next != NULL)
			temp = temp->next;
		temp->next = new;
	}
}
struct node *del;



void deletebeg()
{
	if(head==NULL)
	{
	printf("q is underflow");
	return;
	}
	del = head;
	head = head->next;
	printf("%d is dequeued", del->data);
	
	free(del);

}

void main()
{
	int n;
	printf("1.ENqueue \n2.Dequeue\n3.display\n4.exit \n");

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
			deletebeg();
			break;

		case 3:
			
			display();
			break;

		case 4:
			exit(0);

		default:
			printf("enter a valid choice!!");
			break;
		}
	}
}
