import Task.*;

import java.io.IOException;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        Device device1 = new Computer(500, "Windows", 500, 1000, true);
        Device device2 = new NetBook(500, "Windows", 400, 1500, true, 100, "Asus");
        Device device3 = new NoteBook(300, "Linux", 256, 2000, false, 120, "LG");

        Person person1 = new Person(device1, 500);
        Person person2 = new Person(device2, 10000);
        Person person3 = new Person(device3, 6000);

        Store store = new Store(10000, "bill.txt");
        store.sellDevice(person1, device1);


    }
}
