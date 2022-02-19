package RobotType;

import java.util.List;
class OmniMovement implements Movement {

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

    @Override
    public Robot MoveLeft(Robot r) {
        int x=r.getX();
        x-=1;
        r.setX(x);
        System.out.println(r.toString());
        return r;
    }

    public Robot moveBackwardForward(Robot r){
        Direction direction=r.getDirection();
        if (direction == Direction.E) {
            direction = Direction.N;
        } else if (direction == Direction.W) {
            direction = Direction.S;
        } else if (direction == Direction.N) {
            direction = Direction.W;
        } else if (direction == Direction.S) {
            direction = Direction.E;
        }
        r.setDirection(direction);
        System.out.println(r.toString());
        return r;
    }
    public Robot moveForwardBackward(Robot r){
        Direction direction= Direction.E;

        if (direction == Direction.E) {
            direction = Direction.S;
        } else if (direction == Direction.W) {
            direction = Direction.N;
        } else if (direction == Direction.N) {
            direction = Direction.E;
        } else if (direction == Direction.S) {
            direction = Direction.W;
        }
        r.setDirection(direction);
        System.out.println(r.toString());
        return r;
    }

    public Robot moveleftForward(Robot r){
        r=MoveForward(r);
        r=MoveRight(r);
        r=moveBackwardForward(r);
        return r;
    }

    public Robot moverightForward(Robot r){
        r=MoveForward(r);
        r=MoveLeft(r);
        r=moveBackwardForward(r);
        return r;
    }

}

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