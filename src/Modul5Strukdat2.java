import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Scanner;

class FibonacciSearch{
    String[] data;
    String target;
    int lengthArr;

    public FibonacciSearch(String[] data) {
        this.data = data;
        this.lengthArr = data.length;
    }

    public void setTarget(String target){
        this.target=target;
    }
    public String bubbleSort(){
        for(int i=0;i<data.length;i++){
            for (int j=0;j<data.length-1;j++){
                if (data[j].compareTo(data[j+1])>0){
                    String temp = data[j];
                    data[j]=data[j+1];
                    data[j+1]=temp;
                }
            }
        }
        return Arrays.toString(data);
    }
    public int min(int x, int y){
        return (x<=y)?x:y;
    }
    public int searchTarget(){
        int fibMMm0 = 0;
        int fibMMm1 = 1;
        int fibM = fibMMm0 + fibMMm1;
        while(fibM<lengthArr){
            fibMMm0 = fibMMm1;
            fibMMm1 = fibM;
            fibM = fibMMm0 + fibMMm1;
        }
        int offset = -1;
        while(fibM>1){
            int i = min(offset+fibMMm0,lengthArr-1);
            if (data[i].compareTo(target)<0){
                fibM = fibMMm1;
                fibMMm1 = fibMMm0;
                fibMMm0 = fibM - fibMMm1;
                offset = i;
            }else if(data[i].compareTo(target)>0){
                fibM = fibMMm0;
                fibMMm1 = fibMMm1 - fibMMm0;
                fibMMm0 = fibM - fibMMm1;
            }else{
                return i;
            }
        }
        if(fibMMm1 == 1&& data[offset+1]==target){
            return offset+1;
        }
        return -1;
    }

}

public class Modul5Strukdat2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Masukkan String : ");
        String input = sc.nextLine();
        String[] splitInput = input.split("\\s+");
        FibonacciSearch fs = new FibonacciSearch(splitInput);
        System.out.println("\nHasil Sort : "+fs.bubbleSort());
        System.out.println("Input yang ingin dicari : ");
        String cari = sc.next();
        fs.setTarget(cari);
        System.out.println("Ada di index ke : "+fs.searchTarget());

    }
}