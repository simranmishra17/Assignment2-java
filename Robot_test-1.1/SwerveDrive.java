import java.util.List;
class SwerveDrive extends SwerveMovement {
    public void actual_implementation(List<String> listOfMovement) {
        Robot swerveDrive = new Robot();
        System.out.println(swerveDrive.toString());
        for (String i : listOfMovement) {
            if (i.charAt(0) == 'F') {
                swerveDrive = MoveForward(swerveDrive);
                if (swerveDrive.CheckXYCoordinates()) {
                    break;
                }
            } else if (i.charAt(0) == 'R') {
                swerveDrive= MoveRight(swerveDrive);
                if (swerveDrive.CheckXYCoordinates()) {
                    break;
                }
            } else if (i.charAt(0) == 'L') {
                swerveDrive = MoveLeft(swerveDrive);
                if (swerveDrive.CheckXYCoordinates()) {
                    break;
                }
            } else if (i.charAt(0) == 'B') {
                swerveDrive = MoveBackward(swerveDrive);
                if (swerveDrive.CheckXYCoordinates()) {
                    break;
                }
            } else {
                swerveDrive.WrongMove();
            }
        }
    }
}