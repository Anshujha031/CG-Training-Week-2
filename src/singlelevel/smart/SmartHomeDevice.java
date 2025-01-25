package singlelevel.smart;

public class SmartHomeDevice {
    public static void main(String[] args){
        Device d = new Thermostat(101,"Yes",20);
        d.displayStatus();
    }
}
