class Animal
{
    private String color;
    private int tamaño;
    private int numeroDePatas;

    public void comer(){

        System.out.println("El animal de color "+color+", tamaño "+tamaño+", y numero de patas "+numeroDePatas+" está comiendo");
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

    public int getTamaño() {
        return tamaño;
    }

    public void setTamaño(int tamaño) {
        this.tamaño = tamaño;
    }

    public int getNumeroDePatas() {
        return numeroDePatas;
    }

    public void setNumeroDePatas(int numeroDePatas) {
        this.numeroDePatas = numeroDePatas;
    }
}
