package com.dsa.graph;

import java.util.Iterator;
import java.util.LinkedList;

public class DFS {
    private static LinkedList<Integer> graph[] ;
    private static int vertex ;

    private static void createGraph(){
        graph = new LinkedList[vertex];
        for(int i=0 ;i < vertex; i++){
            graph[i] = new LinkedList<>();
        }
    }

    private static void addEdge(int source, int dist){
        graph[source].add(dist);
    }

    public static void depthFirstSearch(int vertex, boolean visited[]){
        visited[vertex] = true;
        System.out.println(vertex);
        Iterator<Integer> it = graph[vertex].iterator();
        while (it.hasNext()){
            int value = it.next();
            if(!visited[value])
                depthFirstSearch(value,visited);
        }
    }

    public static void dfs(int start){
        boolean visited[] = new boolean[vertex];
        depthFirstSearch(start, visited);
    }

    public static void main(String[] args) {
          vertex =5;
          createGraph();
        addEdge(0, 1);
        addEdge(0, 2);
        addEdge(1, 2);
        addEdge(2, 0);
        addEdge(2, 3);
        addEdge(3, 3);

        dfs(2);
    }
}
