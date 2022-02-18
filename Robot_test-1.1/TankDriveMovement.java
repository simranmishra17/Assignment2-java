class TankDriveMovement implements Movement {

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
        Direction direction=r.getDirection();
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

    @Override
    public Robot MoveLeft(Robot r) {
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
}