import java.util.Scanner;
class SavingsAccount{
			 double annual_interest_rate;
			private long savingsbalance;
			long getSavingsbalance() {
				return savingsbalance;
			}
			void setSavingsBalance(long savingsbalance) {
				this.savingsbalance = savingsbalance;
			}
			 void modifyInterestRate(double s) {
				annual_interest_rate=s/100.0;
			}
			 
			double calculateMonthlyInterest() {
			      double p= ((annual_interest_rate*getSavingsbalance())/12.0);
			      return p;
			}
			double savingsBalance() {
				return getSavingsbalance()+calculateMonthlyInterest();
			}
			
		}
public class lab3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

				Scanner sc=new Scanner(System.in);
				SavingsAccount saver1=new SavingsAccount();
				SavingsAccount saver2=new SavingsAccount();
				saver1.setSavingsBalance(2000);
				saver2.setSavingsBalance(3000);
				saver1.modifyInterestRate(4);
				saver2.modifyInterestRate(4);
				System.out.println("The monthly intersets of saver1:"+saver1.calculateMonthlyInterest());
				System.out.println("The monthly intersets of saver2:"+saver2.calculateMonthlyInterest());
				
				System.out.println("The balance saver1:"+saver1.savingsBalance());
				System.out.println("The balance of saver2:"+saver2.savingsBalance());
				saver1.modifyInterestRate(5);
				saver2.modifyInterestRate(5);
				System.out.println("The monthly intersets of saver1:"+saver1.calculateMonthlyInterest());
				System.out.println("The monthly intersets of saver2:"+saver2.calculateMonthlyInterest());
				
				System.out.println("The balance saver1:"+saver1.savingsBalance());
				System.out.println("The balace of saver2:"+saver2.savingsBalance());
				sc.close();
			

		
		
	}

}
