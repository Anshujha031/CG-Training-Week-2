package singlelevel.smart;

public class Device {
    public int deviceId;
    public String status;

    public Device(int deviceId,String status){
        this.deviceId = deviceId;
        this.status = status;
    }

    public void displayStatus(){
        System.out.println("Device Id " + deviceId);
        System.out.println("Status(Yes/No) " + status);
    }
}
