package com.company;

public class Main {

    public static void main(String[] args) {
        /*
        BinaryTreeTwo binaryTree = new BinaryTreeTwo();


        binaryTree.addNodeToTree("forsta ", 50);
        binaryTree.addNodeToTree("andra ", 25);
        binaryTree.addNodeToTree("tredje", 15);
        binaryTree.addNodeToTree("fjarde",30);
        binaryTree.addNodeToTree("femte", 75);
        binaryTree.addNodeToTree("sjätte", 85);
         */

        BinaryTree bT = new BinaryTree();

        bT.insert(50);
        bT.insert(25);
        bT.insert(15);
        bT.insert(30);
        bT.insert(75);
        bT.insert(85);
        bT.insert(72);

        bT.deleteObjectInTree(75);
        System.out.println("printTreeInOrder");
        bT.printTreeInOrder();

/*
        System.out.println("printTreeInOrder");
        bT.printTreeInOrder();

        System.out.println("printTreeInReverseOrder");
        bT.printTreeInReverseOrder();

        System.out.println("printTreePreOrder");
        bT.printTreePreOrder();

        System.out.println("printTreePostOrder");
        bT.printTreePostOrder();
*/
    }
}
