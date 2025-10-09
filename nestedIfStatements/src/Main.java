public class Main {
    public static void main(String[] args) {

        boolean isStudent = true;
        boolean isSenior = true;
        float price = 9.99f;
        float promo = 1;

        if(isStudent){
            if(isSenior){
                System.out.println("You get a senior discount of 20%");
                System.out.println("You get a student discount of 10%");
                promo -= 0.3;
                price *= promo;
            }
            else{
                System.out.println("You get a student student discount of 10%");
                promo -= 0.1;
                price *= promo;
            }
        }
        else{
            if(isSenior){
                System.out.println("You get a senior discount of 20%");
                promo -= 0.2;
                price *= promo;
            }
            else{
                price *= promo;
            }

        }

        System.out.printf("Your price is: %.2f$", price);
    }
}
