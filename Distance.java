package distanceconv;
public class Distance {
		double km,m,mile;
		public void kmtom(double km)
		{
			this.km=km;
			System.out.println("in meters "+km*1000);
		}
		public void mtokm(double m)
		{
			this.m=m;
			System.out.println("in kilometers "+m/1000);
		}
		public void miletom(double mile)
		{
			this.mile=mile;
			System.out.println("in meters "+mile/1.6);
		}
		public void mtomile(double m)
		{
			this.m=m;
			System.out.println("in miles "+m*1.6);
		}
	}