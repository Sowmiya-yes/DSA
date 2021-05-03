package P4;

public class StringRotation {
    public static void main(String[] args) {
        String s1 = "amazon";
        String s2 = "azonam";

        String clock = s2.substring(2) + s2.substring(0, 2);

        String anticlock = s2.substring(s2.length() - 2) + s2.substring(0, s2.length() - 2);

        System.out.println(clock + " " + anticlock);
        System.out.println(clock.equals(s1) || anticlock.equals(s1));
    }
}
