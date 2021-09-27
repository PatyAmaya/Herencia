package edu.uaslp.parcial2;

import edu.uaslp.parcial2.animal.*;
import edu.uaslp.parcial2.animal.mammal.*;
import edu.uaslp.parcial2.animal.oviparous.*;



public class Main {
    public static void main(String[] args){

        Animal animal = new Animal();
        Bird bird = new Bird();
        Dog dog = new Dog();


        animal.setColor("Rojo");
        animal.setSize(20);
        animal.setNumeroDePatas(4);
        animal.eat();

        bird.setColor("VERDE");
        bird.setSize(25);
        bird.setNumeroDePatas(2);
        bird.walk();
        bird.eat();

        dog.setColor("CAFE");
        dog.setSize(10);
        dog.setNumeroDePatas(4);
        dog.walk();
        dog.eat();

    }
}
