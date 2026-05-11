import java.util.Scanner;

public class ManejoErrores {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {

            System.out.print("Ingrese un número: ");

            int numero = sc.nextInt();

            System.out.println("Número ingresado: " + numero);

        } catch (Exception e) {

            System.out.println("Error: Debe ingresar un número válido.");

        }
    }
}