class WaterJug {
    private int waterQuality = 500;
    private WaterJug() {}
    private static WaterJug Object = null;

    public int getWater(int Quality) {
        waterQuality -= Quality;
        return Quality; 
    }
    public static WaterJug getIntance() {
        if( Object == null) {
            Object = new WaterJug();
        }
        return Object;
    }
}
public class WaterJugMain {
    public static void main(String[] args) {
        WaterJug water = WaterJug.getIntance();
        System.out.println("Water object : "+water);
        System.out.println("get water : "+water.getWater(40));
        System.out.println("Water object : "+water);
    }
}
