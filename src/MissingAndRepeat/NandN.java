package Day1.MissingAndRepeat;

public class NandN {
    public static void main(String[] args) {
        int nums[] = {3, 1, 3};
        int temp[] = new int[nums.length + 1];
        for(int i = 0; i < nums.length; i++) {
            temp[nums[i]] += 1;
        }
        int missing = -1, repeat = -1;
        boolean missingFound = false, repeatFound = false;
        for(int i = 1; i < temp.length; i++) {
            if(missingFound && repeatFound)
                break;
            else if(temp[i] > 1) {
                repeat = i;
                repeatFound = true;
            } else if (temp[i] == 0) {
                missing = i;
                missingFound = true;
            }
        }
        System.out.println("Missing " + missing + " Repeat " + repeat);
    }
}
