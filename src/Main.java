
import java.util.Scanner;

        public class Main {
            public Main() {
            }

            public static void main(String[] args) {
                Scanner leer = new Scanner(System.in);
                System.out.println("xd");
                System.out.print("hola compañero o compañera ingrese un numero para poder saber si es par o no par ingrese su numero ");
                int n = leer.nextInt();
                if (n % 2 == 0) {
                    System.out.printf("si el numero %d es PAR\n", n);
                } else {
                    System.out.printf("si el numero %d es IMPAR\n", n);
                }

            }
        }

    }
}