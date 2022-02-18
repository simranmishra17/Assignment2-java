import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ReadFromFile {
     List<String> ListOfMovement=new ArrayList<>();
     int x=0;
    public ReadFromFile() {
        File f1 = new File("D:Robot.txt");
        try{
            Scanner data= new Scanner(f1);
            while (data.hasNext()){
                String FileData=data.next();
                ListOfMovement.add(FileData);
            }
        }catch (Exception e){
            x=1;
            System.out.println("Error reading file");
        }
    }
    public  List<String> getListOfMovement(){
        return ListOfMovement;
    }

}
