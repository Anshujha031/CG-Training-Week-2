package singlelevel.smart;

public class Thermostat extends Device {
   public int temperatureSetting ;
   public Thermostat(int deviceId,String status,int temperatureSetting){
       super(deviceId,status);
       this.temperatureSetting = temperatureSetting;
   }
   @Override
    public void displayStatus(){
       super.displayStatus();
       System.out.println("Temeprature Setting : " + temperatureSetting);
   }
}
