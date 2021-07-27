import java.awt.*;
import java.io.BufferedReader;
import java.util.Scanner;
import java.io.InputStreamReader;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        //funcion para imprimir 
        System.out.println("miguel \nagnel");

        //funcion para leer por teclado
        Scanner sc = new Scanner(System.in);
        System.out.println("Por favor ingrese su nombre");
        String nombre = sc.nextLine();
        System.out.println(nombre);

        //otra funcion para leer por teclado
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Por favor ingrese su nombre2");
        String nombre2 = br.readLine();
        System.out.println(nombre2);
        

    }
}

