package academy.javapro.lab;

interface Device {
    void turnOn();
    void turnOff();
    String getStatus();
}

interface VoiceControlled {
    void voiceControl(String command);
}

class SmartLight implements Device, VoiceControlled {
    // Implement this class
}

class SmartThermostat implements Device {
    // Implement this class
}

class SmartSpeaker implements Device, VoiceControlled {
    // Implement this class
}

public class SmartHomeController {
    public static void controlDevice(Device device) {
        // Implement this method
    }

    public static void voiceControl(VoiceControlled device, String command) {
        // Implement this method
    }

    public static void main(String[] args) {
        // Create devices and demonstrate the smart home system
    }
}
