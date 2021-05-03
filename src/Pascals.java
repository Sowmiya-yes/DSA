package Day1;

import java.util.ArrayList;
import java.util.List;

public class Pascals {
    public static void main(String[] args) {
        int rows = 5;
        List<List<Integer>> list = new ArrayList<>();
        for(int i  = 0; i < rows; i++) {
            list.add(new ArrayList<>());
            for(int j = 0; j <= i; j++) {
                if(j == 0 || j == i)
                    list.get(i).add(1);
                else
                    list.get(i).add(list.get(i - 1).get(j - 1) +  list.get(i - 1).get(j));
            }
        }
        System.out.println(list);

        int r = 7, c = 4, top = 1, bottom  = 1;
        for(int i = 1; i <= c - 1; i++)
            top = top * (r - i);
        for(int i = 1; i < c; i++)
            bottom = bottom * i;

        System.out.println(top / bottom);

        for(int i = 1; i <= rows; i++) {
            int C=1;
            for(int j= 1; j <= i; j++) {
                System.out.print(C + " ");
                C = C * (i - j) / j;
            }
            System.out.println();
        }
    }
}
