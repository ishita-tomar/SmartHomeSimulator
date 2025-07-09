package devices;

// SmartFan bhi SmartDevice ka child class hai (inheritance)
public class SmartFan extends SmartDevice {

    // Speed private hai (Encapsulation) – 1 se 5 tak allowed hai
    private int speed;

    // Constructor – id, name set karta hai aur speed ko default 1 set karta hai
    public SmartFan(String id, String name) {
        super(id, name); // parent class ka constructor call
        this.speed = 1; // default speed
    }

    // Method to set fan speed (user input ke according)
    public void setSpeed(int speed) {
        // Valid range check – speed 1 to 5 honi chahiye
        if (speed < 1 || speed > 5) {
            System.out.println("Speed must be between 1 and 5.");
            return;
        }

        this.speed = speed;
        System.out.println(name + "'s speed set to level " + speed);
    }

    // Overridden method – device ka status print karega
    @Override
    public void printStatus() {
        String status = isOn ? "ON" : "OFF"; // ternary operator use karke on/off status
        System.out.println("SmartFan [" + name + "] is " + status + ", Speed: " + speed);
    }
}
