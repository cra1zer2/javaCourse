public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Cat cat = new Cat();

        System.out.println(dog.isAlive);
        System.out.println(cat.isAlive);

        System.out.println(cat.lives);
        cat.speak();

        System.out.println(dog.lives);
        dog.speak();

        // aren't related to animals but also are organisms.

        Plant plant = new Plant();
        System.out.println(plant.isAlive);
        plant.photosynthesize();

        // dog can't photosynthesize
        // dog.photosynthesize();

    }
}
