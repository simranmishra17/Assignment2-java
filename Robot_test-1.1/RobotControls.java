import java.io.File;
class InvalidGridException extends Exception{
    public InvalidGridException(String message){
        super(message);
    }
}
enum Direction{
    E,W,N,S;
}
interface Robot{
    void Print_x_y_coordinates(int x_coordinates,int y_coordinates,Direction direction);
    int move_forward(int y);
    int move_left(int x);
    int move_backward(int y);
    int move_right(int x);
    Direction rotate_90_right(Direction direction);
    Direction rotate_90_left(Direction direction);
    File make_file();
    boolean check_y_coordinate_limit(int y);
    boolean check_x_coordinate_limit(int x);

//direction=enum
//file dne
    // error =5*5 done
    //custom -exception done
    //s -error -donre


}
class Robotimplements implements Robot {
    public void Print_x_y_coordinates(int x_coordinates, int y_coordinates, Direction direction) {
        System.out.println("(" + x_coordinates + "," + y_coordinates + ")" + direction);
    }

    public int move_forward(int y) {
        y += 1;
        return y;
    }

    @Override
    public int move_backward(int y) {
        y -= 1;
        return y;
    }


    @Override
    public int move_right(int x) {
        x += 1;
        return x;
    }

    @Override
    public int move_left(int x) {
        x -= 1;
        return x;
    }

    @Override
    public Direction rotate_90_right(Direction direction) {
        if (direction == Direction.E) {
            direction = Direction.S;
        } else if (direction == Direction.W) {
            direction = Direction.N;
        } else if (direction == Direction.N) {
            direction = Direction.E;
        } else if (direction == Direction.S) {
            direction = Direction.W;
        }
        return direction;
    }

    @Override
    public Direction rotate_90_left(Direction direction) {
        if (direction == Direction.E) {
            direction = Direction.N;
        } else if (direction == Direction.W) {
            direction = Direction.S;
        } else if (direction == Direction.N) {
            direction = Direction.W;
        } else if (direction == Direction.S) {
            direction = Direction.E;
        }
        return direction;
    }

    @Override
    public File make_file() {
        File f1 = new File("D:Robot.txt");
        return f1;
    }

    @Override
    public boolean check_y_coordinate_limit(int y) {
        if (y >= 6 || y < 0) {
            try {
                throw new InvalidGridException("Robot have crossed the given grid of 5*5.");
            } catch (InvalidGridException e) {
                System.out.println(e.getMessage());
                return true;
            }
        } else {
            return false;
        }
    }

    @Override
    public boolean check_x_coordinate_limit(int x) {
        if (x >= 6 || x < 0) {
            try {
                throw new InvalidGridException("Robot have crossed the given grid of 5*5.");
            } catch (InvalidGridException e) {
                System.out.println(e.getMessage());
                return true;
            }
        } else {
            return false;
        }
    }
}
