package com.rac.interviewqna.graphs;

import sun.security.provider.certpath.AdjacencyList;

import java.util.LinkedList;

/*
implementation of Graph Adjacancy List
 */
public class GraphAdjacencyListImp {

    private LinkedList[] adjacencyList;
    private int eagesCount;



    public GraphAdjacencyListImp(int node){
        this.adjacencyList=new LinkedList[node];
        for(int i=0;i<node;i++){
            adjacencyList[i]=new LinkedList();
        }
    }


   public void  addEdge(int v,int u){

       adjacencyList[v].add(u);
       eagesCount++;
    }


    public static  void main(String arg[]){
        GraphAdjacencyListImp graph=new GraphAdjacencyListImp(4);
        graph.addEdge(0,1);
        System.out.println(graph.eagesCount);
        graph.addEdge(1,2);
        System.out.println(graph.eagesCount);
        graph.addEdge(2,3);
        System.out.println(graph.eagesCount);
        graph.addEdge(3,0);
        System.out.println(graph.eagesCount);
        System.out.println(graph.adjacencyList);
    }








}
