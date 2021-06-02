public class Program {
    public static void main(String[] args) {
        UsersArrayList UserArr = new UsersArrayList();
        User test1 = new User("User1", 100);
        User test2 = new User("User2", 100);
        User test3 = new User("User3", 100);
        User test4 = new User("User4", 100);
        User test5 = new User("User5", 100);
        User test6 = new User("User6", 100);
        User test7 = new User("User7", 100);
        User test8 = new User("User8", 100);
        User test9 = new User("User9", 100);
        User test10 = new User("User10", 100);
        User test11 = new User("User11", 100);

        UserArr.addUser(test1);
        UserArr.addUser(test2);
        UserArr.addUser(test3);
        UserArr.addUser(test4);
        UserArr.addUser(test5);
        UserArr.addUser(test6);
        UserArr.addUser(test7);
        UserArr.addUser(test8);
        UserArr.addUser(test9);
        UserArr.addUser(test10);
        UserArr.addUser(test11);
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