public class Map {
    public static void main(String[] args) {

        TryMap myList =new TryMap();

        myList.put("Samsung", "Galaxy");
        myList.put("Google", "Nexus");
        myList.put("Google", "Pixel");
        myList.put("Realme", "X");
        myList.put("Realme", "3 Pro");
        myList.put("OnePlus", "One");
        myList.put("OnePlus", "5");
        myList.put("OnePlus", "7Pro");
        myList.put("OnePlus", "One");

        System.out.println("Google "+myList.get("Google"));

        System.out.println("Samsung "+myList.get("Samsung"));

        System.out.println("Realme "+myList.get("Realme"));

        System.out.println("OnePlus "+myList.get("OnePlus"));
    }
}
