import java.io.*;
public class Lab6A {
   public static void main(String args[]) throws IOException {
      //Creating FileReader object
      File file = new File("C:\\Users\\srini\\Desktop\\a.txt");
      FileReader reader = new FileReader(file);
      char chars[] = new char[(int) file.length()];
 
      reader.read(chars);
      File out = new File("C:\\Users\\srini\\Desktop\\a.txt");
      FileWriter writer = new FileWriter(out);
      writer.write(chars);
     
      System.out.println("Data successfully written in the specified file");
      writer.close();
      reader.close();
     String s="2-cse-a: 2020-2024";
      char c[]=new char[s.length()];
      s.getChars(0, s.length(), c, 0);
      BufferedReader br=new BufferedReader(new CharArrayReader(c));
      int x;
      while((x=br.read())>=0)
    	  System.out.print((char)x);
      BufferedWriter bw=new BufferedWriter(new FileWriter("C:\\Users\\srini\\Desktop\\a.txt"));
      bw.write(s);
      bw.close();
      br.close();
      
      System.out.println();
      String s1="VIVA VVIT 2021";
      char c1[]=new char[s.length()];
      s.getChars(0, s1.length(), c1, 0);
      
      CharArrayWriter cw=new CharArrayWriter();
      cw.write(c1);
      String s2=cw.toString();
      System.out.println("Data in stream is:");
      CharArrayReader cr=new CharArrayReader(c1);
      int x1;
      while((x1=cr.read())>=0)
    	  System.out.print((char)x1);
      cw.close();
      cr.close();
    	  
      
      
      
    		  
   }
}

