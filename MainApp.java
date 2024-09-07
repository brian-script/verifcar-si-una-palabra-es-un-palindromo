import java.util.Scanner;

public class MainApp {

	public static void main(String[] args) {

		System.out.println("***VERIFICACION DE PALINDROMOS***\n");

		Scanner teclado = new Scanner(System.in);

		System.out.print("Ingresa una palabra para ver si es un palindromo: ");
		var palabra = teclado.nextLine();
		var palabrareverse = new StringBuilder(palabra).reverse().toString();
		if (palabra.equals(palabrareverse)) {

			System.out.println("La palabra " + palabra + " es un palindromo");

		}else {

			System.out.println("La palabra " + palabra + " no es un palindromo");

		}

	}

}
