import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class TryMap {

    HashMap<String, List<String>> myList;
    public TryMap() {
        myList=new HashMap<>();
    }
    public boolean put(String key, String value){
        if (myList.containsKey(key)){
            List<String> x= myList.get(key);
            x.add(value);
            Collections.sort(x);
            myList.replace(key,x);
            }


        else{
            List<String> list=new ArrayList<String>();  {
                list.add(value);
            }
            myList.put(key,list);
        }
        return true;
    }
    public List<String> get(String key){
        return myList.get(key);
    }



}
