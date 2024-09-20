# Lab: 8.0.15

**Objective:**

- Understand the concept and importance of interfaces in Java development.
- Learn how to define and implement interfaces in Java.
- Explore practical applications of interfaces in real-world Java projects.
- Identify common pitfalls and best practices when working with interfaces.
- Gain hands-on experience with a complete Java example that demonstrates interfaces.

**Prerequisites:**

- Basic understanding of Java programming.
- Familiarity with creating classes and objects in Java.
- Understanding of inheritance in Java.
- Knowledge of abstract classes and methods.

**What You'll Achieve:**

- Develop a solid understanding of interfaces and their role in Java.
- Implement practical examples that can be applied in real-world scenarios.
- Enhance your skills in object-oriented design, polymorphism, and loose coupling.

**Assignment Details**

In this assignment, you will create a simple smart home system using interfaces. Follow these steps:

1. Create an interface called `Device`:
   - Declare methods: `turnOn()`, `turnOff()`, `getStatus()`.
2. Create an interface called `VoiceControlled`:
   - Declare a method: `voiceControl(String command)`.
3. Create a class `SmartLight` that implements both `Device` and `VoiceControlled`:
   - Add a private boolean field `isOn`.
   - Implement all methods from both interfaces.
   - `voiceControl` should accept commands like "on" or "off".
4. Create a class `SmartThermostat` that implements Device:
   - Add private fields for `temperature` and `isOn`.
   - Implement all methods from the `Device` interface.
   - Add a method `setTemperature(int temp)`.
5. Create a class `SmartSpeaker` that implements both `Device` and `VoiceControlled`:
   - Add private fields for `volume` and `isOn`.
   - Implement all methods from both interfaces.
   - `voiceControl` should accept commands like "volume up", "volume down", "on", or "off".
6. Create a `SmartHomeController` class with a `main` method:
- Create an array of `Device` objects containing instances of `SmartLight`, `SmartThermostat`, and `SmartSpeaker`.
- Implement a method `controlDevice(Device device)` that turns the device on or off and prints its status.
- Implement a method `voiceControl(VoiceControlled device, String command)` that sends voice commands to compatible devices.
- Demonstrate the use of these methods with different devices.

**Example Output**

```
Smart Home System:

Controlling devices:
Smart Light is ON
Smart Thermostat is ON
Smart Speaker is ON

Voice controlling compatible devices:
Smart Light responded to voice command: on
Smart Speaker responded to voice command: volume up

Smart Light status: ON
Smart Thermostat status: ON (Temperature: 22°C)
Smart Speaker status: ON (Volume: 6)
```

**Starter Code**

The `SmartHomeController.java` file contains the following starter code:

```java
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

```

**Hints**

- Remember that interfaces in Java can only declare abstract methods (prior to Java 8) and constants.
- A class can implement multiple interfaces, allowing for a form of multiple inheritance of behavior.
- Use the `instanceof` operator to check if a Device is also `VoiceControlled` before attempting to use voice commands.
- Consider using enums for device states or command types to make your code more robust.
- Think about how interfaces promote loose coupling in your smart home system design.

**Submission Instructions**

1. Fork the repository
2. Clone your fork
3. Navigate into the repository
4. Implement the required classes and methods
5. Test your implementation with various inputs
6. Git add, commit, and push to your fork
7. Submit a pull request
    - Set the title of the pull request to your first name and last name
    - In the comment, briefly explain your implementation approach and any challenges you faced

Remember, the goal is to learn and have fun! Don't hesitate to ask for help if you get stuck.