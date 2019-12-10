
import java.text.ParseException;
import java.util.Scanner;

class binarySearch{
   // Number[] num = {1.0,24343433,3,4,5};
    Number[] data;
    Number target;

    public binarySearch(Number[] data) {
        this.data = data;
    }

    public void setTarget(Number target){
        this.target = target;
    }

    public int isTargetFound() {
        Number[] hasilSorting = sortingData();
        int low = 0;
        int high = hasilSorting.length-1;
        while(high >= low){
            int middle = (low+high)/2;
            if(Double.parseDouble(hasilSorting[middle].toString())==Double.parseDouble(target.toString())){
                return middle;
            }
            if(Double.parseDouble(hasilSorting[middle].toString())<Double.parseDouble(target.toString())){
                low = middle+1;
            }
            if(Double.parseDouble(hasilSorting[middle].toString())>Double.parseDouble(target.toString())){
                high = middle+1;
            }
        }
        return -1;
    }
    Number[] sortingData()  {
        Number temp;
        for(int i = 0;i<data.length;i++){
            for(int j = 0;j<data.length-1;j++){
                if(Double.parseDouble(data[j].toString())>Double.parseDouble(data[j+1].toString())){
                    temp = data[i];
                    data[i]=data[j];
                    data[j]= temp;
                }
            }
        }
        System.out.println("Data setelah diurutkan : ");
        for (int i =0 ; i<data.length;i++){
            System.out.print(data[i]+" ");
        }
        return data;
    }

}
public class Modul5Strukdat {
    public static void main(String[] args) throws ParseException {
        Number[] num = {3,45,6.4,5434523};
        binarySearch bs = new binarySearch(num);
        bs.setTarget(6.4);
        System.out.println("\nAda di indeks ke = "+bs.isTargetFound());


    }
}
