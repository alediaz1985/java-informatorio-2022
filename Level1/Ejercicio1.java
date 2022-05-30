import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        System.out.println("Ingrese su Nombre");
        Scanner intro = new Scanner(System.in);
        String nombre = intro.nextLine();
        System.out.println("HOLA " + nombre + "!!!");
    }
}