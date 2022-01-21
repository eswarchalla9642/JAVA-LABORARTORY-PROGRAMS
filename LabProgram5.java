import java.util.Scanner;
class BinarySearch{
	int a[]=new int[100];
	int key,n;
	BinarySearch(int a[],int b,int c){
		this.a=a;
		n=b;
		key=c;
	}
	void binarysearch() {
	int mid,lb=0,ub=n-1;
	while(lb<=ub) {
		mid=(ub+lb)/2;
		if(key==a[mid]) {
			System.out.println("Key found at:"+mid);
			System.exit(0);
		}
		else
			if(a[mid]>key)
				ub=mid-1;
		else
			lb=mid+1;
			
		}
	System.out.println("Key not found");
	}
}


public class LabProgram5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int a[]=new int[100];
		int n,i,key;
		System.out.println("Enter no of elements in the array:");
		n=sc.nextInt();
		System.out.println("Enter elements in the array:");
		for(i=0;i<n;i++) {
			a[i]=sc.nextInt();
		}
		System.out.println("Enter the key:");
		key=sc.nextInt();
		BinarySearch b1=new BinarySearch(a,n,key);
		b1.binarysearch();
		sc.close();
		

	}

}
