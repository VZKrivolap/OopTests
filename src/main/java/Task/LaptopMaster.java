package Task;

public class LaptopMaster extends Master{
    Outdoor outdoor;

    @Override
    public boolean turnOnOrOff(Device device) throws MasterExeption {
        if (device instanceof Home){
            throw new MasterExeption("PCMaster не работает с Computer");
        } else {
            return device.isTurnedOn = !device.isTurnedOn;
        }
    }
}
