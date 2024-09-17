package org.example.datastructure;

public class StackTry {
    Node nodePeek;

    public StackTry(Node nodePeek) {
        this.nodePeek = nodePeek;
    }
    public StackTry(){
        this.nodePeek=null;
    }

    //Add to the top of stack
    public void pushStack(Node node){
        if(this.nodePeek ==null) {
            this.nodePeek = node;
        }
        else{
            node.addNext(this.nodePeek);
            this.nodePeek=node;
        }
    }

    public void popStack(){
        if(this.nodePeek.next == null){
            this.nodePeek=null;
            System.out.println("Stack is empty");
            return;
        }
        this.nodePeek=this.nodePeek.next;
        System.out.println("Pop finished");
    }

    public Node getPeek() {
        return nodePeek;
    }
}
