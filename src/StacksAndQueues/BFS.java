package StacksAndQueues;

import java.util.*;

class Graph_{
    LinkedList<Integer>[] adjList;

    public Graph_(int n) {
        this.adjList = new LinkedList[n];

        for(int i = 0; i < 4; i++) {
            adjList[i] = new LinkedList<>();
        }
    }

    public void constructGraphAdjList() {
        adjList[0].add(1);
        adjList[0].add(2);
        adjList[1].add(2);
        adjList[2].add(0);
        adjList[2].add(3);
        adjList[3].add(3);
    }

    void bfs(int node) {
        boolean[] visited = new boolean[adjList.length];
        LinkedList<Integer> queue = new LinkedList<>();
        visited[node] = true;
        queue.add(node);
        while(!queue.isEmpty()) {
            node = queue.poll();
            System.out.println(node + " ");
            Iterator<Integer> itr = adjList[node].listIterator();
            while(itr.hasNext()) {
                int nd = itr.next();
                if(!visited[nd]) {
                    visited[nd] = true;
                    queue.add(nd);
                }
            }
        }
    }
}

public class BFS {
    public static void main(String[] args) {
        Graph_ graph = new Graph_(4);
        graph.constructGraphAdjList();
        graph.bfs(0);
    }
}
