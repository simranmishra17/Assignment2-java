import java.util.List;
class ArcadeDrive extends ArcadeMovement {
    public void actual_implementation(List<String> listOfMovement) {
        Robot arcadeDrive = new Robot();
        System.out.println(arcadeDrive.toString());

        for (String i : listOfMovement) {
            if (i.charAt(0) == 'F') {
                arcadeDrive = MoveForward(arcadeDrive);
                if (arcadeDrive.CheckXYCoordinates()) {
                    break;
                }
            } else if (i.charAt(0) == 'R') {
                arcadeDrive = MoveRight(arcadeDrive);
                if (arcadeDrive.CheckXYCoordinates()) {
                    break;
                }
            } else if (i.charAt(0) == 'L') {
                arcadeDrive= MoveLeft(arcadeDrive);
                if (arcadeDrive.CheckXYCoordinates()) {
                    break;
                }
            } else if (i.charAt(0) == 'B') {
                arcadeDrive= MoveBackward(arcadeDrive);
                if (arcadeDrive.CheckXYCoordinates()) {
                    break;
                }
            } else {
                arcadeDrive.WrongMove();
            }
        }
    }
}