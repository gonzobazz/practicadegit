package nespresso;

public class Cafetera {

    private Integer capacidadMaxima;
    private Integer cantidadActual;

    public Cafetera() {
        this.cantidadActual = 0;
        this.capacidadMaxima = 1000;

    }

    public Cafetera(Integer capacidadMaxima) {
        this.capacidadMaxima = capacidadMaxima;
        this.cantidadActual = capacidadMaxima;

    }

    public Cafetera(Integer capacidadMaxima, Integer cantidadActual) {
        this.capacidadMaxima = capacidadMaxima;
        if (capacidadMaxima < cantidadActual) {
            this.cantidadActual = capacidadMaxima;
        } else {
            this.cantidadActual = cantidadActual;
        }
    }

    public void llenarCafetera() {
        cantidadActual = capacidadMaxima;
        System.out.println("la cafetera esta llena");

    }

    public void servirTaza(int num) {
        if (num > cantidadActual) {
            cantidadActual = 0;

            System.out.println("Cafetera vacia ");
        } else {
            cantidadActual -= num;
            System.out.println("En la cafetera quedan " + cantidadActual + "cc");
        }
    }

    public void vaciarCafetera() {
        cantidadActual = 0;
        System.out.println("Cafetera vacia");
    }

    public void agregarCafe(int num) {
        cantidadActual += num;

        if (cantidadActual > capacidadMaxima) {
            System.out.println("cafetera rebalsada");
            cantidadActual = capacidadMaxima;
        } else {
            System.out.println("La cafetera contiene " + cantidadActual + "cc.");
        }

    }
}
