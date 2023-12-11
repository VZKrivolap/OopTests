package Task;

public class NetBook extends Device implements Outdoor{
    private int battery;
    private String firmName;

    public NetBook(int ssdSize, String operationSystemName, int ozuSize, int price, boolean isTurnedOn, int battery, String firmName) {
        super(ssdSize, operationSystemName, ozuSize, price, isTurnedOn);
        this.battery = battery;
        this.firmName = firmName;
    }


    @Override
    public String toString() {
        return "NetBook{" +
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
