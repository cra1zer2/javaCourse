public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.speak();

        // instead of creating entire new class, we can:
        Dog talkingDog = new Dog(){
            @Override
            public void speak(){
                System.out.println("Dog is speaking English");
            }
        };
        talkingDog.speak();
    }
}
