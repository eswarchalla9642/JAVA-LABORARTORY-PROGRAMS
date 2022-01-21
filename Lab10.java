import currencyconve.Currency;
import distanceconv.Distance;
import timecov.Timeconversion;
import java.util.Scanner;
public class Lab10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i;
		Currency c1 = new Currency();
		Distance d1 = new Distance();
		Timeconversion tc = new Timeconversion();
		Scanner sc = new Scanner(System.in);
		System.out.println("1.kilometers to meters \n2.meters to kilometers\n3.meters to miles\n4.miles to meters");
		System.out.println("5.ruppees to dollor\n6.dollors to ruppes\n7.yen to ruppee\n8.ruppees to yen\n9.ruppees to euros");
		System.out.println("10.euro to ruppe\n11.hours to min\n12.min to hours\n13.hr to sec\n14.sec to hr");
		System.out.println("enter tour choice");
		i = sc.nextInt();
		switch(i)
		{
		case 1:
			System.out.println("enter kilometers");
			d1.kmtom(sc.nextDouble());
			break;
		case 2:
			System.out.println("enter meters");
			d1.mtokm(sc.nextDouble());
			break;
		case 3:
			System.out.println("enter miles");
			d1.miletom(sc.nextDouble());
			break ;
		case 4:
			System.out.println("enter meters");
			d1.mtomile(sc.nextDouble());
			break;
		case 5:
			System.out.println("enter ruppees");
			c1.rupeetodollor(sc.nextDouble());
			break ;
		case 6:
			System.out.println("enter dollors");
			c1.dollortorupee(sc.nextDouble());
			break;
		case 7:
			System.out.println("enter yen");
			c1.yentorupee(sc.nextDouble());
			break;
		case 8:
			System.out.println("enter ruppees");
			c1.rupeetoyen(sc.nextDouble());
			break;
		case 9:
			System.out.println("enter ruppees");
			c1.rupeetoeuro(sc.nextDouble());
			break;
		case 10:
			System.out.println("enter euros");
			c1.eurotorupee(sc.nextDouble());
			break;
		case 11:
			System.out.println("enter hours");
			tc.hrtomin(sc.nextDouble());
			break;
		case 12:
			System.out.println("enter min");
			tc.mintohr(sc.nextDouble());
			break;
		case 13:
			System.out.println("enter hrs");
			tc.hrtosec(sc.nextDouble());
			break;
		case 14:
			System.out.println("enter seconds");
			tc.sectohr(sc.nextDouble());
			break;
		}
		
		
		
	}
	}
