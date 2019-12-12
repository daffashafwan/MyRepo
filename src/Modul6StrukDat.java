//import java.awt.*;
import java.util.regex.*;
import java.util.*;
class Regex{

    public void Kegiatan1(String input, String inputGanti, String cari){
        Pattern pattern = Pattern.compile(cari, Pattern.CASE_INSENSITIVE);
        Matcher m = pattern.matcher(input);
        if(m.find()){
            System.out.println(m.replaceAll(inputGanti));
        }else{
            System.out.println("Tidak ada kata itu");
        }
    }
    public void kegiatan2(String kalimat1,String kalimat2,String kalimat3, String kunci){
        Pattern pattern = Pattern.compile(kunci, Pattern.CASE_INSENSITIVE);
        Matcher m1 = pattern.matcher(kalimat1);
        Matcher m2 = pattern.matcher(kalimat2);
        Matcher m3 = pattern.matcher(kalimat3);
        System.out.println("Di kalimat 1 kata "+'"'+kunci+'"'+" bernilai : "+m1.find());
        System.out.println("Di kalimat 2 kata "+'"'+kunci+'"'+" bernilai : "+m2.find());
        System.out.println("Di kalimat 3 kata "+'"'+kunci+'"'+" bernilai : "+m3.find());
    }

}
public class Modul6StrukDat {
    public static void main(String[] args) {
        Regex rg = new Regex();
        System.out.println("Masukkan Kalimat : ");
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        System.out.println("Kalimat yang di input : "+input);
        System.out.println("Masukkan kata Yang Ingin diganti : ");
        String ganti = sc.next();
        System.out.println("Masukkan Penggantinya : " );
        String pengganti = sc.next();
        rg.Kegiatan1(input, pengganti, ganti);
        rg.kegiatan2("Pak Hardi Cukup Tampan","Pak Obet Juga tampan","tapi lebih tAmpan daffa","pAk");
    }
}
