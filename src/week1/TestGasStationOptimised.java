package week1;

class GasStationOptimised {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int start = 0, surplus = 0, deficit = 0;
        for(int i = 0; i < gas.length; i++) {
            surplus = surplus + gas[i] - cost[i];
            if(surplus < 0) {
                start = i + 1;
                surplus = 0;
                deficit = deficit + surplus;
            }
        }
        if(surplus + deficit >= 0)
            return start;
        return -1;
    }
}

public class TestGasStationOptimised {
    public static void main(String[] args) {
        GasStationOptimised gasStation = new GasStationOptimised();
        int[] gas = {5, 1, 2, 3, 4};
        int[] cost = {4, 4, 1, 5, 1};
        System.out.println(gasStation.canCompleteCircuit(gas, cost));
    }
}
