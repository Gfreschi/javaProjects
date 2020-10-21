
public class Filme {
	private int codigo;
	private String titulo;
	private int duracao;
	
	
	void cadastrar(int codigo, String titulo, int duracao) {
		this.codigo = codigo;
		this.titulo = titulo;
		this.duracao = duracao;
	}
	
	String mostrar() { 
		return "Codigo: " + this.codigo + " | Titulo: " + this.titulo + " | Duracao: " + this.duracao;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public int getDuracao() {
		return duracao;
	}

	public void setDuracao(int duracao) {
		this.duracao = duracao;
	}

}
