import java.util.Random;
public class Main {
    public static void main(String[] args) {

        Random rand = new Random();
        int number1;
        float number2;
        double number3;
        boolean flag;
        //again, double has like 2 times of float values but also 2x expensive in calculation time.

        flag = rand.nextBoolean();
        number1 = rand.nextInt(1,7);
        number2 = rand.nextFloat(1,7);
        number3 = rand.nextDouble(1,7);

        System.out.println(number1);
        System.out.println(number2);
        System.out.println(number3);

        if(flag){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
    }
}
