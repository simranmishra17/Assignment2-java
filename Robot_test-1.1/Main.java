public class Main {

    public static void main(String[] args) {
        ReadFromFile h = new ReadFromFile();
        //System.out.println(h.getListOfMovement());
        ArcadeDrive a = new ArcadeDrive();
        if (h.getListOfMovement() != null) {
            a.actual_implementation(h.getListOfMovement());
        } else {
            System.out.println("File empty ");
        }
    }
}