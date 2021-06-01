public interface UsersList {
    void addUser(String name, int balance);
    User retrieveUserId(int id) throws UserNotFoundException, UserNotFoundException;
    User retrieveUserIndex(int index);
    int retrieveNumberUsers();
}