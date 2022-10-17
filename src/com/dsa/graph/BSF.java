package com.dsa.graph;

import java.util.Iterator;
import java.util.LinkedList;

public class BSF {
    private static LinkedList<Integer> adj[];
    private static int vertex;

    private static void createGraph(){
        adj = new LinkedList[vertex];
        for(int i=0;i<vertex;i++){
            adj[i] = new LinkedList<>();
        }
    }

    //directed graph
    private static void addEdge(int source, int dist){
        adj[source].add(dist);
    }

    private static void brithFirstSear(int start){
        boolean visited[] = new boolean[vertex];
        LinkedList<Integer> queue = new LinkedList<>();
        visited[start] = true;
        queue.add(start);

        while (queue.size() !=0){
            start = queue.poll();
            System.out.println(start);
            Iterator it = adj[start].iterator();

            while (it.hasNext()){
                int next = (int) it.next();
                if(!visited[next]){
                    visited[next] = true;
                    queue.add(next);
                }
            }
        }
    }

    public static void main(String[] args) {
        vertex = 5;
        createGraph();
        addEdge(0, 1);
        addEdge(0, 2);
        addEdge(1, 2);
        addEdge(2, 0);
        addEdge(2, 3);
        addEdge(3, 3);

        brithFirstSear(2);

    }

}
