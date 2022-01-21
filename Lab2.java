import java.util.Scanner;
public class Lab2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int  p,c,cno;
		String type1="domestic",type;
		double units;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("enter consumer number");
		cno = sc.nextInt();
		System.out.print("enter previous Reading");
		p = sc.nextInt();
		System.out.print("enter current reading");
		c = sc.nextInt();
		System.out.print("enter type of connection");
		type = sc.next();
		sc.close();
		units=c-p;
		if(type.equalsIgnoreCase(type1))
		{
			if(units<=100)
				System.out.println("the amount to be paid = "+units*1);
			else if(units>100 & units<=200)
			{	units = units-100;
			    System.out.println("the amount to be paid = "+(units*2.5+100));
			}
			else if(units>200 & units<=500)
			{	units = units-200;
			    System.out.println("the amount to be paid = "+(units*4+100+250));
			}
			else if(units>500)
			{	units = units-500;
			    System.out.println("the amount to be paid = "+(units*6+100+250+1200));
			}
		}
		else
		{
			if(units<=100)
				System.out.println("the amount to be paid = "+units*2);
			else if(units>100 & units<=200)
			{	units = units-100;
			    System.out.println("the amount to be paid = "+(units*4.50+200));
			}
			else if(units>200 & units<=500)
			{	units = units-200;
			    System.out.println("the amount to be paid = "+(units*6+200+450));
			}
			else if(units>500)
			{	units = units-500;
			    System.out.println("the amount to be paid = "+(units*7+200+450+1800));
			}
			
		}

	}

}
