package StacksAndQueues;

class RainTrappingNaive {
    public static void main(String[] args) {
        int[] arr = {3, 0, 2, 0, 4};
        int currentStorage = 0;
        for(int i = 0; i < arr.length; i++) {
            int leftMax = 0, rightMax = 0;
            int smallest;
            for(int j = 0; j < i; j++) {
                leftMax = Math.max(arr[j], leftMax);
            }
            for(int j = i + 1; j < arr.length; j++) {
                rightMax = Math.max(arr[j], rightMax);
            }
            smallest = Math.min(rightMax, leftMax);
            currentStorage = currentStorage + Math.max(smallest - arr[i], 0);
        }
        System.out.println(currentStorage);
    }


    String display(int a) {
        return String.valueOf(a);
    }

    void display(char a) {
        System.out.println(a);
    }
}