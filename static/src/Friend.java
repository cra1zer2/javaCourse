public class Friend {
    // static - only 1 numOfFriends can exist. without static,
    // we would have 2 numOfFriends saying 1 instead of unified counter
    static int numOfFriends;
    String name;

    Friend(String name){
        this.name = name;
        numOfFriends++;
    }

    static void showFriends(){
        System.out.println("You have " + numOfFriends + " friends");
    }
}
