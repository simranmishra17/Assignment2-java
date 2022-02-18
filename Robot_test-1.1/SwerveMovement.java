
class SwerveMovement implements Movement{

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

}