package nespresso;

import java.util.Scanner;

public class Ejecutable {

    public static void main(String[] args) {

        Cafetera caf = new Cafetera(1000);
        Scanner acc = new Scanner(System.in);

        String acciones;
        System.out.println("Que accion desea realizar?");
        System.out.println("Para llenar la cafetera ingrese la palabra (llenar)");
        System.out.println("Parala vaciar cafetera ingrese la palabra (vaciar)");
        System.out.println("Para servir cafe en una taza ingrese la palabra (sevir) y luego la cantidad que desea servir en cc");
        System.out.println("Para agregar cafe a la cafetera ingrese la palabra (agregar)y luego la cantidad que desea agregar en cc");

        //Scanner acc = new Scanner (System.in); 
        acciones = acc.next();

        switch (acciones) {
            case "llenar":
                caf.llenarCafetera();
                break;
            case "vaciar":
                caf.vaciarCafetera();
                break;
            case "servir":
                Scanner taza = new Scanner(System.in);
                System.out.println("Ingrese la cantidad que desea servir en cc");

                int cantServir;
                cantServir = taza.nextInt();

                caf.servirTaza(cantServir); 
                break;

            case "agregar":
                Scanner tazas = new Scanner(System.in);
                System.out.println("Ingrese la cantidad que desea agregar en cc");

                int cantAgregar;
                cantAgregar = tazas.nextInt();

                caf.agregarCafe(cantAgregar);

        }/*
        System.out.println("Desea realizar otra accion?");
        Scanner resp = new Scanner(System.in);
        
        
        if ((resp.next()).equals("si")) {
             System.out.println("Para llenar la cafetera ingrese la palabra (llenar)");
        System.out.println("Parala vaciar cafetera ingrese la palabra (vaciar)");
        System.out.println("Para servir cafe en una taza ingrese la palabra (sevir) y luego la cantidad que desea servir en cc");
        System.out.println("Para agregar cafe a la cafetera ingrese la palabra (agregar)y luego la cantidad que desea agregar en cc");


            switch (acciones) {
                case "llenar":
                    caf.llenarCafetera();
                    break;
                case "vaciar":
                    caf.vaciarCafetera();
                    break;
                case "servir":
                    Scanner taza = new Scanner(System.in);
                    System.out.println("Ingrese la cantidad que desea servir en cc");

                    int cantServir;
                    cantServir = taza.nextInt();

                    caf.servirTaza(cantServir);
                    break;

                case "agregar":
                    Scanner tazas = new Scanner(System.in);
                    System.out.println("Ingrese la cantidad que desea servir en cc");

                    int cantAgregar;
                    cantAgregar = tazas.nextInt();

                    caf.agregarCafe(cantAgregar);

            }
        }else{
            //.exit(0);
        }*/

    }

}
