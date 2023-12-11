package Task;

public class PCMaster extends  Master{
    Home home;

    public boolean turnOnOrOff(Device device) throws MasterExeption {
        if (device instanceof Outdoor){
            throw new MasterExeption("PCMaster не работает с NoteBooks и NetBooks");
        } else {
            return device.turnOnOrOff();
        }
    }
}
