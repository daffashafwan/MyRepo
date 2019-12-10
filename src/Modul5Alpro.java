import java.util.Scanner;

class Node3{
    Node3 kiri,kanan;
    char data;

    public Node3(char data) {
        this.data = data;
        this.kiri = null;
        this.kanan = null;
    }
}
class Node4{
    Node4 kiri,kanan;
    int data;
    public Node4(int data) {
        this.data = data;
        this.kiri = null;
        this.kanan = null;
    }
}
class BinaryTree{
    Node3 root;
    Node4 root2;
    char data;
    int data2;
//    public Node3 tambahDataRekurs(Node3 tunjuk, char dataBaru){
//        if (tunjuk==null){
//            return new Node3(dataBaru);
//        }
//
//        if(dataBaru<tunjuk.data){
//            tunjuk.kiri=tambahDataRekurs(tunjuk.kiri,dataBaru);
//        }else if(dataBaru>tunjuk.data){
//            tunjuk.kiri=tambahDataRekurs(tunjuk.kanan,dataBaru);
//        }else{
//            return tunjuk;
//        }
//        return tunjuk;
//    }
//    public void tambahData(char dataBaruu){
//            root = tambahDataRekurs(root, dataBaruu);
//    }
    public void newData(char dataBaru){
        root = newData(root, new Node3(dataBaru));
    }
    public Node3 newData(Node3 root, Node3 addNew){
        if(root==null){
            root = addNew;
            return root;
        }
        if (addNew.data<root.data){
            root.kiri=newData(root.kiri,addNew);
        }else{
            root.kanan=newData(root.kanan,addNew);
        }
        return root;

    }
    public void inOrder(Node3 node){
        if(node!=null){
            inOrder(node.kiri);
            System.out.print(node.data+ " ");
            inOrder(node.kanan);
        }
    }
    public void preOrder(Node3 node){
        if(node!=null){
            System.out.print(node.data+ " ");
            preOrder(node.kiri);
            preOrder(node.kanan);
        }
    }
    public void postOrder(Node3 node){
        if(node!=null){
            postOrder(node.kiri);
            postOrder(node.kanan);
            System.out.print(node.data+ " ");
        }
    }


    public void newDataAscii(int dataBaru){
        root2 = newDataAscii(root2, new Node4(dataBaru));
    }
    public Node4 newDataAscii(Node4 root, Node4 addNew){
        if(root==null){
            root = addNew;
            return root;
        }
        if (addNew.data<root.data){
            root.kiri=newDataAscii(root.kiri,addNew);
        }else{
            root.kanan=newDataAscii(root.kanan,addNew);
        }
        return root;

    }
    public void inOrderAscii(Node4 node){
        if(node!=null){
            inOrderAscii(node.kiri);
            System.out.print(node.data+ " ");
            inOrderAscii(node.kanan);
        }
    }
    public void preOrderAscii(Node4 node){
        if(node!=null){
            System.out.print(node.data+ " ");
            preOrderAscii(node.kiri);
            preOrderAscii(node.kanan);
        }
    }
    public void postOrderAscii(Node4 node){
        if(node!=null){
            postOrderAscii(node.kiri);
            postOrderAscii(node.kanan);
            System.out.print(node.data+ " ");
        }
    }



}
public class Modul5Alpro {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BinaryTree bt = new BinaryTree();
        System.out.println("Masukkan String : ");
        String input = sc.next();
        char[] coba =input.toCharArray();
        for(char c:coba){
            bt.newData(c);
        }
        for(char c:coba){
            int ascii = c;
            bt.newDataAscii(ascii);
        }

        System.out.println("In Order : ");
        bt.inOrder(bt.root);
        System.out.println("\npre Order : ");
        bt.preOrder(bt.root);
        System.out.println("\npost Order : ");
        bt.postOrder(bt.root);
        System.out.println("");
        System.out.println("Ascii");
        System.out.println("Ascii In Order");
        bt.inOrderAscii(bt.root2);
        System.out.println("\nAscii pre Order");
        bt.preOrderAscii(bt.root2);
        System.out.println("\nAscii post Order");
        bt.postOrderAscii(bt.root2);

//        System.out.println("");
//        bt.inOrder(bt.root);
//        System.out.println("");
//        bt.preOrder(bt.root);
//        System.out.println("");
//        bt.postOrder(bt.root);

    }
}
