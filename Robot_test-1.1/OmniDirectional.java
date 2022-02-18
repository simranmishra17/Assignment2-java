import java.util.List;
class OmniDirectional extends OmniMovement {
    public void actual_implementation(List<String> listOfMovement) {
        Robot omniDirectionalDrive = new Robot();
        System.out.println(omniDirectionalDrive.toString());

        for (String i : listOfMovement) {
            if (i.charAt(0) == 'F' && i.charAt(2)=='F') {
                omniDirectionalDrive = MoveForward(omniDirectionalDrive);
                if (omniDirectionalDrive.CheckXYCoordinates()) {
                    break;
                }
            } else if (i.charAt(0) == 'F' && i.charAt(2)=='B') {
                omniDirectionalDrive = moveForwardBackward(omniDirectionalDrive);
                if (omniDirectionalDrive.CheckXYCoordinates()) {
                    break;
                }
            } else if (i.charAt(0) == 'B' && i.charAt(2)=='F') {
                omniDirectionalDrive= moveBackwardForward(omniDirectionalDrive);
                if (omniDirectionalDrive.CheckXYCoordinates()) {
                    break;
                }
            } else if (i.charAt(0) == 'B' && i.charAt(2)=='B') {
                omniDirectionalDrive= MoveBackward(omniDirectionalDrive);
                if (omniDirectionalDrive.CheckXYCoordinates()) {
                    break;
                }
            } else if(i.charAt(0)=='F' && i.length()==1){
                omniDirectionalDrive=moveleftForward(omniDirectionalDrive);
                if (omniDirectionalDrive.CheckXYCoordinates()) {
                    break;
                }
            }else if(i.charAt(2)=='F'){
                omniDirectionalDrive=moverightForward(omniDirectionalDrive);
                if (omniDirectionalDrive.CheckXYCoordinates()) {
                    break;
                }
            }else if(i.charAt(0)=='L' && i.charAt(0)=='L'){
                omniDirectionalDrive=MoveLeft(omniDirectionalDrive);
                if (omniDirectionalDrive.CheckXYCoordinates()) {
                    break;
                }
            }else if(i.charAt(0)=='R'&& i.charAt(2)=='R'){
                omniDirectionalDrive=MoveRight(omniDirectionalDrive);
                if (omniDirectionalDrive.CheckXYCoordinates()) {
                    break;
                }
            }else{
                omniDirectionalDrive.WrongMove();
            }
        }
    }
}

/*
class OmniDirectional extends RobotConstraintImplement {
    public void actual_implementation() {
        try {
            // Create f1 object of the file to read data
            File f1 = make_file();
            try {
                Scanner dataReader = new Scanner(f1);
                int x_coordinates = 0;
                int y_coordinates = 0;
                Direction direction=Direction.E;
                Print_x_y_coordinates(x_coordinates, y_coordinates, direction);

                while (dataReader.hasNext()) {
                    String fileData = dataReader.next();

                    if (fileData.charAt(0) == 'F' && fileData.charAt(2) == 'F') {
                        y_coordinates = move_forward(y_coordinates);
                        if(check_y_coordinate_limit(y_coordinates)){
                            break;
                        }
                        Print_x_y_coordinates(x_coordinates, y_coordinates, direction);

                    } else if (fileData.charAt(0) == 'B' && fileData.charAt(2) == 'B') {
                        y_coordinates = move_backward(y_coordinates);
                        if(check_y_coordinate_limit(y_coordinates)){
                            break;
                        }
                        Print_x_y_coordinates(x_coordinates, y_coordinates, direction);

                    } else if (fileData.charAt(0) == 'F' && fileData.charAt(2) == 'B') {
                        direction = rotate_90_right(direction);

                        Print_x_y_coordinates(x_coordinates, y_coordinates, direction);

                    } else if (fileData.charAt(0) == 'B' && fileData.charAt(2) == 'F') {
                        direction = rotate_90_left(direction);
                        Print_x_y_coordinates(x_coordinates, y_coordinates, direction);

                    } else if (fileData.charAt(0) == 'F' && fileData.length() == 1) {
                        y_coordinates = move_forward(y_coordinates);
                        if(check_y_coordinate_limit(y_coordinates)){
                            break;
                        }
                        x_coordinates =move_right(x_coordinates);
                        if(check_x_coordinate_limit(x_coordinates)){
                            break;
                        }
                        direction = rotate_90_right(direction);
                        Print_x_y_coordinates(x_coordinates, y_coordinates, direction);

                    } else if (fileData.charAt(0) == 'R' && fileData.length() == 1) {
                        y_coordinates = move_forward(y_coordinates);
                        x_coordinates = move_left(y_coordinates);
                        if(check_y_coordinate_limit(y_coordinates)){
                            break;
                        }

                        if(check_x_coordinate_limit(x_coordinates)){
                            break;
                        }
                        Print_x_y_coordinates(x_coordinates, y_coordinates, direction);

                    } else if (fileData.charAt(0) == 'L' && fileData.charAt(0) == 'L') {
                        x_coordinates = move_left(x_coordinates);
                        if(check_x_coordinate_limit(x_coordinates)){
                            break;
                        }
                        Print_x_y_coordinates(x_coordinates, y_coordinates, direction);
                    } else {
                        System.out.println("Wrong move. Terminating......");
                        break;
                    }
                    dataReader.close();
                }
            }catch (Exception e) {
                System.out.println("Error reading from file"+E);
            }
        } catch(Exception e) {
            System.out.println("Unexcpected error occurred!");
        }
    }
}
*/