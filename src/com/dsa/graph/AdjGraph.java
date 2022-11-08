package com.dsa.graph;

import java.util.ArrayList;

public class AdjGraph {
    private static ArrayList<ArrayList<Integer>> adj ;
    private static int vertex ;
    public static void main(String[] args) {
        vertex = 6;
        createGraph();
        addEdge(1,2);
        addEdge(2,3);
        addEdge(2,4);
        addEdge(3,4);
        addEdge(5,3);
        addEdge(1,3);
        addEdge(1,5);
        printGraph();
    }

    public static void createGraph(){
        adj = new ArrayList<>();
        for(int i=0;i < vertex;i++)
            adj.add(new ArrayList<>());
    }

    public static void  addEdge(int u, int v){
        //un directed graph
        adj.get(u).add(v);
        adj.get(v).add(u);
    }

    public static void printGraph(){
        for (int i=0;i<vertex;i++){
            System.out.print(i + "->");
            for(int j=0;j<adj.get(i).size();j++){
                System.out.print(adj.get(i).get(j)+ " " );
            }
            System.out.println();
        }
    }
}
