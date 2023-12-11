import Task.*;

import java.util.*;

public class Main {
    public static void main(String[] args) {
//        NoteBook noteBook = new NoteBook(500, "Linux", 16, 5000, false, 100, "Asus");
//        PCMaster pcMaster = new PCMaster();
//        try {
//            pcMaster.turnOnOrOff(noteBook);
//        } catch (MasterExeption e) {
//            throw new RuntimeException(e);
//        }

        Device device1 = new Computer(500, "Windows", 500, 1000, true);
        Device device2 = new NetBook(500, "Windows", 400, 1500, true, 100, "Asus");
        Device device3 = new NoteBook(300, "Linux", 256, 2000, false, 120, "LG");

        Person person1 = new Person(device1, 500);
        Person person2 = new Person(device2, 10000);
        Person person3 = new Person(device3, 6000);

//        List<Person> personList = new ArrayList<>();
//        personList.add(person1);
//        personList.add(person2);
//        personList.add(person3);
//
//        person1.setName("Ivan");
//        person2.setName("Ivan");
//        person3.setName("Petr");
//
//        Set<String> personSet = new HashSet<>();
//        personSet.add(person1.getName());
//        personSet.add(person2.getName());
//        personSet.add(person3.getName());
//
//        System.out.println(personSet);
//
//        person1.setName("Ivan");
//        person2.setName("Oleg");
//        person3.setName("Petr");
//
//        HashMap<String, Device> hashMap = new HashMap<>();
//        hashMap.put(person1.getName(), person1.getDevice());
//        hashMap.put(person2.getName(), person2.getDevice());
//        hashMap.put(person3.getName(), person3.getDevice());
//
//        System.out.println(hashMap);
    }
}
