package Day1.majorityElement;

public class NBy3 {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 1, 1, 3, 2, 1, 2};
        int majorityElement1 = -1, counter1 = 0, majorityElement2 = -1, counter2 = 0;
        for(int i: arr) {
            if(i == majorityElement1)
                counter1++;
            else if(i == majorityElement2)
                counter2++;
            else if(counter1 == 0){
                counter1++;
                majorityElement1 = i;
            } else if (counter2 == 0){
                counter2++;
                majorityElement2 = i;
            } else {
                counter1--;
                counter2--;
            }
        }
        System.out.println(majorityElement1 + " " + majorityElement2);
        counter1 = counter2 = 0;
        for(int i: arr) {
            if(i == majorityElement1)
                counter1++;
            else if(i == majorityElement2)
                counter2++;
        }
        if(counter1 > arr.length / 3)
            System.out.println(majorityElement1);
        else if(counter2 > arr.length / 3)
            System.out.println(majorityElement2);
        else
            System.out.println("No Majority element");
    }
}
