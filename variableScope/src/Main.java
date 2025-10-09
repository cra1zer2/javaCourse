public class Main {

    static int x = 3;

    public static void main(String[] args) {
        System.out.println(x);
        // global value

        int x = 1;
        System.out.println(x);
        // local variable

        doSomething();
    }
    static void doSomething() {
        int x = 2;
        System.out.println(x);
    }
}
