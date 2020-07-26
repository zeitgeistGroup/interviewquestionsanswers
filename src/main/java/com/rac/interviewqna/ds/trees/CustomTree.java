package com.rac.interviewqna.ds.trees;

import java.util.*;


public class CustomTree {
    public static void main(String[] args) {
        Node root= createTree();
        System.out.println("tree created");

        System.out.println("sum of the sumLeftLeafOfTree: "+sumLeftLeafOfTree(root,root));
        System.out.println("sum of the sumRightLeafOfTree: "+sumRightLeafOfTree(root,root));
        System.out.println("top view of the tree: ");
        Map<Integer,Integer> map=topView(root);
        Map<Integer,Integer> result= new TreeMap(map);
        for(Map.Entry<Integer, Integer> entry: result.entrySet() ){
            System.out.print(entry.getValue());
        }
        System.out.println("");
        System.out.println("left view of the tree: ");
        Map<Integer,Integer> mapForLeftView=leftView(root);
        Map<Integer,Integer> resultForMapForLeftView =new TreeMap<Integer, Integer>(mapForLeftView);
        for( Map.Entry<Integer,Integer> entity: resultForMapForLeftView.entrySet()){
            System.out.print(entity.getValue());
        }
        System.out.println("");

        System.out.println("mirror of the tree: "+mirrorImage(root));
        ;






    }



//        1
    //  2       3
    //    4         5

    public static Node createTree(){

        Node root=new Node(1);
        root.left=new Node(2);
        root.right=new Node(3);
        root.right.left=new Node(4);
        root.right.right=new Node(5);

        return root;
    }

    public static int sumLeftLeafOfTree(Node root,Node parent){

        if(root==null){
            return 0;
        }

        if(root.left==null && root.right==null && parent!=null && parent.left==root){
            return root.data;
        }

        int sumLeftSide= sumLeftLeafOfTree(root.left,root);
        int rightSide=sumLeftLeafOfTree(root.right,root);
        return sumLeftSide+rightSide;
    }


    public static int sumRightLeafOfTree(Node root,Node parent){

        if(root==null){
            return 0;
        }

        if(root.left==null && root.right==null && parent!=null && parent.right==root){
            return root.data;
        }
        int rightSide=sumRightLeafOfTree(root.right,root);
        int sumLeftSide= sumRightLeafOfTree(root.left,root);

        return sumLeftSide+rightSide;
    }


    public static Map<Integer,Integer> topView(Node root){
        Map<Integer,Integer> map=new HashMap<Integer, Integer>();
        return forTopView(root,map,0);


    }


    public static Map<Integer,Integer> forTopView(Node root,Map<Integer,Integer> map,int hd ){

        if(root==null){
            return map;
        }
        if(!map.containsKey(hd)){
            map.put(hd,root.data);
        }
        forTopView(root.left,map,hd-1);
        forTopView(root.right,map,hd+1);
        return map;
    }

    public static Map<Integer,Integer> leftView(Node root){

        Map<Integer,Integer> map=new HashMap<Integer, Integer>();

        return forLeftView(root,map,0);

    }
    public static Map<Integer,Integer>  forLeftView(Node root,Map<Integer,Integer>  map,int lavel){

        if(root==null)return map;

        if(!map.containsKey(lavel)){
            map.put(lavel,root.data);
        }

        forLeftView(root.left,map,lavel+1);
        forLeftView(root.right,map,lavel+1);
        return map;

    }

    public static boolean  mirrorImage(Node root){
        List <Integer>listForInorder=new ArrayList();
        List<Integer> listForPostOrder=new ArrayList();
         List resultInorder= inOrder(root,listForInorder);
        System.out.println("in oder of the tree");
        resultInorder.forEach(e-> System.out.print(e));
        System.out.println("");
        Node mirrorRoot= forMirrorImage(root);
        System.out.println("post oder of the mirror tree");
        List resultPostOder= postOder(mirrorRoot,listForPostOrder);
        resultPostOder.forEach(e-> System.out.print(e));
        System.out.println("");

        int i=0;
        int j=listForPostOrder.size()-1;
        while(i<j){
            if(listForInorder.get(i)!=listForPostOrder.get(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
        // List result= inOrder(root,list);

    }

    public static List inOrder(Node root,List list){

        if(root==null){
            return list;
        }
        list.add(root.data);
        inOrder(root.left,list);
        inOrder(root.right,list);
        return list;
    }
    public static List postOder(Node root,List list){

        if(root==null){
            return list;
        }
        postOder(root.left,list);
        postOder(root.right,list);
        list.add(root.data);

        return list;
    }

    public static Node forMirrorImage(Node root){

        if(root==null){
            return root;
        }
        forMirrorImage(root.left);
        forMirrorImage(root.right);

        Node temp=root.left;
        root.left=root.right;
        root.right=temp;

        return root;


    }


}


class Node{

    int data;
    Node left;
    Node right;
    Node (int data){
        this.data=data;
        this.left=null;
        this.right=null;
    }


}
