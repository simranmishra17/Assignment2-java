import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.nio.file.FileAlreadyExistsException;

public class TestDataFile {
    public TestDataFile() {
        try {
            String data = "F,F\nF,B\nL,L\nR,R\n";
            File f1 = new File("D:Robot.txt");

            FileWriter fileWriter = new FileWriter(f1.getName(), true);
            BufferedWriter b = new BufferedWriter(fileWriter);
            b.write(data);
            b.close();
        } catch (FileAlreadyExistsException Exception) {
            System.out.println("File already exist");
        } catch (Exception e) {
            System.out.println("Error");
        }
    }

}
