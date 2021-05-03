package week1;

import java.util.Iterator;
import java.util.List;

class Solutio {

    void recursiveSolution(List<List<Integer>> rooms, int root, boolean[] visited) {
        visited[root] = true;

        Iterator<Integer> iterator = rooms.get(root).listIterator();
        while(iterator.hasNext()) {
            int n = iterator.next();
            if(!visited[n])
                recursiveSolution(rooms, n, visited);
        }
    }

    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        int n = rooms.size();
        boolean[] visited = new boolean[n];

        for(int i = 0; i < n; i++) {
            if(!visited[i])
                recursiveSolution(rooms, i, visited);
        }

        for(boolean boo: visited) {
            if(!boo)
                return false;
        }
        return true;
    }
}
