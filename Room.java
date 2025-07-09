package home;

import devices.SmartDevice;
import java.util.ArrayList;
import java.util.List;

// Room class ek logical unit hai jisme multiple SmartDevices ho sakte hain
public class Room {
    private String name; // room ka naam jaise "Living Room"
    private List<SmartDevice> devices; // is room ke devices

    // Constructor – room ka naam set karta hai aur devices ki list initialize karta hai
    public Room(String name) {
        this.name = name;
        this.devices = new ArrayList<>();
    }

    // Add device to this room
    public void addDevice(SmartDevice device) {
        devices.add(device);
        System.out.println(device.getName() + " added to " + name);
    }

    // Show status of all devices in this room
    public void showStatus() {
        System.out.println("📍 Status of Room: " + name);
        for (SmartDevice device : devices) {
            device.printStatus(); // polymorphism: call device-specific printStatus()
        }
    }

    // Get room name
    public String getName() {
        return name;
    }
}
