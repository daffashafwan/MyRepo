import java.util.Scanner;

class Node{
    char data;
    Node next;
    Node prev;
    public Node(char data)
    {
        this.data = data;
    }
}
class Stack{
    Node head;
    Node first;
    public Stack(){
        head = null;
        first = null;
    }
    public void push(char dataBaru){
        Node nodbaru = new Node(dataBaru);
        if(head==null){
            head = nodbaru;
            first = nodbaru;
        }else{
            head.next = nodbaru;
            nodbaru.prev=head;
            head = nodbaru;
        }
    }
    public void pop(){
        char dataPop = '\u0000';
        if(head==null){
            System.out.println("Tidak ada data !");
        }else{
            dataPop=head.data;
            head = head.prev;
            if(head==null){
                first=null;
            }else{
                head.next=null;
            }
        }
        System.out.print(dataPop);
    }
    public void printStack(){
        Node pilih = first;
        System.out.println("Data Stack : ");
        while(pilih!=null){
            System.out.print(pilih.data);
            pilih = pilih.next;
        }
        System.out.println("");
    }
    public void Reversed(){
        Node pilih = head;
        while(pilih!=null){
            pop();
            pilih=pilih.prev;
        }
    }
}
public class Modul4StrukDat {
    public static void main(String[] args) {
        Stack st = new Stack();
        Scanner sc = new Scanner(System.in);
        System.out.println("Masukkan String : ");
        String input = sc.next();
        char[] coba =input.toCharArray();
        for(char c:coba){
            st.push(c);
        }

        st.printStack();
        System.out.println("Setelah dibalik : ");
        st.Reversed();
    }
}