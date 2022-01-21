import java.util.Scanner;
class Book{
	private String bname;
	private long ISBN_num;
	private String author_name;
	private String publisher;
	
	 String getbname() {
		return bname;
	}
	void setBname(String bname) {
		this.bname = bname;
	}
	long getISBN_num() {
		return ISBN_num;
	}
	void setISBN_num(long ISBN_num) {
		this.ISBN_num = ISBN_num;
	}
	String getAuthor_name() {
		return author_name;
	}
	void setAuthor_name(String author_name) {
		this.author_name = author_name;
	}
	String getPublisher() {
		return publisher;
	}
	void setPublisher(String publisher) {
		this.publisher = publisher;
	}
	void description() {
		System.out.println("The description:\n"+"BookName:"+getbname()+"\nISBN number:"+getISBN_num()+"\nAuthor name:"+getAuthor_name()+"\n"
				+ "Publisher:"+getPublisher());
	}
}
public class Lab4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Book b[]=new Book[30];
		Scanner sc=new Scanner(System.in);
		int n,i,isbn;
		String author,publisher,name;
		System.out.println("Enter the number of books:");
		n=sc.nextInt();
		for(i=0;i<n;i++) {
			b[i]=new Book();
			System.out.println("Book Details-"+(i+1));
			if(i==0)
			sc.nextLine();
			System.out.println("Enter the name of book:");
			name=sc.nextLine();
			b[i].setBname(name);
			System.out.println("Enter the ISBN of book:");
			isbn=sc.nextInt();
			b[i].setISBN_num(isbn);
			sc.nextLine();
			System.out.println("Enter the name of author:");
			author=sc.nextLine();
			b[i].setAuthor_name(author);
			
			System.out.println("Enter the publisher:");
			publisher=sc.nextLine();
			b[i].setPublisher(publisher);
			}
		for(i=0;i<n;i++) {
			System.out.println("Book-"+(i+1));
			b[i].description();
		}
		sc.close();

	}

}
