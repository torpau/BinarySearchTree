package com.company;

public class BinaryTree {
    Node root;
    Node parent;

    class Node{
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

    private void printTreeInOrder(Node tree){
        if(tree == null){
            return;
        }
        printTreeInOrder(tree.left);
        System.out.println(tree.key);
        printTreeInOrder(tree.right);
    }

    // -----------
    public void printTreeInReverseOrder(){
        printTreeInReverseOrder(root);
    }

    private void printTreeInReverseOrder(Node tree) {
        if(tree == null){
            return;
        }
        printTreeInReverseOrder(tree.right);
        System.out.println(tree.key);
        printTreeInReverseOrder(tree.left);
    }

    // -----------
    public void printTreePostOrder(){
        printTreePostOrder(root);
    }

    private void printTreePostOrder(Node tree) {
        if(tree == null){
            return;
        }
        printTreePostOrder(tree.left);
        printTreePostOrder(tree.right);
        System.out.println(tree.key);
    }

    // -----------
    public void printTreePreOrder(){
        printTreePreOrder(root);
    }

    private void printTreePreOrder(Node tree) {
        if(tree == null){
            return;
        }
        System.out.println(tree.key);
        printTreePreOrder(tree.left);
        printTreePreOrder(tree.right);
    }
    // -----------
    public void insert(int key){
        root = insertRec(root, key);
    }

    private Node insertRec(Node tree, int key) {
        if(tree == null){
            tree = new Node(key);
            return tree;
        }
        if(key < tree.key){
            tree.left = insertRec(tree.left, key);
        }
        else if (key > tree.key){
            tree.right = insertRec(tree.right, key);
        }
        return tree;
    }
/*
    public void deleteTreeObject(int key) {
        Node currentIndex = root;
        for(int i = 0; i <= root.key; i++){
            if(currentIndex != null){
                System.err.println("Nothing to delete");
                return;
            } else if(key < currentIndex.key ){
                currentIndex = currentIndex.left;
            } else if(key > currentIndex.key){
                currentIndex = currentIndex.right;
            }
        }
    }

 */

    public void deleteObjectInTree(int key){

        root = deleteObjectInTree(root, key);


    }
    private Node deleteObjectInTree(Node tree, int key){
        if(tree == null) {
            return tree;
        }if(tree.key == key && key == root.key){
            //root.right.left = root.left;
            //root = root.right;
            //tree = root;

            Node subTree = tree.right;
            Node subTreeParent = subTree;
            while(subTree.left!=null){
                subTreeParent = subTree;
                subTree = subTree.left;

            }
            System.out.println(subTree.key);
            System.out.println(subTreeParent.key);

                System.out.println("root" + root.key);
           }
        else if(tree.key == key) {
            Node subTree = tree.right;
            Node subTreeParent = subTree;
            while(subTree.left!=null){
                subTreeParent = subTree;
                subTree = subTree.left;
            }
            if(subTree.right != null){
                subTreeParent.right = subTree.right;
            }
            System.out.println(subTree.key);
            System.out.println(subTreeParent.key);

            System.out.println("root" + root.key);



            /*
            if(key < parent.key){
                tree.right.left = tree.left;
                parent.left = tree.right;
            } else {
                parent.right = tree.right;
            }

             */
            System.out.println("p"+parent.key);
            System.out.println(tree.key);
            return tree;

        }

        parent = tree;
        deleteObjectInTree(tree.left, key);
        parent = tree;
        deleteObjectInTree(tree.right, key);

        return tree;
    }
/*
    public static void main(String [] Args){
        BinaryTree bt = new BinaryTree();

                8
             3     10
           1  6       13


           printTreeInOrder(8)
             printTreeInOrder(3)
               printTreeInOrder(1)
                 printTreeInOrder(null)
                 print 1
                 printTreeInOrder(null)
               print 3
               printTreeInOrder(6)
                 printTreeInOrder(null)
                 print 6
                 printTreeInOrder(null)
             print 8
         */


    }
//}
