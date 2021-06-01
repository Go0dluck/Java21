public class Program {
    public static void main(String[] args) {
        User test = new User("Dima", 100);
        System.out.println(test.getIdentifier());
        User test1 = new User("Oleg", 200);
        System.out.println(test1.getIdentifier());
        User test2 = new User("Misha", 300);
        System.out.println(test2.getIdentifier());
    }
}