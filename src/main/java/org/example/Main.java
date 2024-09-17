package org.example;

import org.example.datastructure.*;

import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Node node1= new Node(1);
        Node node2= new Node(2);
        Node node3= new Node(3);
        Node head = node1;

//        LinkedListMethod.addElement(node2, head);
//        LinkedListMethod.addElement(node3, node2);
//        System.out.println(node2.next.data);
//        LinkedListMethod.loopElement(head);
//        Node lastNode = LinkedListMethod.lastNodeElement(head);
//        System.out.println(lastNode.data);
        System.out.println("QUEUE");
        QueueTry queueTest= new QueueTry(head);
        System.out.println("this");
        queueTest.enqueue(node2);
        System.out.println("this2");
        queueTest.enqueue(node3);
        System.out.println("this3");
        queueTest.printQueue();
        System.out.println(queueTest.getPeek().data);
        queueTest.dequeue();
        System.out.println(queueTest.getPeek().data);
        queueTest.dequeue();
        queueTest.dequeue();
        try{
            System.out.println(queueTest.getPeek().data);
        }catch (NullPointerException e){
            System.out.println("queue is empty");
        }



        System.out.println("Stackk-----");
        StackTry stackTest = new StackTry(head);
        stackTest.pushStack(node2);
        System.out.println(stackTest.getPeek().data);
        stackTest.pushStack(node3);
        System.out.println(stackTest.getPeek().data);
        stackTest.popStack();
        System.out.println("pop3 ");
        System.out.println(stackTest.getPeek().data);
        stackTest.popStack();
        System.out.println("pop2");
        System.out.println(stackTest.getPeek().data);
        stackTest.popStack();

        System.out.println("Binary tree");
        BinaryTreeInterface.run();

    }
}