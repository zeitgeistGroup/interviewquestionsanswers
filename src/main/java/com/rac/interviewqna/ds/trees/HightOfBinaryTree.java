package com.rac.interviewqna.ds.trees;

public class HightOfBinaryTree {

    private class TreeNode {
        private int value;
        private TreeNode leftChild;
        private TreeNode rightChild;
        public TreeNode(int value){
            this.value=value;
        }
    }

    private TreeNode root;


    public static void main(String[] args) {
        HightOfBinaryTree test=new HightOfBinaryTree();
        test.createBinaryTree();

        int hight=test.getHightOfTree(test.root);
        System.out.println(hight);

    }

    private  int getHightOfTree(TreeNode root) {

        if(root==null){
            return 0;
        }
        if(root.leftChild==null && root.rightChild==null){
            return 0;
        }

       return 1+( Math.max(getHightOfTree(root.leftChild),getHightOfTree(root.rightChild)));


    }

    //          1

 //   2              3

//4         5    6             7

 //                                  8



    private void createBinaryTree() {

        TreeNode n1 =new TreeNode(1);
        TreeNode n2 =new TreeNode(2);
        TreeNode n3 =new TreeNode(3);
        TreeNode n4 =new TreeNode(4);
        TreeNode n5 =new TreeNode(5);
        TreeNode n6 =new TreeNode(6);
        TreeNode n7 =new TreeNode(7);
        TreeNode n8 =new TreeNode(8);


        n1.leftChild=n2;
        n1.rightChild=n3;
        n2.leftChild=n4;
        n2.rightChild=n5;
        n3.leftChild=n6;
        n3.rightChild=n7;
        n7.rightChild=n8;

        root=n1;
    }

}
