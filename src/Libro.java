import java.io.Serializable;

public class Libro implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int codice = 0;
	private String nome;
	private boolean disponibilita = true;


	public Libro() {

	}

	public Libro(int cod,String n)
	{
		nome=n;
		codice = cod;
	}


	public int getCodice() {
		return codice;
	}

	public Libro setCodice(int codice) {
		this.codice = codice;
		return null;
	}

	public boolean isDisponibilita() {
		return disponibilita;
	}

	public void setDisponibilita() {
		disponibilita = false;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String toString(){
		return "Codice : "+getCodice()+"\nNome : "+getNome();
	}

}
