import java.util.Scanner;
import java.math.*;
public class App {
    public static void main(String[] args) throws Exception {

        var sc =  new Scanner(System.in);
        System.out.println("Ingrese un numero entero ");
        var numero = sc.nextInt();
        var doble = (numero * 2);
        var triple = (numero * 3);
        System.out.println("el doble del numero " + numero + " es " + doble);
        System.out.println("el triple del numero " + numero + " es " + triple);
    }

}
