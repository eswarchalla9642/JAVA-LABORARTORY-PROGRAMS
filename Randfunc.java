 class DieNum  {
    int facevalue;
    public int roll() {
        facevalue = (int)((Math.random()*6)+1);
        return facevalue;
    }
}

public class Randfunc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        DieNum d1 = new DieNum();
        DieNum d2 = new DieNum();
        int count = 0;
        for(int i = 0;i<10000;i++){
            int f1 = d1.roll();
            int f2 = d2.roll();
            if(f1 == f2){
                count = count+1;
            }
        }
        System.out.println("the count value is :" +count);


	}

}
