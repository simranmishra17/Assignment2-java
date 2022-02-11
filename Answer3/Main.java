//import java.util.*;

public class Main {


    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            Doubleton a = Doubleton.getInstance();
            System.out.println(a.getX());
            // Doubleton.count += 1;
        }

    }
}
