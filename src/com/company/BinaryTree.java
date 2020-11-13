package com.company;

public class BinaryTree {
    Node root;
    Node parent;

    class Node {
        Node left;
        Node right;
        int key;

        public Node(int key) {
            this.key = key;
        }
    }

    // -----------
    public void printTreeInOrder() {
        printTreeInOrder(root);
    }

    private void printTreeInOrder(Node tree) {
        if (tree == null) {
            return;
        }
        printTreeInOrder(tree.left);
        System.out.println(tree.key);
        printTreeInOrder(tree.right);
    }

    // -----------
    public void printTreeInReverseOrder() {
        printTreeInReverseOrder(root);
    }

    private void printTreeInReverseOrder(Node tree) {
        if (tree == null) {
            return;
        }
        printTreeInReverseOrder(tree.right);
        System.out.println(tree.key);
        printTreeInReverseOrder(tree.left);
    }

    // -----------
    public void printTreePostOrder() {
        printTreePostOrder(root);
    }

    private void printTreePostOrder(Node tree) {
        if (tree == null) {
            return;
        }
        printTreePostOrder(tree.left);
        printTreePostOrder(tree.right);
        System.out.println(tree.key);
    }

    // -----------
    public void printTreePreOrder() {
        printTreePreOrder(root);
    }

    private void printTreePreOrder(Node tree) {
        if (tree == null) {
            return;
        }
        System.out.println(tree.key);
        printTreePreOrder(tree.left);
        printTreePreOrder(tree.right);
    }

    // -----------
    public void insert(int key) {
        root = insertRec(root, key);
    }

    private Node insertRec(Node tree, int key) {
        if (tree == null) {
            tree = new Node(key);
            return tree;
        }
        if (key < tree.key) {
            tree.left = insertRec(tree.left, key);
        } else if (key > tree.key) {
            tree.right = insertRec(tree.right, key);
        }
        return tree;
    }


    public boolean remove(int key) {
        Node currNode = root;
        Node parentNode = root;
        boolean isLeft = true;
        while (currNode.key != key) {
            parentNode = currNode;
            if(key< currNode.key){
                isLeft = true;
                currNode = currNode.left;

            }else{
                isLeft=false;
                currNode = currNode.right;
            }
            if(currNode == null){return false;}
        }
        if(currNode.left == null && currNode.right == null){
            if(currNode == root){
                root = null;
            } else if(isLeft == true){
                parentNode.left = null;
            }else{
                parentNode.right = null;
            }

        }
        else if(currNode.right == null){
            if(currNode == root){
                root = currNode.left;
            }else if(isLeft){
                parentNode.left = currNode.left;
            } else{
                parentNode.right = currNode.left;
            }
        }else if(currNode.left == null){
            if(currNode == root){
                root = currNode.right;
            } else if (isLeft == true){
                parentNode.left = currNode.right;
            } else{
                parentNode.right = currNode.left; // enl osäker källa ska currNode.right vara currNode.left;
            }
        }else{
            Node replace = getReplaceNode(currNode);

            if(currNode == root){
                root = replace;
            }else if(isLeft){
                parentNode.left = replace;
            }else{
                parentNode.right = replace;
            }
            replace.left = currNode.left;
        }


        return true;
    }
    public Node getReplaceNode(Node replaceNode) {
        Node replaceParent = replaceNode;
        Node replace = replaceNode;

        Node currNode = replaceNode.right;

        while (currNode != null) {
            replaceParent = replace;
            replace = currNode;
            currNode = currNode.left;

        }
        if (replace != replaceNode.right) {
            replaceParent.left = replace.right;
            replace.right = replaceNode.right;
        }

        return replace;
    }
}














