public class UsersArrayList implements UsersList{
    private User[] UsersArr;
    private int Size;
    public UsersArrayList() {
        UsersArr = new User[10];
    }

    @Override
    public void addUser(String name, int balance) {
        if (UsersArr.length == Size){
            User[] UsersArrNew = new User[UsersArr.length + UsersArr.length / 2];
            for (int i = 0; i < UsersArr.length; i++){
                UsersArrNew[i] = UsersArr[i];
            }
            UsersArr = UsersArrNew;
        }
        for (int i = 0; i < UsersArr.length; i++){
            if (UsersArr[i] == null){
                UsersArr[i] = new User(name, balance);
                Size++;
                return;
            }
        }
    }

    @Override
    public User retrieveUserId(int id) throws UserNotFoundException {
        for (int i = 0; i < UsersArr.length; i++){
            if (UsersArr[i] == null)
                break;
            if (UsersArr[i].getIdentifier() == id)
                return UsersArr[i];
        }
        throw new UserNotFoundException();
    }

    @Override
    public User retrieveUserIndex(int index) {
        for (int i = 0; i < UsersArr.length; i++){
            if (i == index)
                return UsersArr[i];
        }
        return null;
    }

    @Override
    public int retrieveNumberUsers() {
        return Size;
    }
}