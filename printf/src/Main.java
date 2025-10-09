public class Main {
    public static void main(String[] args) {

        //printf is used to format output
        //%[flags][width][.precision][specifier]
        String name = "Spongebob";
        char firstLetter = 'S';
        int age = 30;
        float height = 60.5f;
        boolean isEmployed = true;

        System.out.printf("Hello %s\n", name);
        System.out.printf("Your name starts with a %c\n", firstLetter);
        System.out.printf("You are %d years old\n", age);
        System.out.printf("You are %.1f inches height\n", height);
        //default 6 digits after .
        //.1 makes 1 digit after .

        System.out.printf("Employed: %b\n",  isEmployed);
        System.out.printf("%s is %d years old\n", name, age);

        float price1 = 21.99f;
        float price2 = 32.99f;
        float price3 = -45000000.99f;

        System.out.printf("%.2f\n", price1);
        System.out.printf("%+.2f\n", price2);
        System.out.printf("%+.2f\n", price3);
        //if negative, gives -.
        System.out.printf("%,+.2f\n", price3);
        //"," after % gives coma for every 3 numbers. Read-friendly numbers

        int id1 = 1;
        int id2 = 23;
        int id3 = 456;

        System.out.printf("%04d\n", id1);
        System.out.printf("%04d\n", id2);
        System.out.printf("%-4d\n", id3);
        System.out.printf("%-4d\n", id1);

        //04 - 4 zeros 0000 and number in it
        //-4 makes 4 slots, spaces after number
    }
}
