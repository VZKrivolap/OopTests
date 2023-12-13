package Task;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Store {
    Device device;
    List<Device> deviceList = new ArrayList<>();
    int balance;

    public Store(int balance)   {
        this.balance = balance;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public void sellDevice(Person person, Device device) throws IOException {
        if (person.getMoney() < device.getPrice()) {
            System.out.println("Вам не хватает денег для покупки.");
        } else {
            deviceList.remove(device);
            person.setDevice(device);
            person.setMoney(person.getMoney() - device.getPrice());
            setBalance(balance + device.price);
        }
    }
}