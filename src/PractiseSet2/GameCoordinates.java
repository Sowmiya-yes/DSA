package PractiseSet2;

import java.lang.reflect.Array;
import java.util.stream.IntStream;

public class GameCoordinates {
    static boolean isReachable(int sx, int sy, int dx, int dy) {
        System.out.println(sx + " " + sy);
        if(sx == dx && sy == dy) return true;
        if(dx < sx || dy < sy) return false;
        return isReachable(sx + sy, sy, dx, dy) || isReachable(sx, sy + sx, dx, dy);
    }

    public static void main(String[] args) {
        int sx = 1, sy = 1, dx = 4, dy = 7;
        System.out.println(isReachable(sx, sy, dx, dy));
    }
}
