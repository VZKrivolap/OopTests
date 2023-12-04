package Task;

public class Person {
    Device device;
    private int money;

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

    public void sellDevice(Person person1, Person person2){
        if (person1.device == null){
            System.out.println("У продавца нет компьютера");
        } else {
            person2.setComputer(person1.device);
            person1.setComputer(null);
            person1.money+=person1.device.getPrice();
            person2.money-=person1.device.getPrice();
        }
    }
}
