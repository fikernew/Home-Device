import java.util.Scanner;
import java.util.ArrayList;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        System.out.print("Enter password: ");
        int password = input.nextInt();
        
        if (password != 1234) {
            System.out.println("Incorrect password.");
            input.close();
            return;
        }
        System.out.println("Access Granted. Welcome to the Smart Home System.");
        System.out.println();
        System.out.println();

        ArrayList<Device> rooms = new ArrayList<>();
        rooms.add(new Light("Living Room"));
        rooms.add(new Fan("Bedroom"));
        rooms.add(new AC("Office"));

        int roomChoice;

        do {
            LocalDateTime now = LocalDateTime.now();
            String timeStr = now.format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
System.out.println("|========================================|");
System.out.println("|=   SMART HOME CONTROL SYSTEM          =|");
System.out.println("|========================================|");
System.out.println();
            System.out.println("Current Time: " + timeStr);

            for (int k = 0; k < rooms.size(); k++) {
                System.out.println((k + 1) + ". " + rooms.get(k).getRoomName());
            }
              
            System.out.println("0. Exit System");
            System.out.print("Choice: ");
               
            roomChoice = input.nextInt();

            if (roomChoice > 0 && roomChoice <= rooms.size()) {
                Device selected = rooms.get(roomChoice - 1);
                manageDevice(selected, input);
            }

        } while (roomChoice != 0);

        System.out.println("System Shutdown.");
        input.close();
    }

    public static void manageDevice(Device d, Scanner input) {
        String state;
        if (d.isOn()) {
            state = "ON";
        } else {
            state = "OFF";
        }
        System.out.println("--- " + d.getRoomName().toUpperCase() + " ---");
        System.out.println("Device: " + d.getDeviceType());
        System.out.println("Current Status: " + state);

        if (d.getLastTimeConfigured() > 0) {
            System.out.println("Previous Time Set: " + d.getLastTimeConfigured() + " minutes (started at " + d.getTimerStartedAt() + ")");
        } else {
            System.out.println("Previous Time Set: None");
        }

        System.out.println("1. Turn ON");
        System.out.println("2. Turn ON with a Timer");
        System.out.println("3. Turn OFF");
        System.out.println("4. Back to Main Menu");
        System.out.print("Action: ");

        int action = input.nextInt();
        switch (action) {
            case 1 -> {
                d.turnOn();
                System.out.println(d.getDeviceType() + " in " + d.getRoomName() + " is now ON.");
            }
            case 2 -> {
                System.out.print("Enter duration in minutes: ");
                int minutes = input.nextInt();
                d.turnOn(minutes);
            }
            case 3 -> {
                d.turnOff();
                System.out.println(d.getDeviceType() + " in " + d.getRoomName() + " is now OFF.");
            }
            case 4 -> System.out.println("Returning...");
            default -> System.out.println("Invalid Action.");
        }
    }
}