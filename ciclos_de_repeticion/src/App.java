public class App {
    public static void main(String[] args) throws Exception {
        //System.out.println("Hello, World!");

        // CICLO FOR
        for (int i = 0; i < 100; i += 20){
            System.out.println(i);
        }


        //CICLO WHILE
        int num = 0;
        while(num < 100){
            System.out.println(num);
            num += 10;
        }

        //CICLO DO WHILE
        int num2 = 0;
        do {
            System.out.println(num2);
            num2 += 3;
        }while(num2 < 100);

        //operadores de incremento
        int a = 1;
        System.out.println(a);
        System.out.println(++a); //refleja de inmediato el incremento 
        System.out.println(a);
        System.out.println(a++); // refleja despues de una linea
        System.out.println(a);

        //OPERADOES LOGICOS

        if ((5 == 5) || (5 < 4)){
            System.out.println("correcto1");
        }
        //&& representan un and
        if ((5 < 4) && (5 > 4)){
            System.out.println("correcto2");
        }

    }
}
