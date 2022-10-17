package com.dsa.graph;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeSet;

public class TransposeGraph {
   // static HashMap<Integer, TreeSet<Integer>> graph;
   // static HashMap<Integer,TreeSet<Integer>> transposeGraph;

    static ArrayList<Integer> adj[];
    static ArrayList<Integer> trans[];
    static int vertex ;
    public static void addEdge(int source,int dis,boolean flag){
        if(flag)
            graph.get(source).add(dis);
        else
            transposeGraph.get(source).add(dis);
    }

    public static void createGraph(int vertex){
        for(int i=0;i<vertex;i++){
          adj[i] = new ArrayList<>();
          trans[i] = new ArrayList<>();
        }
    }

    public static void printGraph(){
       for(int i=0 ;i <vertex; i++){
           System.out.println();
       }
    }

    public static void getTranspose(int vertex){
         for(int i=0;i<vertex;i++){
             for (int j =0 ; j< adj[i].size();j++){
                 addEdge(adj[i].get(j),i,true);
             }
         }
    }

    public static void main(String[] args) {
        vertex = 5;
    }
}
