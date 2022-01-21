import java.util.InputMismatchException;
import java.util.Scanner;
public class Lab11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		        Scanner scan = new Scanner(System.in);
		        try {
		            System.out.println("enter value of a:");
		            int a = scan.nextInt();
		            System.out.println("enter value of b:");
		            int b = scan.nextInt();
		            int c = a/b;
		            System.out.println("the value of c is :"+c);

		        }
		        catch(ArithmeticException ae) {
		            System.out.println(ae);
		        }
		        catch(InputMismatchException me) {
		            System.out.println(me);
		        }
		    }
		


	}


