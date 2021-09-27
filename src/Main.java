
import animal.*;
import animal.Oviparous.*;
import animal.mammal.Dog;
import animal.oviparous.Bird;
import animal.oviparous.Duck;


public class Main {
    public static void main(String[] args){

        Animal animal = new Animal();
        Bird bird = new Bird();
        Dog dog = new Dog();


        animal.setColor("Rojo");
        animal.setTamaño(20);
        animal.setNumeroDePatas(4);
        animal.eat();

        bird.setColor("VERDE");
        bird.setTamaño(25);
        bird.setNumeroDePatas(2);
        bird.walk();
        bird.eat();

        dog.setColor("CAFE");
        dog.setTamaño(10);
        dog.setNumeroDePatas(4);
        dog.walk();
        dog.eat();

    }
}
