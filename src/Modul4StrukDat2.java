import java.util.Scanner;

class Node2{
    String dataPasien;
    Node2 next;
    Node2 prev;
    public Node2(String pasien) {
        this.dataPasien = pasien;
    }
}
class Queue{
    Node2 head;
    Node2 tail;

    public Queue() {
        this.head = null;
        this.tail = null;
    }
    public void enqueue(String pasienBaru){
        Node2 nodBaru = new Node2(pasienBaru);
        if(head==null){
            head = nodBaru;
            tail = nodBaru;
        }else{
            tail.next = nodBaru;
            tail = nodBaru;
        }
    }
    public String dequeue(){
        String dataBuang = null;
        if(head==null){
            System.out.println("Tidak ada data");
        }else{
            dataBuang = head.dataPasien;
            head = head.next;
        }
        return dataBuang;
    }
    public void peek(){
        System.out.println("Antrian terdepan : "+head.dataPasien);
        System.out.println("Antrian terbelakang : "+tail.dataPasien);
    }
    public boolean isEmpty(){
        if(head==null){
            return true;
        }else{
            return false;
        }
    }
    public int size(){
        Node2 pilih = head;
        int i = 0;
        while(pilih!=null){
            i++;
            pilih = pilih.next;
        }
        return i;
    }
}
class menu{
    Queue qq = new Queue();
    Scanner sc = new Scanner(System.in);
    void menuRS(){
        int pilihan = 1;
        while(pilihan==1){
            System.out.println("==Sistem Administrasi Rumah Sakit Infotech==");
            System.out.println("Menu : ");
            System.out.println("1. Input Data Pasien Baru\n2. Panggil Antrian Pasien\n3. Cek Jumlah Antrian\n4. Cek Antrian terdepan dan terbelakang");
            System.out.print("Masukkan Pilihan : ");
            int input = sc.nextInt();
            switch (input){
                case 1:
                    System.out.print("Masukkan data Pasien : ");
                    String dataPasienBaru = sc.next();
                    qq.enqueue(dataPasienBaru);
                    break;
                case 2:
                    qq.dequeue();
                    break;
                case 3:
                    System.out.println("Jumlah Antrian : "+qq.size());
                    break;
                case 4:
                    qq.peek();
                    break;
                default:
                    System.out.println("Tidak Ada pilihan itu");
            }
            System.out.println("Ingin Ke menu lagi (1/0): ");
            pilihan = sc.nextInt();
        }
        System.out.println("Program Selesai");
    }
}

public class Modul4StrukDat2 {
    public static void main(String[] args) {
        menu mn = new menu();
        mn.menuRS();
    }
}
