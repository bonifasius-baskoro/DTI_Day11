package org.example.datastructure;

import org.example.utils.UserInput;

import javax.sound.midi.Soundbank;
import java.sql.SQLOutput;

public class BinaryTreeInterface {

    public static void run(){
        boolean isRun = true;
        BinaryTreeMethod binaryTree = new BinaryTreeMethod();
        while(isRun){
            System.out.println("Choose the option");
            System.out.println("1. Make binary tree");
            System.out.println("2. Add node to the binary tree");
            System.out.println("3. Search value in binary tree");
            String input = UserInput.getUserInput("Type the option or press q to exit");
            if(input.equals("q")){
                isRun= false;
                break;
            }
            switch(Integer.parseInt(input)){
                case 1:
                    String inputRoot = UserInput.getUserInput("Insert root value or press q to exit");
                    if(inputRoot.equals("q")){
                        isRun= false;
                        break;
                    }else{
                         binaryTree.setRoot(new NodeTree(Integer.parseInt(inputRoot)));
                        System.out.println(binaryTree);
                    }
                    break;
                case 2:
                    addNodeToTree(binaryTree);
                    break;
                case 3:
                    searchValue(binaryTree);
            }
        }

    }

    public static void addNodeToTree(BinaryTreeMethod tree){
        boolean isRun = true;
        while(isRun){
            String input = UserInput.getUserInput("Input the number you want to put to the tree or press q to exit:");
            if(input.equals("q")){
                break;
            }
            else{
                tree.addNode(tree.root,Integer.parseInt(input));
                System.out.println(tree.root.data);
            }
        }
        System.out.println("Exited");
    }

    public static void searchValue(BinaryTreeMethod tree){
        boolean isRun = true;
        while(isRun){
            String input = UserInput.getUserInput("Input the number you want to search to the tree or press q to exit:");
            if(input.equals("q")){
                isRun=false;
                break;
            }
            else{
                tree.searchDeep(tree.root,Integer.parseInt(input));
            }
        }
        System.out.println("Exited");
    }
}
