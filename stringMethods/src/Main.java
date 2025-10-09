public class Main {
    public static void main(String[] args) {

        String name = " Bro Code ";
        String nameTest = "Bro Code";
        String emptyName = "";
        String passwordName = "password";

        int length = name.length();
        char letter = name.charAt(0);
        //character with index 0 (first)

        int index1 = name.indexOf("o");
        int index2 = name.lastIndexOf("o");

        name = name.toUpperCase();
        name = name.toLowerCase();
        name = name.trim();
        //trims spaces before and after

        name = name.replace("o", "a");
        //replace o's with a's

        System.out.println(name);

        System.out.println(emptyName.isEmpty());

        //returns true if true
        if(nameTest.isEmpty()){
            System.out.println("Your name is empty");
        }
        else{
            System.out.println("Not empty.");
        }

        if(name.contains(" ")){
            System.out.println("Your name contains spaces.");
        }
        else {
            System.out.println("Your name doesn't contain any spaces.");
        }

        if(passwordName.equalsIgnoreCase("password")){
            //equals is hard comparison, so " password" won't be detected.
            //equalsIgnoreCase just ignores Upper and Lower case letters.
            System.out.println("Your name can't be password.");
        }
        else {
            System.out.println("Hello, " + name);
        }
    }
}
