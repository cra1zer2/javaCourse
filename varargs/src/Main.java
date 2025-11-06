public class Main {
    public static void main(String[] args) {
//        int result = add(1, 2, 3, 4);
//        System.out.println(result);
        System.out.println(average(3, 2, 4, 0));

    }
    static double average(int... numbers){
//        int sum = 0;
//        for (int number : numbers){
//            sum += number;
//        }
//
//        return sum;

        double sum = 0;

        if(numbers == null || numbers.length == 0) return 0;

        for(double number : numbers){
            sum += number;

        }

        return sum / numbers.length;
        // length built into array lib's
    }
}