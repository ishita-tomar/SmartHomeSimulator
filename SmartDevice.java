package devices;

// Abstract base class for all smart devices
public abstract class SmartDevice {
    protected String id;
    protected String name;
    protected boolean isOn;

    public SmartDevice(String id, String name) {
        this.id = id;
        this.name = name;
        this.isOn = false;
    }

    public void turnOn() {
        isOn = true;
        System.out.println(name + " is now ON.");
    }

    public void turnOff() {
        isOn = false;
        System.out.println(name + " is now OFF.");
    }

    public boolean isOn() {
        return isOn;
    }

    public String getName() {
        return name;
    }

    public abstract void printStatus(); // Must be implemented by child classes
}
