package org.example.datastructure;

public class Node {
    public int data;
    public Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }

    public void addNext(Node node){
        this.next= node;
    }



}
