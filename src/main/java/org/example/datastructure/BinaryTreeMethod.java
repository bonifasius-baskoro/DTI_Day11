package org.example.datastructure;

import org.w3c.dom.Node;

public class BinaryTreeMethod {
     NodeTree root;


    public BinaryTreeMethod(NodeTree root) {
        this.root = root;
    }

    public void setRoot(NodeTree root) {
        this.root = root;
    }

    public BinaryTreeMethod(){
        this.root =null;
    }

    public NodeTree addNode(NodeTree nodeSearch, int value){
        if(nodeSearch == null){
            System.out.println("Value added to the tree");
            return new NodeTree(value);
        }
        if (nodeSearch.data == value){
            System.out.println("Already inserted");
            return null;
        } else if (value< nodeSearch.data) {
            nodeSearch.left = addNode(nodeSearch.left,value);
        }else{
            nodeSearch.right = addNode(nodeSearch.right,value);
        }
        return nodeSearch;
    }

    public NodeTree searchDeep(NodeTree root,int value){
        if(root == null){
            System.out.println("Not found");
            return null;
        }
        if (root.data == value){
            System.out.println("Found");
            return root;
        } else if (value< root.data) {
            root.left = searchDeep(root.left,value);
        }else{
            root.right = searchDeep(root.right,value);
        }
        return root;
    }
}
