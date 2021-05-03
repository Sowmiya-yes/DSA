package week1;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Stack;

class TopoGraph {
    LinkedList<Integer>[] graph;
    int V;

    TopoGraph(int v) {
        graph = new LinkedList[v];
        V = v;
        for (int i = 0; i < V; i++)
            graph[i] = new LinkedList<>();
    }

    void addEdge(int u, int v) {
        graph[u].add(v);
    }

    void recuriveSorting(int root, boolean[] visited, Stack<Integer> stack) {
        visited[root] = true;

        Iterator<Integer> iterator = graph[root].listIterator();
        while(iterator.hasNext()) {
            int num = iterator.next();
            if(!visited[num])
                recuriveSorting(num, visited, stack);
        }
        stack.push(root);
    }

    Stack<Integer> topologicalSort() {
        Stack<Integer> stack = new Stack<>();
        boolean[] visited = new boolean[V];

        for(int i =0; i < V; i++) {
            if(!visited[i])
                recuriveSorting(i, visited, stack);
        }

        return stack;
    }
}
public class TopologicalSorting {
    public static void main(String[] args) {
        TopoGraph topoGraph = new TopoGraph(4);
//        topoGraph.addEdge(5, 2);
//        topoGraph.addEdge(5, 0);
//        topoGraph.addEdge(4, 0);
//        topoGraph.addEdge(4, 1);
//        topoGraph.addEdge(2, 3);
//        topoGraph.addEdge(3, 1);
        topoGraph.addEdge(1, 0);
        topoGraph.addEdge(3, 0);
        topoGraph.addEdge(3, 0);
        topoGraph.addEdge(3, 2);
        Stack<Integer> s = topoGraph.topologicalSort();
        while(!s.empty()) {
            System.out.print(s.pop() + " ");
        }
    }
}
