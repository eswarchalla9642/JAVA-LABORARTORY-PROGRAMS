import java.util.Scanner;
class Queue1 
	{
		int max,f,r;
		int q[];
		Queue1()
		{
			f=r=-1;
			max=5;
			q=new int[max];
		}
		void enQueue(int e)
		{
			if(!isFull())
			{
				q[++r]=e;
				if(f==-1)
					f++;
			}
			else
			{
				System.out.println("queue is full");
			}
		}
		void deQueue()
		{
			if(!isEmpty())
			{
				System.out.println("the element which is going to deleted is "+q[f]);
				if(f==r)
					f=r=-1;
				else
					f++;
			}
			else
			{
				System.out.println("queue is empty");
			}
		}
		boolean isEmpty()
		{
			if(f==-1)
				return true;
			else 
				return false;
		}
		boolean isFull()
		{
			if(r==max-1)
				return true;
			else
				return false;
		}
		void display()
		{
			if(!isEmpty())
			{
				for (int i=f;i<=r;i++)
				{
					System.out.println(q[i]);
				}
			}
			else
				System.out.println("Queue is empty");
		}
	}
class Lab4A
	{
		public static void main(String[] args) 
		{
			Queue1 x=new Queue1();
			Scanner s=new Scanner(System.in);
			int ch,ch1;
			while(true)
			{
				System.out.println("enter your choice ");
				ch=s.nextInt();
				switch(ch)
				{
				case 1:
					System.out.println("Enter element:");
					ch1=s.nextInt();
					x.enQueue(ch1);
					break;
				case 2:
					x.deQueue();
					break;
				case 3:
					x.display();
					break;
				default:
					return;
				}
			}
		}
	}
