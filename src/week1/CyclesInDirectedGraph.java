package week1;

import java.util.Iterator;
import java.util.LinkedList;

class DirectedGraph {
    LinkedList<Integer>[] graph;
    int V;

    DirectedGraph(int v) {
        graph = new LinkedList[v];
        V = v;
        for(int i = 0; i < V; i++)
            graph[i] =  new LinkedList<>();
    }

    void addEdge(int u, int v) {
        graph[u].add(v);
    }

    boolean detectCycles() {
        boolean[] visited = new boolean[V];
        boolean[] recStack = new boolean[V];

        for(int i = 0; i < V; i++) {
            if(!visited[i]) {
                if(detectCyclesDFSUtil(i, visited, recStack))
                    return true;
            }
        }
        return false;
    }

    private boolean detectCyclesDFSUtil(int root, boolean[] visited, boolean[] recStack) {
        if(recStack[root])
            return true;
        if(visited[root])
            return false;

        visited[root] = true;
        recStack[root] = true;

        Iterator<Integer> iterator = graph[root].listIterator();
        while(iterator.hasNext()) {
            int i = iterator.next();
            if(detectCyclesDFSUtil(i, visited, recStack))
                return true;
        }
        recStack[root] = false;

        return false;
    }
}

public class CyclesInDirectedGraph {
    public static void main(String[] args) {
        DirectedGraph graph = new DirectedGraph(5);
        graph.addEdge(0, 1);
        graph.addEdge(0, 2);
        graph.addEdge(1, 2);
        graph.addEdge(2, 3);
        if (graph.detectCycles())
            System.out.println("Graph contains cycle");
        else
            System.out.println("Graph doesn't contains cycle");
    }
}

