import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		Biblioteca biblioteca = new Biblioteca();
		Scanner input = new Scanner(System.in);



		System.out.println("quanti libri vuoi inserire?");
		int n =input.nextInt();

		for(int i = 0; i < n; i++) {

			Libro libro = new Libro();

			System.out.println("inserisci il codice del libro");
			libro.setCodice(i+1);

			System.out.println("inserisci il nome del libro");
			libro.setNome("libro" + (i+1));

			biblioteca.setLibro(libro);

		}


		biblioteca.getList();

		biblioteca.saveList();
		biblioteca.chargeList();

		input.close();

		System.out.println("I libri salvati su file sono: \n");
		biblioteca.getList();



	}

}
