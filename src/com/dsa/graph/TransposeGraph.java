package com.dsa.graph;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeSet;

public class TransposeGraph {
   // static HashMap<Integer, TreeSet<Integer>> graph;
   // static HashMap<Integer,TreeSet<Integer>> transposeGraph;
   static int vertex ;
    static ArrayList<Integer> adj[];
    static ArrayList<Integer> trans[] ;

    public static void addEdge(int source,int dis,boolean flag){
        if(flag)
            adj[source].add(dis);
        else
            trans[source].add(dis);
    }

    public static void createGraph(int vertex){
        adj = new ArrayList[vertex];
        trans = new ArrayList[vertex];
        for(int i=0;i<vertex;i++){
          adj[i] = new ArrayList<>();
          trans[i] = new ArrayList<>();
        }
    }

    public static void printGraph(){
       for(int i=0 ;i <vertex; i++){
           System.out.println(i);
           for(int j=0;i<trans[i].size();j++){
               System.out.print(trans[i].get(j));
               System.out.println();
           }
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

        createGraph(5);

        addEdge(0, 1, false);
        addEdge(0, 4, false);
        addEdge(0, 3, false);
        addEdge(2, 0, false);
        addEdge(3, 2, false);
        addEdge(4, 1, false);
        addEdge(4, 3, false);

        getTranspose(5);
        printGraph();
    }
}
