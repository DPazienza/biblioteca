import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;


public class Biblioteca implements Serializable{

	private static final long serialVersionUID = 1L;
	private ArrayList<Libro> scaffale = new ArrayList<Libro>();



	public void setLibro(Libro libro) {

		scaffale.add(libro);
	}
	
	public void getLibro(int i) {
		System.out.println(scaffale.get(i));
	}



	public void getList(){

		System.out.println("numero libri :" + scaffale.size() + "\n");

		for(int i = 0; i < scaffale.size(); i++ ) {
			System.out.println(scaffale.get(i));
		}
	}


	public void saveList() throws IOException {
		FileOutputStream file = new FileOutputStream(new File("Biblioteca.ser"));
		ObjectOutputStream out = new ObjectOutputStream(file);
		out.writeObject(scaffale);
		out.close();
		file.close();

	}


	@SuppressWarnings("unchecked")
	public void chargeList() throws ClassNotFoundException, IOException {
		scaffale = new ArrayList<Libro>();
		FileInputStream file = new FileInputStream(new File("Biblioteca.ser"));
		ObjectInputStream in = new ObjectInputStream(file);
		ArrayList<Libro> temp = new ArrayList<Libro>();
		temp = (ArrayList<Libro>) in.readObject();
		in.close();
		file.close();
		System.out.println(temp.size());
		for(int i = 0; i <temp.size(); i++) {
			this.scaffale.add(i, temp.get(i));

		}








	}
}

