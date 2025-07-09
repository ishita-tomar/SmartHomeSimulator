package assistant;

import devices.SmartLight;
import devices.SmartFan;

public class VoiceCommandParser {

    // Method to process text command
    public void handleCommand(String command, SmartLight light, SmartFan fan) {
        // Lowercase me convert karo taaki comparison easy ho
        String cmd = command.toLowerCase();

        if (cmd.contains("turn on light")) {
            light.turnOn();
        } else if (cmd.contains("turn off light")) {
            light.turnOff();
        } else if (cmd.contains("turn on fan")) {
            fan.turnOn();
        } else if (cmd.contains("turn off fan")) {
            fan.turnOff();
        } else if (cmd.contains("status")) {
            light.printStatus();
            fan.printStatus();
        } else {
            System.out.println("❓ Sorry, I didn't understand the command: " + command);
        }
    }
}
