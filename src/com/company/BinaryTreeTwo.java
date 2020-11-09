package com.company;

public class BinaryTreeTwo {

    Node root;

    public void addNodeToTree(String name, int key){
        Node node = new Node(key, name);
        Node currentNode = root;
        Node parentNode;
        if(currentNode == null){
            root = node;
        }else{
            while(true) {
                parentNode = currentNode;
                if (key < currentNode.key) {
                    currentNode = currentNode.leftChild;
                    if(currentNode == null){
                        parentNode.leftChild = node;
                        //System.out.println(node.printOutNode());
                        return;
                    }
                } else if (key > currentNode.key) {
                    currentNode = currentNode.rightChild;
                    if(currentNode == null){
                        parentNode.rightChild = node;
                        //System.out.println(node.printOutNode());
                        return;
                    }
                }
            }
        }
        //System.out.println(node.printOutNode());
    }







}

class Node{
    int key;
    Node leftChild;
    Node rightChild;
    String name;

    Node(int key, String name){
        this.key = key;
        this.name = name;

    }
    public String printOutNode(){
        return name + " has value of " + key;
    }
}