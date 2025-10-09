public class Main {
    public static void main(String[] args) {
        //break - stops loop completely
        //continue - skips 1 argument, like 1 2 3 skip 5 6 etc.

        for (int i = 1; i <= 5; i++) {

            if (i == 3){
                continue;
            }
            System.out.println(i);
        }
        System.out.println("breaker");
        for (int i = 1; i <= 5; i++) {

            if (i == 3){
                break;
            }
            System.out.println(i);
        }
    }
}
