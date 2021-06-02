public interface UsersList {
    void addUser(User user);
    User retrieveUserId(int id) throws UserNotFoundException, UserNotFoundException;
    User retrieveUserIndex(int index);
    int retrieveNumberUsers();
}