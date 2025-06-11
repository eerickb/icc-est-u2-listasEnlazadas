import Model.Contact;

public class App {
    public static void main(String[] args) {
        Contact<String, String> c1 = new Contact<>("Juan", "123");
        Contact<String, String> c2 = new Contact<>("Juan", null);
        Contact<String, String> c3 = new Contact<>("Juana", "456");
        Contact<String, String> c4 = new Contact<>("Juan", "10");
        Contact<String, String> c5 = new Contact<>("Juan", "123");

        System.out.println("Comparación de nombres con == : " + (c1.getName() == c2.getName()));
        System.out.println("Comparación de nombres con equals: " + c1.getName().equals(c2.getName()));
        System.out.println("Comparación c1.equals(c5): " + c1.equals(c5));
        System.out.println("Comparación c1.equals(c2): " + c1.equals(c2));
        System.out.println("Comparación c1.equals(c3): " + c1.equals(c3));
    }
}