import java.util.*;

public class Test{


    private int a;
    private int b;

    Test(int a , int b){
        this.a = a;
        this.b = b;
    }

    public int sum(){
        return a + b;
    }

    public static void main(String args[]){

        Scanner sc =new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        sc.close();
        
        Test t = new Test(a,b);


        System.out.println(t.sum());

    }

}