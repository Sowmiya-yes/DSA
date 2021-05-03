package Day1;

public class PowerLastDigit {
    public static void main(String[] args) {
        int x = 2, n = 1000, result = 0;
        switch (x) {
            case 2:
            case 7:
            case 3:
            case 8:
                result = (int) Math.pow(x, n % 4);
                break;
            case 0:

        }
    }
}
