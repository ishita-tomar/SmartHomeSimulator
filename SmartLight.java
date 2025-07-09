package devices;

public class SmartLight extends SmartDevice {
    private int brightness; // Brightness from 0 to 100

    public SmartLight(String id, String name) {
        super(id, name);
        this.brightness = 50; // Default brightness
    }

    public void setBrightness(int brightness) {
        if (brightness < 0 || brightness > 100) {
            System.out.println("Brightness must be between 0 and 100.");
            return;
        }
        this.brightness = brightness;
        System.out.println(name + "'s brightness set to " + brightness + "%");
    }

    @Override
    public void printStatus() {
        String status = isOn ? "ON" : "OFF";
        System.out.println("SmartLight [" + name + "] is " + status + ", Brightness: " + brightness + "%");
    }
}
