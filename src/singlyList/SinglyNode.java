package singlyList;

import DoublyLinkedList.Node;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

class SNode{
    int data;
    SNode next;

    public SNode( int data) {
        this.next = null ;
        this.data = data;
    }

    @Override
    public String toString() {
        return "SNode{" +
                "data=" + data +
                ", next=" + next +
                '}';
    }
}

class SinglyList{
    SNode head;

    public void add(int data){
        SNode newNode= new SNode(data); //{data : 1, next:null }
        System.out.println("Data : "+ newNode.data+"----"+newNode.next+"++++"+head);

//        if(head==null){
//            head=newNode;
//        }else {
//            SNode current=head;
//
//            while (current.next!=null){
//                System.out.println("In While : next.data "+current.next.data+" current Data: "+ current.next.data);
//                current =current.next;
//            }
//            current.next=newNode;
//
//        }

        if(head==null){
            head=newNode;
            System.out.println("iffffffffffffffff");
        }else{
            SNode current =head;
            while (current.next!=null){
                System.out.println("in Loop "+"====="+ head.toString());
//                System.out.println("in Loop "+data+" ------ "+current.data+" ======== "+current.next+"   "+current.next.data +"      "+current.next.next);
                current =current.next;
                System.out.println("in Loop "+"++++++++++"+ head.toString());
            }
            current.next = newNode;
            System.out.println(current.toString()+"Final Step xxxxxxxx"+ head.toString());
        }

    }

    @Override
    public String toString() {
        return "SinglyList{" +
                "head=" + head +
                '}';
    }

    public void display() {
        SNode current = head;
        System.out.print("List: ");
        while (current != null) {
            System.out.print(current.data+ " ");
            current = current.next;
        }
        System.out.println();
    }
}

public class SinglyNode {
    public static void main(String[] args) {
        SinglyList sll= new SinglyList();
        sll.add(1);
        sll.add(2);
        sll.add(3);
        sll.add(5);
        System.out.println(sll.toString());
        sll.display();


    }

}



