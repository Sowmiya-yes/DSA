package Day1.majorityElement;

import java.util.HashMap;

public class NBy2Hashmap {
    public static void main(String[] args) {
        int[] arr = {4, 3, 4, 2, 4, 4, 2, 4};
//        HashMap<Integer, Integer> map = new HashMap();
//        for(int i: arr) {
//            map.put(i, map.getOrDefault(i, 0) + 1);
//            if(map.get(i) > arr.length / 2)
//                System.out.println(i);
//        }
        int majorityElement = -1, counter = 0;
        for(int i: arr) {
            if(i == majorityElement)
                counter++;
            else if(counter == 0){
                counter++;
                majorityElement = i;
            } else {
                counter--;
            }
        }
        counter = 0;
        for(int i: arr) {
            if(i == majorityElement)
                counter++;
        }
        if(counter > arr.length / 2)
            System.out.println(majorityElement);
        else
            System.out.println("No Majority element");
    }
}
