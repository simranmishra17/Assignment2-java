interface Robot{
    void Print_x_y_coordinates(int x_coordinates,int y_coordinates,char direction);
    //void ReadFile();
}
class Robotimplements implements Robot{
    public void Print_x_y_coordinates(int x_coordinates,int y_coordinates,char direction){
        System.out.println("("+x_coordinates+","+y_coordinates+")"+direction);
    }
}