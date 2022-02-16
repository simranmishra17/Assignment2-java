import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

class ArcadeDrive extends Robotimplements{
    public void actual_implementation(){
        try {
            // Create f1 object of the file to read data
            File f1 = new File("D:Robot.txt");
            Scanner dataReader = new Scanner(f1);

            int x_coordinates=0;
            int y_coordinates=0;
            char direction ='E';

            Print_x_y_coordinates(x_coordinates,y_coordinates,direction);

            while (dataReader.hasNext()) {
                String fileData = dataReader.next();
                if (fileData.charAt(0) == 'F') {
                    y_coordinates += 1;
                    Print_x_y_coordinates(x_coordinates,y_coordinates,direction);

                } else if (fileData.charAt(0) == 'B') {
                    y_coordinates -= 1;
                    Print_x_y_coordinates(x_coordinates,y_coordinates,direction);

                } else if (fileData.charAt(0) == 'R') {
                    //0,3 east
                    //      N
                    /// W        E
                    //      S

                    x_coordinates += 1; // 1,3 east
                    y_coordinates += 1;  //1,4 easr
                    if (direction == 'E') {
                        direction = 'S';
                    } else if (direction == 'W') {
                        direction = 'N';
                    } else if (direction == 'N') {
                        direction = 'E';
                    } else if (direction == 'S') {
                        direction = 'W';
                    }
                    Print_x_y_coordinates(x_coordinates,y_coordinates,direction);

                }else if(fileData.charAt(0)=='L'){
                    x_coordinates-=1;
                    y_coordinates+=1;
                    if (direction == 'E') {
                        direction = 'N';
                    } else if (direction == 'W') {
                        direction = 'S';
                    } else if (direction == 'N') {
                        direction = 'W';
                    } else if (direction == 'S') {
                        direction = 'E';
                    }
                    Print_x_y_coordinates(x_coordinates,y_coordinates,direction);


                }else{
                    System.out.println("Wrong input");
                }
            }
            dataReader.close();
        } catch (FileNotFoundException exception) {
            System.out.println("Unexcpected error occurred!");
            exception.printStackTrace();
        }
    }
}

