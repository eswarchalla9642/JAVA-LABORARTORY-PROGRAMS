import java.util.Scanner; 
class Invoice
{
	private String pnum;
	private String pdes;
	private int quantity;
	private double price;
	public String getPnum() {
		return pnum;
	}
	public void setPnum(String pnum) {
		this.pnum = pnum;
	}
	public String getPdes() {
		return pdes;
	}
	public void setPdes(String pdes) {
		this.pdes = pdes;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	double getInvoiceAmount()
	{
		if(quantity<0||price<0)
			return 0.0;
		else
			return quantity*price;
	}
}
public class InvoiceTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Invoice iv = new Invoice();
		System.out.print("Enter part number:");
		iv.setPnum(sc.next());
		System.out.print("Enter part description:");
		iv.setPdes(sc.next());
		System.out.print("Enter quantity:");
		iv.setQuantity(sc.nextInt());
		System.out.print("Enter Price :");
		iv.setPrice(sc.nextDouble());
		System.out.print("the amount = "+iv.getInvoiceAmount());
		sc.close();
		
		

	}

}
