package timecov;

public class Timeconversion {
	double hr,min,sec;
	public void hrtomin(double hr)
	{
		this.hr=hr;
		System.out.println(" min = "+hr*60);
	}
	public void mintohr(double min)
	{
		this.min=min;
		System.out.println(" hrs = "+min/60);
	}
	public void hrtosec(double hr)
	{
		this.hr=hr;
		System.out.println(" sec = "+hr*60*60);
	}
	public void sectohr(double sec)
	{
		this.sec=sec;
		System.out.println("hours = "+sec/(60*60));
	}

}
