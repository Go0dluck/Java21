public class UsersArrayList implements UsersList{
    private User[] usersArr;
    private int size;
    public UsersArrayList() {
        usersArr = new User[10];
    }

    @Override
    public void addUser(User user) {
        if (usersArr.length == size){
            User[] UsersArrNew = new User[usersArr.length + usersArr.length / 2];
            for (int i = 0; i < usersArr.length; i++){
                UsersArrNew[i] = usersArr[i];
            }
            usersArr = UsersArrNew;
        }
        for (int i = 0; i < usersArr.length; i++){
            if (usersArr[i] == null){
                usersArr[i] = user;
                size++;
                return;
            }
        }
    }

    @Override
    public User retrieveUserId(int id) throws UserNotFoundException {
        for (int i = 0; i < usersArr.length; i++){
            if (usersArr[i] == null)
                break;
            if (usersArr[i].getIdentifier() == id)
                return usersArr[i];
        }
        throw new UserNotFoundException();
    }

    @Override
    public User retrieveUserIndex(int index) {
        for (int i = 0; i < usersArr.length; i++){
            if (i == index)
                return usersArr[i];
        }
        return null;
    }

    @Override
    public int retrieveNumberUsers() {
        return size;
    }
}