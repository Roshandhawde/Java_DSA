package DoublyLinkedList;

import java.util.Collection;
import java.util.LinkedList;
import java.util.List;

public class Node {
    int data;
    Node prev;
    Node next;

    Node(int data){
        this.data=data;
        this.next=null;
        this.prev=null;
    }


    class DoublyLinkdList{
        Node head;
        Node tail;

public void add(int data){
    Node newNode= new Node(data);

    if(head==null){
        head=tail=newNode;

    }else{
       tail.next=newNode;
       newNode.prev=tail;
       tail=newNode;

    }
}
    }

    public static void main(String[] args) {
        LinkedList<Integer> dList = new LinkedList<>();
        dList.add(1);
        dList.add(2);
        dList.add(3);
        dList.add(4);

        System.out.println(dList.get(2));
    }
}
