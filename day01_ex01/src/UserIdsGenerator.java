public class UserIdsGenerator {
    private static int identifier;
    private static UserIdsGenerator generator;

    public static UserIdsGenerator getInstance() {
        if (generator == null){
            generator = new UserIdsGenerator();
        }
        return generator;
    }

    private UserIdsGenerator() {}

    public int generateId(){
        return identifier++;
    }
}