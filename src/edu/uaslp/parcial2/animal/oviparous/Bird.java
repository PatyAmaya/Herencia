package edu.uaslp.parcial2.animal.oviparous;

import edu.uaslp.parcial2.animal.Animal;

public class Bird extends Animal
{
    public void volar(){
        System.out.println("Mueve alas");
        System.out.println("Encoge patitas");
        System.out.println("Se eleva");
    }


    public void walk(){
        System.out.println("Da saltitos");
    }
}