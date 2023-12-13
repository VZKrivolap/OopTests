package Task;

import java.io.*;

public class SaveBill {
    File file = new File("C:/Users/vadim/IdeaProjects/OopTasts/src/main/resources/bill.txt");
    FileWriter writer = new FileWriter(file);

    public SaveBill() throws IOException {
    }

    public void writeIn(Device device) throws IOException {
        writer.write("Был продан " + device.toString());
        writer.flush();
        writer.close();
    }

}
