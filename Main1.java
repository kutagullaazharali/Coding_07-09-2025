// Hardware team interface
interface Device {
    int deviceVersion();       // returns device version
    void turnOn();             // turns on the device
    
    // Default method to reset hardware
    default void reset() {
        System.out.println("Device reset to factory settings.");
    }
    
    // Static method to show device info
    static void showDeviceInfo() {
        System.out.println("Device Info: Smart Device v1.0");
    }
}

// Software team interface
interface SmartFeatures {
    void connectToInternet();  // connect to internet
    
    // Default method to reset software
    default void reset() {
        System.out.println("Software reset to default configuration.");
    }
}

// SmartPhone class implementing both interfaces
class SmartPhone implements Device, SmartFeatures {

    @Override
    public int deviceVersion() {
        return 1;  // example version
    }

    @Override
    public void turnOn() {
        System.out.println("SmartPhone is turned ON.");
    }

    @Override
    public void connectToInternet() {
        System.out.println("SmartPhone connected to the Internet.");
    }

    // Must override reset() because both interfaces have default methods
    @Override
    public void reset() {
        // Optionally, you can call each interface's reset
        Device.super.reset();         // call Device default reset
        SmartFeatures.super.reset();  // call SmartFeatures default reset
        System.out.println("SmartPhone fully reset completed.");
    }
}

// Main class to test
public class Main1 {
    public static void main(String[] args) {
        SmartPhone phone = new SmartPhone();
        
        phone.turnOn();
        phone.connectToInternet();
        phone.reset();
        
        System.out.println("Device version: " + phone.deviceVersion());
        
        // Call static method from Device interface
        Device.showDeviceInfo();
    }
}