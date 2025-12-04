public class Main {
    static void main(String[] args) {
        Rabbit rabbit = new Rabbit();
        rabbit.flee();
//      rabbit cant hunt

        Wolf wolf = new Wolf();
        wolf.hunt();
//      wolf cant flee

        Bird bird = new Bird();
        bird.flee();
        bird.hunt();
//      can do both

    }

}
