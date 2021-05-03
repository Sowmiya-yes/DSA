package week1;

import java.util.Iterator;
import java.util.LinkedList;

class UndirectedGraph {
    LinkedList<Integer>[] graph;
    int V;

    UndirectedGraph(int v) {
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
        for(int i = 0; i < V; i++) {
            if(!visited[i]) {
                if(detectCyclesDFSUtil(i, -1, visited))
                    return true;
            }
        }
        return false;
    }

    private boolean detectCyclesDFSUtil(int root, int node, boolean[] visited) {
        visited[root] = true;
        System.out.println("root" + root);

        Iterator<Integer> iterator = graph[root].listIterator();
        while(iterator.hasNext()) {
            int i = iterator.next();
            if(!visited[i]) {
                System.out.println(i + " " + root);
                if(detectCyclesDFSUtil(i, root, visited))
                    return true;
            } else if(i != node) {
                System.out.println(i + " " + node + "dfg");
                return true;
            }
        }
        return false;
    }
}

public class CyclesInUndirectedGraph {
    public static void main(String[] args) {
        UndirectedGraph g1 = new UndirectedGraph(5);
        g1.addEdge(1, 0);
        g1.addEdge(0, 2);
        g1.addEdge(2, 1);
        g1.addEdge(0, 3);
        g1.addEdge(3, 4);
        if (g1.detectCycles())
            System.out.println("Graph contains cycle");
        else
            System.out.println("Graph doesn't contains cycle");
    }
}
