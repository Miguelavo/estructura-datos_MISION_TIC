import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
       // System.out.println("Hello, World!");
        Scanner sc = new Scanner(System.in);
        System.out.println("escriba su nombre: ");
        String nom = sc.nextLine();
        
        //condiconal con if
        if (nom.equals("miguel")){
            System.out.println("primero");
        } else if (nom.equals("angel")){
            System.out.println("segundo");
        }else {
            System.out.println("no es su nombre");
        }

        //condiconal con switch
        Scanner sn = new Scanner(System.in);
        System.out.println("escriba una letra: ");
        String letra = sn.nextLine();

        switch (letra){
            case "a":
            System.out.println("letra  a");
            break;
            case "b":
            System.out.println("letra b");
            break;
            case "c":
            System.out.println("letra c");
            break;
            default:
            System.out.println("ninguno de las letras corresponde");
        }
    
    }
}
