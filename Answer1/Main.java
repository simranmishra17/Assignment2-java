public class Main {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();


        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);

        list.display();

        System.out.println("Nodes after reverse: ");
        list.reverse();
        list.display();
    }
}
