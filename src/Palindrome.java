package Day1;

public class Palindrome {
    public static void main(String[] args) {
        int number = 12341;
        int n = number, lastDigit, reversedNum = 0;
        while (n > 0) {
            lastDigit = n % 10;
            reversedNum = (reversedNum  * 10 )+ lastDigit; //12321
            n = n / 10;
        }
        System.out.println(number == reversedNum);
    }
}
