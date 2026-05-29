# 🏠 Smart Home Control System

A Java-based console application that simulates a smart home device management system. Built using core Object-Oriented Programming (OOP) principles including Abstraction, Inheritance, Encapsulation, and Polymorphism.

---

## 📌 Project Overview

The Smart Home Control System allows a user to:
- Log in with a password to access the system
- Select a room and manage its device (Light, Fan, or Air Conditioner)
- Turn devices ON or OFF
- Set a countdown timer for automatic shutoff
- View device status and previous timer configuration in real time

---

## 💡 OOP Concepts Demonstrated

| Concept | How It's Applied |
|---|---|
| **Abstraction** | `Device` is an abstract class that defines common behavior without full implementation |
| **Inheritance** | `Light`, `Fan`, and `AC` all extend the `Device` class |
| **Encapsulation** | Fields like `status`, `lastTimeConfigured` are private and accessed via getters |
| **Polymorphism** | `getDeviceType()` is overridden in each subclass to return its specific type |

---

## 📁 Project Structure

```
SmartHomeSystem/
├── Device.java       # Abstract base class for all smart devices
├── Light.java        # Contains Light, Fan, and AC subclasses
└── Main.java         # Application entry point with menu and control logic
```

---

## 🚀 How to Run

### Prerequisites
- Java JDK 8 or higher installed
- Terminal or Command Prompt

### Steps

```bash
# Step 1: Compile all Java files
javac *.java

# Step 2: Run the application
java Main
```

### Login
```
Enter password: 1234
```

---

## 🖥️ Application Flow

```
Enter Password
      ↓
Access Granted
      ↓
Select a Room (Living Room / Bedroom / Office)
      ↓
View Device Status
      ↓
Choose Action:
  1. Turn ON
  2. Turn ON with Timer
  3. Turn OFF
  4. Back to Main Menu
      ↓
Exit System
```

---

## 🏗️ Class Design

### `Device.java` — Abstract Base Class
- Stores room name, on/off status, timer duration, and start time
- Provides `turnOn()`, `turnOff()`, and `turnOn(int duration)` methods
- Declares abstract method `getDeviceType()` for subclasses to implement

### `Light.java` — Subclasses
- **Light** → controls the room light
- **Fan** → controls the room fan
- **AC** → controls the air conditioner
- All three extend `Device` and override `getDeviceType()`

### `Main.java` — Application Entry Point
- Handles password authentication
- Manages room selection loop with real-time timestamp
- Delegates device control to `manageDevice()` method

---

## 🔐 Default Password

```
1234
```

---

## 📸 Sample Output

```
|========================================|
|=   SMART HOME CONTROL SYSTEM          =|
|========================================|

Enter password: 1234
Access Granted. Welcome to the Smart Home System.

--- SELECT A ROOM --- [2025-06-01 10:45:23]
1. Living Room
2. Bedroom
3. Office
0. Exit System
Choice: 1

--- LIVING ROOM ---
Device: Light
Current Status: OFF
Previous Time Set: None
1. Turn ON
2. Turn ON with a Timer
3. Turn OFF
4. Back to Main Menu
Action: 2
Enter duration in minutes: 30
[Timer Set] This device will automatically turn off in 30 minutes.
```

---

## 👨‍💻 Author

| Name | Role |
|---|---|
| **[Your Name]** | Solo Developer |

> **Course:** Object-Oriented Programming (OOP)
> **Language:** Java
> **IDE:** Visual Studio Code

---

## 📄 License

This project is submitted as an academic assignment and is intended for educational purposes only.
