package Task;

public class Person {
    Device device;
    private int money;
    private String name;

    public void setDevice(Device device) {
        this.device = device;
    }


    public Person(Device device, int money) {
        this.device = device;
        this.money = money;
    }

    public Device getDevice() {
        return device;
    }

    public void setComputer(Device device) {
        this.device = device;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public void sellDevice(Person person2){
        if (this.device == null){
            System.out.println("У продавца нет компьютера");
        } else {
            person2.setComputer(this.device);
            this.money+=this.device.getPrice();
            person2.money-=this.device.getPrice();
            this.setComputer(null);
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "device=" + device +
                ", money=" + money +
                '}';
    }
}
