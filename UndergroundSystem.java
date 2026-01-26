import java.util.HashMap;
import java.util.Map;

public class UndergroundSystem {

    private Map<Integer, CheckInData> checkInMap;

    private Map<String, RouteData> routeMap;

    public UndergroundSystem() {
        checkInMap = new HashMap<>();
        routeMap = new HashMap<>();
    }

    public void checkIn(int id, String stationName, int t) {
        checkInMap.put(id, new CheckInData(stationName, t));
    }

    public void checkOut(int id, String stationName, int t) {

        CheckInData checkInData = checkInMap.get(id);

        String startStation = checkInData.stationName;
        int startTime = checkInData.time;

        int travelTime = t - startTime;

        String routeKey = startStation + "-" + stationName;

        RouteData routeData = routeMap.getOrDefault(routeKey, new RouteData());
        routeData.totalTime += travelTime;
        routeData.tripCount++;

        routeMap.put(routeKey, routeData);

        checkInMap.remove(id);
    }

    public double getAverageTime(String startStation, String endStation) {

        String routeKey = startStation + "-" + endStation;

        RouteData routeData = routeMap.get(routeKey);

        return (double) routeData.totalTime / routeData.tripCount;
    }

    static class CheckInData {
        String stationName;
        int time;

        CheckInData(String stationName, int time) {
            this.stationName = stationName;
            this.time = time;
        }
    }

    static class RouteData {
        int totalTime = 0;
        int tripCount = 0;
    }


    public static void main(String[] args) {

        UndergroundSystem undergroundSystem = new UndergroundSystem();

        undergroundSystem.checkIn(45, "Leyton", 3);
        undergroundSystem.checkIn(32, "Paradise", 8);
        undergroundSystem.checkIn(27, "Leyton", 10);

        undergroundSystem.checkOut(45, "Waterloo", 15);
        undergroundSystem.checkOut(27, "Waterloo", 20);
        undergroundSystem.checkOut(32, "Cambridge", 22);

        System.out.println(undergroundSystem.getAverageTime("Paradise", "Cambridge"));
        System.out.println(undergroundSystem.getAverageTime("Leyton", "Waterloo"));

        undergroundSystem.checkIn(10, "Leyton", 24);

        System.out.println(undergroundSystem.getAverageTime("Leyton", "Waterloo"));

        undergroundSystem.checkOut(10, "Waterloo", 38);

        System.out.println(undergroundSystem.getAverageTime("Leyton", "Waterloo"));
    }
}