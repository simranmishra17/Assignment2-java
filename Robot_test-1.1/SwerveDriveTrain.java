import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

class SwerveDrive extends Robotimplements {
    public void actual_implementation() {
        try {
            File f1 = make_file();
            try {
                Scanner dataReader = new Scanner(f1);

                int x_coordinates = 0;
                int y_coordinates = 0;
                Direction direction = Direction.E;

                Print_x_y_coordinates(x_coordinates, y_coordinates, direction);
                while (dataReader.hasNext()) {
                    String fileData = dataReader.next();
                    if (fileData.charAt(0) == 'F') {
                        y_coordinates=move_forward(y_coordinates);
                        if(check_y_coordinate_limit(y_coordinates)){
                            break;
                        }
                        Print_x_y_coordinates(x_coordinates, y_coordinates, direction);

                    } else if (fileData.charAt(0) == 'B') {
                        y_coordinates =move_backward(y_coordinates);
                        if(check_y_coordinate_limit(y_coordinates)){
                            break;
                        }
                        Print_x_y_coordinates(x_coordinates, y_coordinates, direction);

                    } else if (fileData.charAt(0) == 'R') {
                        x_coordinates=move_right(x_coordinates);
                        if(check_x_coordinate_limit(x_coordinates)){
                            break;
                        }
                        Print_x_y_coordinates(x_coordinates, y_coordinates, direction);

                    } else if (fileData.charAt(0) == 'L') {
                        x_coordinates =move_left(x_coordinates);
                        if(check_x_coordinate_limit(x_coordinates)){
                            break;
                        }
                        Print_x_y_coordinates(x_coordinates, y_coordinates, direction);
                    }else{
                        System.out.println("Wrong move. Terminating......");
                        break;
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
