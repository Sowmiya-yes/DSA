package week2;

import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

class DG {
    int V;
    LinkedList<Integer>[] list;

    public DG(int v) {
        V = v;
        this.list = new LinkedList[v];
        for(int i = 0; i < V; i++)
            list[i] =  new LinkedList<>();
    }

    void insert(int i, int j) {
        list[i].add(j);
    }

    void findPathExistence(int i, int j) {
        boolean[] visited =  new boolean[V];
        LinkedList<Integer> queue = new LinkedList<>();

        visited[i] = true;
        queue.add(i);

        while(queue.size() > 0) {
            i = queue.poll();
            Iterator<Integer> iterator = list[i].listIterator();
            while (iterator.hasNext()) {
                int temp = iterator.next();
                if (temp == j) {
                    System.out.println("Path exists");
                    return;
                } else {
                    if (!visited[temp]) {
                        visited[temp] = true;
                        queue.add(temp);
                    }
                }
            }
        }
        System.out.println("Path doesn't exist");
    }

    public static void main(String[] args) {
        DG graph = new DG(5);
        graph.insert(1, 2);
        graph.insert(1, 3);
        graph.insert(2, 3);
        graph.insert(3, 1);

        System.out.println(Arrays.toString(graph.list));
        graph.findPathExistence(1, 4);

    }
}