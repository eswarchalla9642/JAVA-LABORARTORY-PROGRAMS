
public class AddExp1 {


	public static void main(String[] args) {
	// TODO Auto-generated method stub
	char ch[]= {'a','b','c'};
	String s=new String(ch);
	String s1=new String();
	byte ascii[]= {65,66,67,68,69};
	s1="VVIT";
	String s2=new String("cse_a");
	String s3=new String(ch,1,2);
	String s4=new String(ascii,2,3);
	String s5="cse";
	String s7="cse";
	String s6="We are in 2-"+s5+" cls";
	System.out.println(s);
	System.out.println(s1);
	System.out.println(s2);
	System.out.println(s3);
	System.out.println(s4);
	System.out.println(s5);
	System.out.println(s6);
	System.out.println("length of string VVIT is:"+ s1.length());
	Box b=new Box();
	System.out.println(b);
	System.out.println("Acessing a  character at 2 postion in the word VIT :"+"VIT".charAt(2));
	char ch1[]=new char[20];
	s1.getChars(0,2,ch1,0);
	System.out.print("Acessing more than one character from string 1:");
	System.out.println(ch1);
	System.out.println(s1.toCharArray());
	System.out.println("Domestic".equals("domestic"));
	System.out.println("Domestic".equalsIgnoreCase("domestic"));
	System.out.println("college".startsWith("coll"));
	System.out.println("college".endsWith("ege"));
	System.out.println(s1==s2);
	System.out.println(s1==s7);
	System.out.println("vvit".indexOf('v'));
	System.out.println("vvit".lastIndexOf('v'));
	System.out.println(s2.substring(1,3));
	System.out.println(s2.concat(s3));
	System.out.println(s6.replace('w', 's'));
	System.out.println(s6.toLowerCase());
	System.out.println(s6.toUpperCase());









	}

	}
	class Box{
	String i="Dimension:";
	int j=5;
	public String toString() {
	return i+ j;

	}
	}


