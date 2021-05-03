package week1;

import java.util.LinkedList;
import java.util.Queue;

class Solution {
    public boolean canReach(int[] arr, int start) {
        int V = arr.length;
        boolean[] visited = new boolean[V];
        Queue<Integer> queue = new LinkedList<>();

        queue.add(start);

        while(!queue.isEmpty()) {
            int value = queue.poll();
            System.out.println(value);
            if(arr[value] == 0) return true;

            if(visited[value]) continue;

            visited[start] = true;

            if(value + arr[value] < V)
                queue.add(value + arr[value]);
            if(value - arr[value] >= 0)
                queue.add(value - arr[value]);
        }

        return false;
    }
}

public class JumpGame {
    public static void main(String[] args) {
        Solution sol = new Solution();
        System.out.println(sol.canReach(new int[]{4,2,3,0,3,1,2}, 5));
    }
}
