import java.awt.*;


public class Main {
    public static void main(String[] args){

        Animal animal = new Animal();
        Ave ave = new Ave();
        Perro perro = new Perro();

        animal.setColor("Rojo");
        animal.setTamaño(20);
        animal.setNumeroDePatas(4);
        animal.comer();

        ave.setColor("VERDE");
        ave.setTamaño(25);
        ave.setNumeroDePatas(2);
        ave.caminar();
        ave.comer();

        perro.setColor("CAFE");
        perro.setTamaño(10);
        perro.setNumeroDePatas(4);
        perro.caminar();
        perro.comer();

    }
}
