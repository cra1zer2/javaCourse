public class Main {
    public static void main(String[] args) {

        Circle circle = new Circle(3);
        Triangle triangle = new Triangle(4, 5);
        Rectangle rectangle = new Rectangle(10, 6);

//        circle.display();
//        triangle.display();
//        rectangle.display();

        System.out.println("Area of circle: " + circle.area());
        System.out.println("Area of triangle: " + triangle.area());
        System.out.println("Area of rectangle: " + rectangle.area());


    }
}
