import java.io.File;
import java.util.Scanner;

class TankDrive extends Robotimplements {
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
                    if(fileData.charAt(0)=='F' && fileData.charAt(2)=='F'){
                        y_coordinates+=1;
                        Print_x_y_coordinates(x_coordinates, y_coordinates, direction);
                    }else if(fileData.charAt(0)=='B' && fileData.charAt(2)=='B'){
                        y_coordinates-=1;
                        Print_x_y_coordinates(x_coordinates, y_coordinates, direction);
                    }else if(fileData.charAt(0)=='F' && fileData.charAt(2)=='B'){
                        if (direction == 'E') {
                            direction = 'S';
                        } else if (direction == 'W') {
                            direction = 'N';
                        } else if (direction == 'N') {
                            direction = 'E';
                        } else if (direction == 'S') {
                            direction = 'W';
                        }
                        Print_x_y_coordinates(x_coordinates, y_coordinates, direction);
                    }else if(fileData.charAt(0)=='B' && fileData.charAt(2)=='F'){
                        if (direction == 'E') {
                            direction = 'N';
                        } else if (direction == 'W') {
                            direction = 'S';
                        } else if (direction == 'N') {
                            direction = 'W';
                        } else if (direction == 'S') {
                            direction = 'E';
                        }
                        Print_x_y_coordinates(x_coordinates, y_coordinates, direction);
                    } else{
                        System.out.println("Wrong move. Terminating......");
                        break;
                    }
                    dataReader.close();
                } catch (Exception ) {
                        System.out.println("Error reading from file");
            }
            } catch(Exception e) {
                System.out.println("Unexcpected error occurred!");
            }
        }
    }