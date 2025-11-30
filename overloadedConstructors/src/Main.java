public class Main {
    public static void main(String[] args) {
        User user1 = new User("Rick", "ramirez@punk", 17);
        User user2 = new User("Bob", "bob@work");
        User user3 = new User("Patrick");
        User user4 = new User();


//        System.out.println(user1.username);
//        System.out.println(user1.email);
//        System.out.println(user1.age);
//
//        System.out.println(user2.username);
//        System.out.println(user2.email);
//        System.out.println(user2.age);
//
//        System.out.println(user3.username);
//        System.out.println(user3.email);
//        System.out.println(user3.age);
//
//        System.out.println(user4.username);
//        System.out.println(user4.email);
//        System.out.println(user4.age);

        User[] users = {user1,user2,user3,user4};

        System.out.println("Users table");

        for (User u : users) {
            System.out.printf("%-20s", u.username);
        }
        System.out.println();
        for (User u : users) {
            System.out.printf("%-20s", u.email);
        }
        System.out.println();
        for (User u : users) {
            System.out.printf("%-20s", u.age);
        }
        System.out.println();
    }
}
