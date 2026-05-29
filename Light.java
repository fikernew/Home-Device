class Light extends Device {
    public Light(String roomName) { 
        super(roomName); }
    @Override
    public String getDeviceType() {
         return "Light"; }
}

class Fan extends Device {
    public Fan(String roomName) {
         super(roomName); }
    @Override
    public String getDeviceType() { 
        return "Fan"; }
}

class AC extends Device {
    public AC(String roomName) { 
        super(roomName); }
    @Override
    public String getDeviceType() { 
        return "Air Conditioner"; }
}