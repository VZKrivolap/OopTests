package Task;

public class Computer extends Device {
    private static int count = 0;
    private int ssdSize;
    private String operationSystemName;
    private int ozuSize;
    private int price;


    public int getSsdSize() {
        return ssdSize;
    }

    public void setSsdSize(int ssdSize) {
        this.ssdSize = ssdSize;
    }

    public String getOperationSystemName() {
        return operationSystemName;
    }

    public void setOperationSystemName(String operationSystemName) {
        this.operationSystemName = operationSystemName;
    }

    public int getOzuSize() {
        return ozuSize;
    }

    public void setOzuSize(int ozuSize) {
        this.ozuSize = ozuSize;
    }

    public static int getCount() {
        return count;
    }

//    public boolean turnOnOrOff(Computer computer){
//        return computer.isTurnedOn = !computer.isTurnedOn;
//    }

    public boolean isTurnedOn() {
        return isTurnedOn;
    }

    public boolean setTurnedOn(boolean turnedOn) {
        isTurnedOn = turnedOn;
        return turnedOn;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public boolean turnOnOrOff(Computer computer) {
        return computer.isTurnedOn = !computer.isTurnedOn;
    }
}