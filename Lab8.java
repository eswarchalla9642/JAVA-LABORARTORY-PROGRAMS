import java.util.Scanner;
class Employee{
	String Emp_name;
	long Emp_id;
	String address;
	String Mail_id;
	long Mobile_no;
	double hra,da,basicpay,pf,staffclub,gross,net;
	public Employee(String name, long id, String add, String mail, long mobile) {
		// TODO Auto-generated constructor stub
		Emp_name=name;
		Emp_id=id;
		address=add;
		Mail_id=mail;
		Mobile_no=mobile;
	}
	void disp() {
		System.out.println("EMP NAME:"+Emp_name);
		System.out.println("EMP ID:"+Emp_id);
		System.out.println("EMP ADDRESS:"+address);
		System.out.println("EMP MAIL ID:"+Mail_id);
		System.out.println("EMP MOBILE NUMBER:"+Mobile_no);
	}
	void show() {
		System.out.println("BASIC PAY:"+basicpay);
		System.out.println("DA:"+da);
		System.out.println("HRA:"+hra);
		System.out.println("GROSS SALARY:"+gross);
		System.out.println("NET SALARY:"+net);
	}
}
class Programmer extends Employee{
	Programmer(String name, long id,String add,String mail,long mobile){
		super(name,id,add,mail,mobile);
	}
	void setBasicPay(double p) {
		basicpay=p;
	}
	void bill() {
		da=basicpay*0.97;
		hra=basicpay*0.1;
		pf=basicpay*0.12;
		staffclub=basicpay*(0.1/100);
		gross=basicpay+da+hra+pf;
		net=gross-pf-staffclub;
		disp();
		show();
	} }
class Assistant_Professor extends Employee{
	Assistant_Professor(String name, long id,String add,String mail,long mobile){
		super(name,id,add,mail,mobile);
	}
	void setBasicPay(double p) {
		basicpay=p;
	}
	void bill() {
		da=basicpay*0.94;
		hra=basicpay*0.09;
		pf=basicpay*0.13;
		staffclub=basicpay*(0.09/100);
		gross=basicpay+da+hra+pf;
		net=gross-pf-staffclub;
		disp();
		show();
	} 
}
class Associate_Professor extends Employee{
	Associate_Professor(String name, long id,String add,String mail,long mobile){
		super(name,id,add,mail,mobile);
	}	
	void setBasicPay(double p) {
		basicpay=p;
	}	
	void bill() {
		da=basicpay*0.96;
		hra=basicpay*0.2;
		pf=basicpay*0.11;
		staffclub=basicpay*(0.1/100);
		gross=basicpay+da+hra+pf;
		net=gross-pf-staffclub;
		disp();
		show();
	} 
}
class Professor extends Employee{
	Professor(String name, long id,String add,String mail,long mobile){
		super(name,id,add,mail,mobile);
	}
	void setBasicPay(double p) {
		basicpay=p;
	}
	void bill() {
		da=basicpay*0.97;
		hra=basicpay*0.1;
		pf=basicpay*0.12;
		staffclub=basicpay*(0.1/100);
		gross=basicpay+da+hra+pf;
		net=gross-pf-staffclub;
		disp();
		show();
	} 
}
public class Lab8 {
public static void main(String[] args) {
// TODO Auto-generated method stub
	Scanner sc=new Scanner(System.in);
	System.out.println("ENTER THE NAME:");
	String name=sc.nextLine();
	System.out.println("ENTER THE ID:");
	long id=sc.nextLong();
	sc.nextLine();
	System.out.println("ENTER THE ADDRESS:");
	String add=sc.nextLine();
	System.out.println("ENTER THE MAIL ID:");
	String mail=sc.nextLine();
	System.out.println("ENTER MOBILE NO:");
	long mob=sc.nextLong();
	System.out.println("\tEMPLOYEE TYPE");
	System.out.println("1.PROGRAMMER");
	System.out.println("2.ASSISTANT PROFESSOR");
	System.out.println("3.ASSOCIATE PROFESSOR");
	System.out.println("4.PROFESSOR");	
	int choice;
	System.out.println("\nENTER YOUR CHOICE");
	choice=sc.nextInt();
	switch(choice) {
	case 1: Programmer e1=new Programmer(name,id,add,mail,mob);
			System.out.println("ENTER THE BASIC PAY:");
			double m=sc.nextDouble();
			e1.setBasicPay(m);
			e1.bill();
			break;
	case 2: Assistant_Professor e2= new Assistant_Professor(name,id,add,mail,mob);
			System.out.println("ENTER THE BASIC PAY:");
			double m1=sc.nextDouble();
			e2.setBasicPay(m1);
			e2.bill();
			break;
    case 3: Associate_Professor e3=new Associate_Professor(name,id,add,mail,mob);
		System.out.println("ENTER THE BASIC PAY:");
		double m2=sc.nextDouble();
		e3.setBasicPay(m2);
		e3.bill();
		break;
    case 4:Professor e4=new Professor(name,id,add,mail,mob);
		System.out.println("ENTER THE BASIC PAY:");
		double m3=sc.nextDouble();
		e4.setBasicPay(m3);
		e4.bill();
		break;
  }
 }
}
