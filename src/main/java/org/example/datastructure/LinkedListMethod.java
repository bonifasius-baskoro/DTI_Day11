package org.example.datastructure;

public class LinkedListMethod {

    public static void loopElement(Node head){
        Node nodeTemp = head;
        do{
            System.out.println(nodeTemp.data);
            nodeTemp = nodeTemp.next;
        } while(nodeTemp.next != null);
        System.out.println(nodeTemp.data);
    }

    public static boolean addElement(Node node, Node nodeBefore){
        Node beforeNode = nodeBefore;
        while(beforeNode.next!= null){
            System.out.println(beforeNode.data);
            System.out.println(beforeNode.next);
            beforeNode=beforeNode.next;
        }
        beforeNode.addNext(node);
        return true;
    }

    public static Node lastNodeElement(Node head){
        Node nodeTemp = head;
        do{
//            System.out.println(nodeTemp.data);
            nodeTemp = nodeTemp.next;
        } while(nodeTemp.next != null);
        return nodeTemp;
    }

}
