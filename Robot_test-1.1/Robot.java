public class Robot {
    int x;
    int y;
    Direction direction;

    public Robot(){
        this.x=0;
        this.y=0;
        this.direction=Direction.E;
    }

    public String toString(){
       return "(" + x+ "," + y + ")" + direction;
    }

    public void setX(int x){
        this.x=x;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public Direction getDirection() {
        return direction;
    }

    public void setY(int y){
        this.y=y;
    }
    public void setDirection(Direction direction){
        this.direction=direction;
    }

    public boolean CheckXYCoordinates() {
        try {
            if (this.x>= 6 ||this.x < 0 || this.y>=6 || this.y<0) {
                throw new InvalidGridException("Robot have crossed the given grid of 5*5.");
            } else {
                return false;
            }
        }catch (InvalidGridException e) {
            System.out.println(e.getMessage());
            return true;
        }
    }
    public void WrongMove(){
        System.out.println("Wrong move");
    }

}
