import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        var sc =  new Scanner(System.in);
        System.out.println("Ingrese un numero entero ");
        var numero = sc.nextInt();
        var digito = numero_dijitos(numero);
        System.out.println("el numero tiene: " + digito + " cifras");
    }

    public static int numero_dijitos(int numero){
        var cifras = 0;

        while(numero != 0){
            numero /= 10;
            cifras++; 
        }
        return cifras;
    }

}
