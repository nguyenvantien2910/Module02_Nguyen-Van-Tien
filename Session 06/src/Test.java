public class Test {
    private static int counter = 0;

    public static String generateID() {
        counter++;
        String id = "ID" + counter;
        return id;
    }
    public static void main(String[] args) {
        System.out.println("Generated ID: " + generateID());
        System.out.println("Generated ID: " + generateID());
        System.out.println("Generated ID: " + generateID());
    }
}
