import devices.SmartLight;
import devices.SmartFan;
import home.Room;
import ai.RuleEngine;
import assistant.VoiceCommandParser;

import java.util.Scanner; // for user input

public class Main {
    public static void main(String[] args) {

        // Devices
        SmartLight light = new SmartLight("L001", "Hall Light");
        SmartFan fan = new SmartFan("F001", "Ceiling Fan");

        // Room
        Room livingRoom = new Room("Living Room");
        livingRoom.addDevice(light);
        livingRoom.addDevice(fan);

        // Apply AI Rule
        RuleEngine ruleEngine = new RuleEngine();
        int currentTemperature = 33;
        ruleEngine.applyRules(fan, currentTemperature);

        // Voice Assistant Simulation
        VoiceCommandParser assistant = new VoiceCommandParser();
        Scanner sc = new Scanner(System.in);

        System.out.println("🗣️ Voice Assistant Ready! Type 'exit' to stop.");

        // Loop to accept multiple commands
        while (true) {
            System.out.print("\n👉 Enter command: ");
            String input = sc.nextLine();

            if (input.equalsIgnoreCase("exit")) {
                System.out.println("👋 Exiting voice assistant. Goodbye!");
                break;
            }

            assistant.handleCommand(input, light, fan); // pass command to parser
        }

        sc.close();
    }
}
