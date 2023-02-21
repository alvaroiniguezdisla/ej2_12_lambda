package aplicacion;
import java.util.Scanner;
import dominio.ej2_12_lambda;
public class Principal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un número: ");
        int n = sc.nextInt();
        System.out.println("El número de Fibonacci de " + n + " es: " + ej2_12_lambda.fibonacci(n));
    }
}
