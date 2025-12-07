public class Main {
    public static void main(String[] args) {
        // depreciated method to get better understanding of process


//        int a = 123;
//        Integer a = new Integer(123);
//        Float b = new Float(12.20f);
//        Character c = new Character('$');
//        Boolean d = new Boolean(true);
            // autoboxing
//            Integer a = 123;
//            Float b = 12.3f;
//            Character c = '$';
//            Boolean d = true;
//
//            // unboxing
//            int x = a;
//            float z = b;
//
//            String A = Integer.toString(111);
//            String B = Float.toString(22.2f);
//            String C = Character.toString('$');
//            String D = Boolean.toString(false);
//
//            String X = A + B + C + D;
//
//        System.out.println(X);

        char letter = 'a';
        System.out.println("Is it a letter? " + letter);
        System.out.println(Character.isLetter(letter));
        System.out.println("Is it Uppercase? " + letter);
        System.out.println(Character.isUpperCase(letter));

        char letterNot = '$';
        System.out.println("Is it a letter? " + letterNot);
        System.out.println(Character.isLetter(letterNot));
        System.out.println("Is it Uppercase? " + letterNot);
        System.out.println(Character.isUpperCase(letterNot));
    }
}
