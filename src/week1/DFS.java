package week1;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

class DFSGraph {
    int V;
    LinkedList<Integer>[] linkedList;

    public DFSGraph(int v) {
        V = v;
        linkedList = new LinkedList[v];
        for(int i = 0; i < v; i++) {
            linkedList[i] = new LinkedList<>();
        }
    }

    void addEdge(int u, int v) {
        linkedList[u].add(v);
    }

    void DFS(int root) {
        boolean[] visited = new boolean[V];
        DFSUtil(root, visited);
    }

    void DFSUtil(int root, boolean[] visited) {
        visited[root] = true;
        System.out.print(root + " -> ");

        Iterator<Integer> iterator = linkedList[root].listIterator();
        while(iterator.hasNext()) {
            int n = iterator.next();
            if(!visited[n])
                DFSUtil(n, visited);
        }
    }
}

public class DFS {
    public static void main(String[] args) {
        DFSGraph graph = new DFSGraph(4);
        graph.addEdge(0, 1);
        graph.addEdge(0, 2);
        graph.addEdge(1, 2);
        graph.addEdge(2, 0);
        graph.addEdge(2, 3);
        graph.addEdge(3, 3);

        graph.DFS(2);
    }
}
