package currencyconve;
public class Currency {
		double rupee,yen,dollor,euro;
		public void dollortorupee(double x)
		{
			dollor=x;
			System.out.println("dollar to rupee is "+(68*dollor));
		}
		public void rupeetodollor(double x)
		{
			rupee=x;
			System.out.println("rupee to dollor is "+(rupee/68.0));
		}
		public void rupeetoyen(double x)
		{
			rupee=x;
			System.out.println("rupee to yen is "+(rupee*1.54));
		}
		public void yentorupee(double x)
		{
			yen=x;
			System.out.println("yen to rupee is "+(yen*0.65));
		}
		public void rupeetoeuro(double x)
		{
			rupee=x;
			System.out.println("rupee to euro is "+(rupee*84.54));
		}
		public void eurotorupee(double x)
		{
			euro=x;
			System.out.println("euro to rupee is "+(euro/84.54));
		}
}


