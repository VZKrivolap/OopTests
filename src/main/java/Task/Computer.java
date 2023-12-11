package Task;

public class Computer extends Device implements Home {
    private static int count = 0;

    public Computer(int ssdSize, String operationSystemName, int ozuSize, int price, boolean isTurnedOn) {
        super(ssdSize, operationSystemName, ozuSize, price, isTurnedOn);
    }


    public static int getCount() {
        return count;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "ssdSize=" + ssdSize +
                ", operationSystemName='" + operationSystemName + '\'' +
                ", ozuSize=" + ozuSize +
                ", price=" + price +
                ", isTurnedOn=" + isTurnedOn +
                '}';
    }
}