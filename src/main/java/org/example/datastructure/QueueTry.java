package org.example.datastructure;

public class QueueTry {
    Node nodePeek;

    public QueueTry(Node nodePeek) {
        this.nodePeek = nodePeek;
    }

    public QueueTry(){
        this.nodePeek= null;
    }

    public void enqueue(Node node){
        System.out.println("Start enqueue");
//        boolean test =LinkedListMethod.addElement(node, this.nodePeek);
        try{
            LinkedListMethod.addElement(node, this.nodePeek);
        }catch (NullPointerException e){
            this.nodePeek=node;
        }
//        System.out.println(test);
    }

    public void dequeue(){
        if(this.nodePeek==null){
            System.out.println("Queue is empty");
        }
        this.nodePeek= nodePeek.next;
    }

    public Node getPeek(){
        if(this.nodePeek==null){
            System.out.println("Queue is empty");
            return null;
        }
        return nodePeek;
    }

    public void printQueue(){
        if(this.nodePeek==null){
            System.out.println("Queue is empty");
            return;
        }
        LinkedListMethod.loopElement(this.nodePeek);
    }
}
