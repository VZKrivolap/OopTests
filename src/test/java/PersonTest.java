import Task.Computer;
import Task.Device;
import Task.NetBook;
import Task.Person;
import org.junit.Assert;
import org.junit.Test;

public class PersonTest {

    @Test
    public void sellDeviceTest(){
        Device device1 = new Computer(500, "Windows", 500, 1000, true);
        Person person1 = new Person(device1, 5000);
        Person person2 = new Person(null, 1000);

        person1.sellDevice(person2);

        Assert.assertEquals(person2.getDevice(), device1 );
        Assert.assertEquals(0, person2.getMoney());
        Assert.assertEquals(6000, person1.getMoney());
        Assert.assertEquals(null, person1.getDevice());
    }
}
