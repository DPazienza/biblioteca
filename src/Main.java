import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		Biblioteca biblioteca = new Biblioteca();
		Scanner input = new Scanner(System.in);
		Libro libro = new Libro();
		
		
		System.out.println("quanti libri vuoi inserire?");
		int n =input.nextInt();
		
		for(int i = 0; i < n; i++) {
			
			System.out.println("inserisci il codice del libro");
			libro.setCodice(input.nextInt());
			
			System.out.println("inserisci il nome del libro");
			libro.setNome(input.next());
			
			biblioteca.setLibro(libro);
			System.out.println("stampa libro" + libro);
			System.out.println("stampa di prova della biblioteca n."+ i+1 + "\n");
			biblioteca.getList();
			
			
			
		}
		biblioteca.saveList();
		biblioteca.chargeList();
		
		input.close();
		
		System.out.println("I libri salvati su file sono: \n");
		biblioteca.getList();
	
	

	}

}
