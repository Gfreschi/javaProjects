
public class Clientes {
	
	private int registro;
	private String nome;
	private String telefone;
	
	void cadastrar(int registro, String nome, String telefone) {
		this.registro = registro;
		this.nome = nome;
		this.telefone = telefone;
	}
	
	String mostrar(){
		return "Registro: " + this.registro + " | Nome: " + this.nome + " |  Telefone: " + this.telefone;
	}

	public int getRegistro() {
		return registro;
	}

	public void setRegistro(int registro) {
		this.registro = registro;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	
	
	

}
