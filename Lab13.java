import java.util.Random;
//class Square
 class Square extends Thread {
    int x;
    Square(int n) {
        x = n;
    }
    public void run() {
        int sqr = x*x;
        System.out.println("square value of " +x +"is :" +sqr);
    }
}

//class Cube
 class Cube extends Thread {
    int x;
    Cube (int n) {
        x = n;
    }
    public void run() {
        int cube;
        cube = x*x*x;
        System.out.println("cube value of " +x+ "is :"+cube);
    }
    
}

//class Number

 class Number extends Thread {
    public  void run() {
        Random random = new Random();
        for(int i=0; i<10; i++) {
            int randomInteger = random.nextInt(100);
            System.out.println("random interger value is :"+randomInteger);
            if(randomInteger%2 == 0) {
                Square s = new Square(randomInteger);
                s.start();
            }else {
                Cube c = new Cube(randomInteger);
                c.start();
            }
            try {
                Thread.sleep(1000);
            }catch(InterruptedException ex) {
                System.out.println(ex);
            }
        }
    }
}


public class Lab13 extends Thread {
	 public static void main(String[] args) {
	        Number num = new Number();
	        num.run();
	        System.out.println("program successfull");
	    }

}
