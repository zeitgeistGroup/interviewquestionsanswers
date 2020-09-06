package com.rac.interviewqna.ds.trees;

public class FindBST {
    private class TreeNode {
        private int value;
        private TreeNode liftChild;
        private TreeNode rightChild;

        public TreeNode(int value) {
            this.value = value;
        }

    }

    private TreeNode root;


 //        1
 //   2         3
// 4     5



//          7

//    4            10

//1        5    9
    public void createBT(){

        TreeNode n1=new TreeNode(1);
        TreeNode n2=new TreeNode(2);
        TreeNode n3=new TreeNode(3);
        TreeNode n4=new TreeNode(4);
        TreeNode n5=new TreeNode(5);

        n1.liftChild=n2;
        n1.rightChild=n3;
        n2.liftChild=n4;
        n2.rightChild=n5;
        root=n1;

        /*TreeNode n1=new TreeNode(7);
        TreeNode n2=new TreeNode(4);
        TreeNode n3=new TreeNode(10);
        TreeNode n4=new TreeNode(1);
        TreeNode n5=new TreeNode(5);
        TreeNode n6=new TreeNode(9);

        n1.liftChild=n2;
        n1.rightChild=n3;
        n2.liftChild=n4;
        n2.rightChild=n5;
        n3.liftChild=n6;
        root=n1;
*/



    }


    public static void main(String[] args) {
        FindBST findBST=new FindBST();
        findBST.createBT();
        boolean isBST=findBST.isBST(findBST.root);
        System.out.println(isBST);
    }

    private boolean isBST(TreeNode root) {


        if(root ==null)return true;

        if(root.rightChild!=null && root.liftChild.value<root.value) {
            isBST(root.liftChild);
        }else{
            return false;
        }

        if(root.rightChild!=null && root.rightChild.value>root.value) {
            isBST(root.rightChild);
        }else{
            return false;
        }

        return true;

    }


}
