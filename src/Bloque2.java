import java.util.Scanner;

public class Bloque2 { 
	public static double factorial(int numero) {
        double factorial = 1;
        for (int i = 1; i <= numero; i++) {
            factorial = factorial * i;
        }
        return factorial;
    }
	
	public static boolean esPrimo(int numero) {
		  // El 0, 1 y 4 no son primos
		  if (numero == 0 || numero == 1 || numero == 4) {
		    return false;
		  }
		  for (int x = 2; x < numero / 2; x++) {
		    // Si es divisible por cualquiera de estos números, no es primo
		    if (numero % x == 0)
		      return false;
		  }
		  // Si no se pudo dividir por ninguno de los de arriba, sí es primo
		  return true;
		}
}
