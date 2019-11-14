public class Modul4Alpro2 {
    public int faktorial(int n){
        if(n==0){
            return 1;
        }else{
            System.out.println("ini faktorialnya : "+n);
            return n*faktorial(n-1);
        }

    }
    public static void main(String[] args) {
        Modul4Alpro2 ab = new Modul4Alpro2();
        System.out.println(ab.faktorial(5));
    }
}
