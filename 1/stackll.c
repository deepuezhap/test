#include <stdio.h>
#include <stdlib.h>

struct node
{
	int data;
	struct node *next;
};
struct node *temp, *head;

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



void insertat(int pos)
{
	int val;
	printf("enter the value and pos : ");
	scanf("%d",&val);
	struct node *new = create(val);
	temp = head;
	if (pos == 1)
	{
		new->next = head;
		head = new;
	}
	
}
struct node *del;



void deletebeg()
{
	del = head;
	head = head->next;
	printf("%d is Popped", del->data);
	free(del);
}

void main()
{
	int n;
	printf("1.PUSH \n2.POP\n3.display\n4.exit \n");

	while (1)
	{
		printf("\n Enter your choice : ");
		scanf("%d", &n);
		switch (n)
		{
		case 1:
			
			insertat(1);
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
