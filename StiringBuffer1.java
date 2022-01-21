public class StiringBuffer1 {
		public static void main(String[] args) {
			// TODO Auto-generated method stub
	StringBuffer s1=new StringBuffer();
	StringBuffer s2=new StringBuffer("VVIT");
	//char[] ch= {'a','c','e'};
	//StringBuffer s3=new StringBuffer(ch);
	System.out.println("length of string vvit is:"+s2.length());
	System.out.println("capacity of string vvit is:"+s2.capacity());
	s2.ensureCapacity(30);
	System.out.println("after ensureCapacity capacity of string vvit is:"+s2.capacity());
	s2.setLength(7);
	System.out.println("after setting length of string vvit is:"+s2.length());
	System.out.println("Before setting char at 2nd position is:" +s2.charAt(2));
	s2.setCharAt(2,'k');
	System.out.println("after setting char at 2nd position is:" +s2.charAt(2));
	char[] ch=new char[10];
	s2.getChars(0, 3, ch, 0);
	System.out.println(ch);
	s2.append("clg");
	System.out.println(s2);
	s2.insert(5, "study");
	System.out.println(s2);
	System.out.println(s2.reverse());
	System.out.println(s2.delete(3,6));
	System.out.println(s2.deleteCharAt(8));
	System.out.println(s2.replace(2 ,4, "vvit"));
	System.out.println(s2.substring(4));
	System.out.println(s2.substring(4,8));
	System.out.println("length of empty sting is:"+s1.length());







		}

	}


