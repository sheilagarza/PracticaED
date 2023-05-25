import java.util.Scanner;

public class Bloque2 { }

class FactorialNumero {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		int numero;
        double factorial = 1;
		
        //Pedir que introduzca un número mayor o igual a 0
        do { 
            System.out.print("Introduce un numero entero (tiene que ser mayor o igual a 0): ");
            numero = teclado.nextInt();
        } while (numero < 0);

        //multiplicar todos los números desde 1 hasta n
        //el resultado de las multiplicaciones se acumula en la variable factorial
        for (int i = 1; i <= numero; i++) {
            factorial = factorial * i;
        }
		
        //Mostrar el resultado
        System.out.printf("%d! = %.0f %n", numero, factorial);                                                         
    }
}
