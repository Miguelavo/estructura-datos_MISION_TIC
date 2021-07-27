import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        var sc =  new Scanner(System.in);
        System.out.println("Ingrese el valor de la temperatura en grado centigrados ");
        var tem_celcius = sc.nextInt();
        var far = temperatura(tem_celcius);
        System.out.println("el valor en f es: " + far);
    }

    public static float temperatura(float tem_celcius){
        var f = (32 +(9 + tem_celcius/5));
        return f;
    }
}
