package org.example;

public class BinarySearchTree {
    public static void main(String[] args) {


        BinaryTrees trees = new BinaryTrees();
        trees.insert(8);
        trees.insert(7);
        trees.insert(12);
        trees.insert(15);
        trees.insert(2);
        trees.insert(5);

        trees.inOrder(trees.root.data);
        System.out.println("");
        trees.preOrder(trees.root.data);
        System.out.println("");
        trees.postOrder(trees.root.data);

    }
}

class Node{
    int data;
    Node left;
    Node right;

    public Node(int data) {
        this.data = data;
    }
}


class BinaryTrees {

    Node root;

    void insert(int data) {
        root = insertRec(root, data);
    }

    private Node insertRec(Node root, int data) {
        if (root == null) {
            root = new Node(data);
        } else if(data < root.data) {
                root.left = insertRec(root.left,data);
        } else if(data > root.data) {
                root.right = insertRec(root.right,data);
        }
        return root;
    }

    //In Order
    public void inOrder(int data) {
        inOrderRec(root);
    }

    private void inOrderRec(Node root) {
        if (root != null) {
           inOrderRec(root.left);
           System.out.print(root.data + " ");
           inOrderRec(root.right);
        }
    }

    void preOrder(int data){
        preOrderRec(root);
    }

    void preOrderRec(Node root){
        if(root !=null){
            System.out.print(root.data + " ");
            preOrderRec(root.left);
            preOrderRec(root.right);

        }
    }

    //post-order
    void postOrder(int data){
        postOrderRec(root);
    }

    void postOrderRec(Node root){
        if(root !=null){
            postOrderRec(root.right);
            System.out.print(root.data + " ");
            postOrderRec(root.left);

        }
    }

}