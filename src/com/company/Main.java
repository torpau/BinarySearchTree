package com.company;

public class Main {

    public static void main(String[] args) {

        BinaryTree bT = new BinaryTree();

        bT.insert(50);
        bT.insert(25);
        bT.insert(15);
        bT.insert(30);
        bT.insert(75);
        bT.insert(85);
        bT.insert(72);
        bT.insert(26);
        bT.insert(27);

        System.out.println("printTreeInReverseOrder");
        bT.printTreeInReverseOrder();

        System.out.println("printTreePreOrder");
        bT.printTreePreOrder();

        System.out.println("printTreePostOrder");
        bT.printTreePostOrder();

        System.out.println("printTreeInOrder");
        bT.printTreeInOrder();

        System.out.println("--------------- delete nr.25--------------------");
        bT.remove(25);
        bT.printTreeInOrder();

        System.out.println("--------------- delete nr.75--------------------");
        bT.remove(75);
        bT.printTreeInOrder();

        System.out.println("--------------- delete root (50)--------------------");
        bT.remove(50);
        bT.printTreeInOrder();

        System.out.println("root is now: " + bT.root.key);
    }
}
