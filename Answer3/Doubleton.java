public class Doubleton{
    private static Doubleton objDoubleton1;
    private static Doubleton objDoubleton2;
    public static int count =1;
    private int x;
    private Doubleton(int x){
        this.x=x;
    }
    public int getX(){
        return  this.x;
    }


    public  static Doubleton getInstance(){
        if(objDoubleton1 == null){
            objDoubleton1 = new Doubleton(1);
            count+=1;
            return objDoubleton1;
            //count+=1;
        }
        else if(objDoubleton2 == null){
            objDoubleton2 = new Doubleton(2);
            count+=1;
            return objDoubleton2;
        }
        else{
            if(count%2!=0) {
                count += 1;
                return objDoubleton1;
            }

            else {
                count+=1;
                return objDoubleton2;

            }
        }
    }
}