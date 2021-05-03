package Concepts;

public class mk {
    public static void main(String[] args) {
        System.out.println(call());
    }

    private static int call() {
        try {
            return 1;
        } catch (Exception ignored) {}
        finally {
            return 2;
        }
    }
}
