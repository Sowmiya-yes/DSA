package AlgoExpert;

public class ValidateSubsequence {
    public static void main(String[] args) {
        String str1 = "AXY";
        String str2 = "ADXCPL";
        int i = 0, j = 0;
        while(i < str1.length() && j < str2.length()) {
            if(str1.charAt(i) == str2.charAt(j)) {
                i++;
                j++;
            } else j++;
        }
        System.out.println(i+ " "+j);
        if(i == str1.length())
            System.out.println("Yes it is");
        else
            System.out.println("No it is not");
    }

//    O(n) n is the min(len(str1), len(str2))
}
