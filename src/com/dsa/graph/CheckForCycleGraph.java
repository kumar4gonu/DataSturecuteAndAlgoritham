package com.dsa.graph;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class CheckForCycleGraph {
    private static ArrayList<ArrayList<Integer>> adj;
    private static int vertex;
    public static void main(String[] args) {
        int V = 5;
        ArrayList<ArrayList<Integer>>adj = new ArrayList<>();
        for(int i = 0; i < V; i++)
            adj.add(i, new ArrayList<Integer>());

        adj.get(0).add(1);
        adj.get(0).add(2);
        adj.get(2).add(3);
        adj.get(1).add(3);
        adj.get(2).add(4);

        boolean ans = isCycle(adj, V);
        if(ans)
            System.out.println("Yes");
        else
            System.out.println("No");

    }

    private static void createGraph(){
        adj = new ArrayList<>();
        for(int i=0;i<vertex;i++){
            adj.add(i,new ArrayList<>());
        }
    }

    //Undirected Graph.
    private static void addEdge(int s, int d){
        adj.get(s).add(d);
        adj.get(d).add(s);
    }

    private static boolean isCycle(ArrayList<ArrayList<Integer>> adj, int vert){
        boolean visit[] = new boolean[vert];
        Arrays.fill(visit,false);

        for(int i=0;i < vert; i++){
            if(visit[i] == false)
                if(checkForCycle(adj,i,visit))
                    return true;
            return false;
        }
        return false;
    }

    private static boolean checkForCycle(ArrayList<ArrayList<Integer>> adj,int s,boolean visit[]){
        //apply BFS logic.
        Queue<Node> queue = new LinkedList<>();
        queue.add(new Node(s,-1));
        visit[s] = true;

        while (!queue.isEmpty()){
            int node = queue.peek().first;
            int pre = queue.peek().second;
            queue.remove();
            for (Integer it : adj.get(node)){
                if(visit[it] == false) {
                    queue.add(new Node(it, node));
                    visit[it] = true;
                }else if(it != pre)
                    return true;
            }
        }
return false;
    }


}
