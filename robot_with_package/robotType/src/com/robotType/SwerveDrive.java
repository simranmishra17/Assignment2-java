package com.robotType;
import com.movement.Movement;
import com.robot.Robot;
import java.util.List;

class SwerveMovement implements Movement {

    @Override
    public Robot MoveForward(Robot r) {
        int y=r.getY();
        y+=1;
        r.setY(y);
        System.out.println(r.toString());
        return r;
    }

    @Override
    public Robot MoveBackward(Robot r) {
        int y=r.getY();
        y-=1;
        r.setY(y);
        System.out.println(r.toString());
        return r;
    }

    @Override
    public Robot MoveRight(Robot r) {
        int x=r.getX();
        x+=1;
        r.setX(x);
        System.out.println(r.toString());
        return r;
    }


    public Robot MoveLeft(Robot r) {
        int x=r.getX();
        x-=1;
        r.setX(x);
        System.out.println(r.toString());
        return r;
    }

}
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