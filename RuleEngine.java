package ai;

import devices.SmartFan;

public class RuleEngine {

    // Method to apply simple AI rule
    public void applyRules(SmartFan fan, int currentTemperature) {

        // Rule: Agar temperature > 30 ho, fan ON karo
        if (currentTemperature > 30) {
            System.out.println("🌡️ Temperature is " + currentTemperature + "°C – It's hot!");

            if (!fan.isOn()) {
                fan.turnOn();
                fan.setSpeed(4); // high speed
                System.out.println("🌀 Fan turned ON automatically by RuleEngine.");
            } else {
                System.out.println("🌀 Fan is already ON.");
            }

        } else {
            System.out.println("🌡️ Temperature is " + currentTemperature + "°C – Comfortable, no action needed.");
        }
    }
}
