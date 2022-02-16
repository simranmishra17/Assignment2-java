import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

class SwerveDrive extends Robotimplements {
    public void actual_implementation() {
        try {
            // Create f1 object of the file to read data
            File f1 = new File("D:Robot.txt");
            try {
                Scanner dataReader = new Scanner(f1);

                int x_coordinates = 0;
                int y_coordinates = 0;
                char direction = 'E';

                Print_x_y_coordinates(x_coordinates, y_coordinates, direction);
                while (dataReader.hasNext()) {
                    String fileData = dataReader.next();
                    if (fileData.charAt(0) == 'F') {
                        y_coordinates += 1;
                        Print_x_y_coordinates(x_coordinates, y_coordinates, direction);

                    } else if (fileData.charAt(0) == 'B') {
                        y_coordinates -= 1;
                        Print_x_y_coordinates(x_coordinates, y_coordinates, direction);

                    } else if (fileData.charAt(0) == 'R') {
                        x_coordinates += 1;
                        Print_x_y_coordinates(x_coordinates, y_coordinates, direction);

                    } else if (fileData.charAt(0) == 'L') {
                        x_coordinates -= 1;
                        Print_x_y_coordinates(x_coordinates, y_coordinates, direction);

                    }
                }
                dataReader.close();
            } catch (Exception e) {
                System.out.println("Error reading from file");
            }
        } catch(Exception e) {
            System.out.println("Unexcpected error occurred!");
        }
    }
}
