package Task;


public abstract class Device {
    public int ssdSize;
    public String operationSystemName;
    public int ozuSize;
    public int price;
    public boolean isTurnedOn;

    public Device(int ssdSize, String operationSystemName, int ozuSize, int price, boolean isTurnedOn) {
        this.ssdSize = ssdSize;
        this.operationSystemName = operationSystemName;
        this.ozuSize = ozuSize;
        this.price = price;
        this.isTurnedOn = isTurnedOn;
    }

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


    public boolean turnOnOrOff(){return isTurnedOn = !isTurnedOn;}

}
