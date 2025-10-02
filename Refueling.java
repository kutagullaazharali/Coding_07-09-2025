
import java.util.Collections;
import java.util.PriorityQueue;


class Refueling {

    public int minRefuelStops(int target, int startFuel, int[][] stations) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        int stops = 0;
        int i = 0;
        int n = stations.length;
        int maxFuel = startFuel;
        while(maxFuel < target) {
            while (i<n && stations[i][0] <= maxFuel) { 
                pq.offer(stations[i][1]);
                i++;
            }
            if(pq.isEmpty()) {
                return -1;
            }
            maxFuel +=pq.poll();     
            stops++;
        } 
      return stops;
    }

    public static void main(String[] args) {
        Refueling sol = new Refueling();

        // Test case 1
        int target1 = 100;
        int startFuel1 = 10;
        int[][] stations1 = {{10, 60}, {20, 30}, {30, 30}, {60, 40}};
        System.out.println("Minimum stops: " + sol.minRefuelStops(target1, startFuel1, stations1));

        // Expected output: 2

        // Test case 2
        int target2 = 100;
        int startFuel2 = 50;
        int[][] stations2 = {{25, 25}, {50, 25}, {75, 25}};
        System.out.println("Minimum stops: " + sol.minRefuelStops(target2, startFuel2, stations2));
        // Expected output: 1

        // Test case 3
        int target3 = 100;
        int startFuel3 = 1;
        int[][] stations3 = {{10, 100}};
        System.out.println("Minimum stops: " + sol.minRefuelStops(target3, startFuel3, stations3));
        // Expected output: -1
    }
}
