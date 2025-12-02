public class Main {
    public static void main(String[] args) {
        Friend friend1 = new Friend("Bob");
        Friend friend2 = new Friend("John");
        Friend friend3 = new Friend("Jane");
        Friend friend4 = new Friend("David");

        System.out.println(friend1.name);
        System.out.println(friend2.name);
        System.out.println(friend3.name);
        System.out.println(friend4.name);

        // instead of
        // System.out.println(Friend.numOfFriends);

        Friend.showFriends();
    }
}
