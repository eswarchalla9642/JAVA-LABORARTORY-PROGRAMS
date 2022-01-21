import java.util.Scanner;
 class Lab5 {

	public static  int main(String[] args) {
		// TODO Auto-generated method stub
		int lb=0,key,ub=7,mid;
		int a[]= {5,6,33,66,978,1258,7000};
		Scanner sc = new Scanner(System.in);
		System.out.println(" key ");
		key = sc.nextInt();sc.close();
		while(lb<ub)
		{
		  mid=(ub+lb)/2; 		
		if(a[mid]==key)
		{
			System.out.println("element position="+mid);
			return mid;
		}
		else
		{
			if(a[mid]<key)
				ub=mid-1;
			else
				lb=mid+1;
		}
		
	}
		return -1;

	}
}
