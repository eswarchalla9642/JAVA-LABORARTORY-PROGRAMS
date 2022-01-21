
	import java.io.*;
	import java.util.*;
	public class Lab15 {

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			String fname;
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter the filenmae:");
			fname=sc.nextLine();
			File f1=new File(fname);
			System.out.println("File name:"+f1.getName());
			System.out.println("Executable File:"+f1.canExecute());
			System.out.println("Readable:"+f1.canRead());
			System.out.println("Writable:"+f1.canWrite());
			System.out.println("Existance of the file:"+f1.exists());
			System.out.println("Parent File"+f1.getParentFile());
			System.out.println("File size in bytes:"+f1.length());
		}

	}

