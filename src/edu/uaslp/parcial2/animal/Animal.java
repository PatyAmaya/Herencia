package edu.uaslp.parcial2.animal;


public class Animal {
    protected String color;
    protected int size;
    protected int legsNum;

    public void eat(){

        System.out.println("El animal de color "+color+", tamaño "+size+", y numero de patas "+legsNum+" está comiendo");
        System.out.println("Busca comida");
        System.out.println("Atrapa comida");
        System.out.println("Engulle");
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getNumeroDePatas() {
        return legsNum;
    }

    public void setNumeroDePatas(int numeroDePatas) {
        this.legsNum = numeroDePatas;
    }
}
