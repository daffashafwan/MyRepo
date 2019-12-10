import java.lang.StringBuilder;
import java.util.Scanner;

class Reversed{
    String kata, kataReversed;
    int i;

    public Reversed(String kata) {
        this.kata = kata;
    }
    public void reversed(){
        kataReversed = "";
        for(i=kata.length()-1;i>=0;i--){
            kataReversed = kataReversed + kata.charAt(i);

        }
        System.out.println("Setelah Di Reverse : "+kataReversed);
    }
}
public class Modul6Alpro {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Masukkan Kata : ");
        String kata = sc.nextLine();
        StringBuilder sb = new StringBuilder(kata);
        Reversed rv = new Reversed(kata);
        rv.reversed();
        System.out.println("Dengan String Builder");
        System.out.println(sb.reverse().toString());
    }
}

