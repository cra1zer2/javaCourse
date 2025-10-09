public class Main {
//    public static void main(String[] args) {
//        System.out.println(add(1, 2, 3));
//    }
//    static double  add(double a, double b) {
//        return a + b;
//    }
//    static double  add(double a, double b,  double c) {
//        return a + b;
//    }
    public static void main(String[] args) {
        String pizza;
        pizza = bakePizza("flat bread");
        System.out.println(pizza);
        pizza = bakePizza("flat bread", "mozzarella");
        System.out.println(pizza);
        pizza = bakePizza("flat bread", "mozzarella", "pepperoni");
        System.out.println(pizza);
    }
    static String bakePizza(String bread){
        return bread + " pizza";
    }
    static String bakePizza(String bread, String cheese){
        return bread + " " + cheese + " pizza";
    }
    static String bakePizza(String bread, String cheese, String topping){
        return bread + " " + cheese + " " + topping + " pizza";
    }
}
