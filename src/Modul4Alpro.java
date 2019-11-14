import java.util.Scanner;

public class Modul4Alpro {
    static Scanner sc = new Scanner(System.in);
    public int fibonacci(int n){
        if(n<1){
            return 0;
        }else if(n<=2){
            return 1;
        }else{
            return fibonacci(n-1)+fibonacci(n-2);
        }
    }
    public static void main(String[] args) {
        Modul4Alpro aa = new Modul4Alpro();
        int index = 0;
        while(index <= 10){
            System.out.print(aa.fibonacci(index)+" ");
            index++;
        }
        System.out.println("\n"+aa.fibonacci(6));
    }
}
