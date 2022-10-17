package com.dsa.graph;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeSet;

public class AddAndPrintGraph {

   static HashMap<Integer, TreeSet<Integer>> map ;
    public static void main(String[] args) {
        int vertex = 5;
        createGraph(vertex);
     addEdge(0, 1);
     addEdge(0, 4);
     addEdge(1, 2);
     addEdge(1, 3);
     addEdge(1, 4);
     addEdge(2, 3);
     addEdge(3, 4);

     printGraph();
    }

    private static void createGraph(int vertex){

        map = new HashMap<>();
        for(int i=0;i < vertex;i++){
            map.put(i,new TreeSet<>() );
        }
    }

    //UnDirected Graph
    private static void addEdge(int sourceNode, int distNode){
        map.get(sourceNode).add(distNode);
        map.get(distNode).add(sourceNode);
    }


    private static void printGraph(){
       map.entrySet().stream().forEach(key -> System.out.println(key.getKey() + " ->" + key.getValue()));

      }
}
