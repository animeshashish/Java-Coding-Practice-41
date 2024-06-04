public class Main {
    public static void main(String[] args) {
        // Animal class object
        Animal myAnimal = new Animal();
        Animal myDog = new Dog();
        Animal myCat = new Cat();

        myAnimal.makeSound();
        myDog.makeSound();
        myCat.makeSound();

        // Area of circle
        Circle areaOfCircle = new Circle();
        areaOfCircle.calculateArea();

        // Area of rectangle
        Rectangle areaOfRectangle = new Rectangle();
        areaOfRectangle.calculateArea();

    }
}