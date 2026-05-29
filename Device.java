import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

abstract class Device {
    public String roomName;
    private boolean status;
    private int lastTimeConfigured;
    private String timerStartedAt;

    public Device(String roomName) {
        this.roomName = roomName;
        this.status = false;
        this.lastTimeConfigured = 0;
        this.timerStartedAt = null;
    }

    public String getRoomName() {
        return roomName; }

    public boolean isOn() {
        return status; }

    public int getLastTimeConfigured() {
        return lastTimeConfigured; }

    public String getTimerStartedAt() {
        return timerStartedAt; }

    public void setRoomName(String roomName) {
        this.roomName = roomName;
    }

    public void setLastTimeConfigured(int duration) {
        this.lastTimeConfigured = duration;
    }

    public void setTimerStartedAt(String time) {
        this.timerStartedAt = time;
    }

    public void turnOn() {
        this.status = true;
    }

    public void turnOff() {
        this.status = false;
    }

    public void turnOn(int duration) {
        this.status = true;
        this.lastTimeConfigured = duration;
        this.timerStartedAt = LocalDateTime.now()
                .format(DateTimeFormatter.ofPattern("HH:mm:ss"));
        System.out.println("[Timer Set] This device will automatically turn off in " + duration + " minutes.");
    }

    public abstract String getDeviceType();
}
