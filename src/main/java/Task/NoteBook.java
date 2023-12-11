package Task;

public class NoteBook extends Device implements Outdoor{
    private int battery;
    private String firmName;

    public NoteBook(int ssdSize, String operationSystemName, int ozuSize, int price, boolean isTurnedOn, int battery, String firmName) {
        super(ssdSize, operationSystemName, ozuSize, price, isTurnedOn);
        this.battery=battery;
        this.firmName=firmName;
    }


    public int getBattery() {
        return battery;
    }

    public void setBattery(int battery) {
        this.battery = battery;
    }

    public String getFirmName() {
        return firmName;
    }

    public void setFirmName(String firmName) {
        this.firmName = firmName;
    }


    @Override
    public String toString() {
        return "NoteBook{" +
                "battery=" + battery +
                ", firmName='" + firmName + '\'' +
                ", ssdSize=" + ssdSize +
                ", operationSystemName='" + operationSystemName + '\'' +
                ", ozuSize=" + ozuSize +
                ", price=" + price +
                ", isTurnedOn=" + isTurnedOn +
                '}';
    }
}
