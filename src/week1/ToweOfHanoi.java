package week1;


import java.util.Scanner;

public class ToweOfHanoi {

    static void recursiveTOH(int n, String from, String aux, String to) {
        if (n == 1) {
            System.out.println(from + " -> " + to);
            return;
        }

        recursiveTOH(n - 1, from, to, aux);
        System.out.println(from + " -> " + to);
        recursiveTOH(n - 1, aux, from, to);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int disks = scanner.nextInt();

        recursiveTOH(disks, "Source", "Auxillary", "Destination");
    }
}
