package week1;

import java.util.Iterator;
import java.util.LinkedList;

class BFSGraph {
    int V;
    LinkedList<Integer>[] linkedList;

    public BFSGraph(int v) {
        V = v;
        linkedList = new LinkedList[v];
        for(int i = 0; i < v; i++) {
            linkedList[i] = new LinkedList<>();
        }
    }

    void addEdge(int u, int v) {
        linkedList[u].add(v);
    }

    void BFS(int root) {
        boolean[] visited = new boolean[V];
        LinkedList<Integer> queue = new LinkedList<>();

        visited[root] = true;
        queue.add(root);

        while(queue.size() > 0) {
            root = queue.poll();
            System.out.print(root + " -> ");
            Iterator<Integer> iterator = linkedList[root].listIterator();
            while(iterator.hasNext()) {
                int n = iterator.next();
                if(!visited[n]) {
                    visited[n] = true;
                    queue.add(n);
                }
            }
        }
    }
}

public class BFS {
    public static void main(String[] args) {
        BFSGraph graph = new BFSGraph(4);
        graph.addEdge(0, 1);
        graph.addEdge(0, 2);
        graph.addEdge(1, 2);
        graph.addEdge(2, 0);
        graph.addEdge(2, 3);
        graph.addEdge(3, 3);

        graph.BFS(2);
    }
}
