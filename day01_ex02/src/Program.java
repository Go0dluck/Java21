public class Program {
    public static void main(String[] args) {
        UsersArrayList UserArr = new UsersArrayList();

        UserArr.addUser("User1", 100);
        UserArr.addUser("User2", 100);
        UserArr.addUser("User3", 100);
        UserArr.addUser("User4", 100);
        UserArr.addUser("User5", 100);
        UserArr.addUser("User6", 100);
        UserArr.addUser("User7", 100);
        UserArr.addUser("User8", 100);
        UserArr.addUser("User9", 100);
        UserArr.addUser("User10", 100);
        UserArr.addUser("User11", 100);
        System.out.println(UserArr.retrieveNumberUsers());
        try {
            System.out.println(UserArr.retrieveUserId(123).getName());
        } catch (UserNotFoundException e){
            System.out.println(e.getMessage());
        }
        try {
            System.out.println(UserArr.retrieveUserId(4).getName());
        } catch (UserNotFoundException e){
            System.out.println(e.getMessage());
        }
        System.out.println(UserArr.retrieveUserIndex(2).getName());
    }
}