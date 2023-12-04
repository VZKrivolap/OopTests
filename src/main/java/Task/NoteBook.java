package Task;

public class NoteBook extends Computer{
    private int battery;
    private String firmName;
    public NoteBook(int ssdSize, String operationSystemName, int ozuSize, int price, int battery, String firmName) {
        super(ssdSize, operationSystemName, ozuSize, price);
        this.battery = battery;
        this.firmName = firmName;
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
}
