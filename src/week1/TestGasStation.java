package week1;

class GasStation {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int i = 0, start = -1, sum;
        labl: while(i < gas.length) {
            if(gas[i] >= cost[i]) {
                start = i;
                sum = 0;
                for (int j = start; j < gas.length; j++) {
                    sum = sum + gas[j] - cost[j];
                    if(sum < 0) {
                        i++;
                        continue labl;
                    }
                }
                for (int j = 0; j < start; j++) {
                    sum = sum + gas[j] - cost[j];
                    if(sum < 0) {
                        i++;
                        continue labl;
                    }
                }
                return start;
            }
            i++;
        }
        return -1;
    }
}

public class TestGasStation {
    public static void main(String[] args) {
        GasStation gasStation = new GasStation();
        int[] gas = {2};
        int[] cost = {2};
        System.out.println(gasStation.canCompleteCircuit(gas, cost));
    }
}