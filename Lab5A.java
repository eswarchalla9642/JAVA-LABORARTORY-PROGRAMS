import java.io.*;
public class Lab5A {

	public static void main(String[] args)throws IOException {
		// TODO Auto-generated method stub
		String s="JAVA IS AN OBJECT ORIENTED LANGUAGE AND EASY TO LEARN";
		byte b1[]=s.getBytes();
		for(int i=0;i<b1.length;i++)
		{
			System.out.print((char)b1[i]);
			
		}
		ByteArrayInputStream bis=new ByteArrayInputStream(b1);
		int c;
		System.out.println();
		while((c=bis.read())!=-1)
		{
			char ch;
			ch=(char)c;
			System.out.print(Character.toLowerCase(ch));
		}
		System.out.println();
		ByteArrayOutputStream bos=new ByteArrayOutputStream();
		bos.write(b1);
		String s1=bos.toString();
		System.out.printf(s1);
		DataOutputStream dos=new DataOutputStream(new FileOutputStream(
		"C:\\Users\\srini\\Desktop\\a.txt"));
		dos.writeInt(32);
		dos.writeChar('p');
		System.out.println("");
		DataInputStream dow=new DataInputStream(new FileInputStream(
		"C:\\\\Users\\srini\\Desktop\\a.txt"));
		System.out.println(dow.readInt());
		System.out.println(dow.readChar());
	}

}
