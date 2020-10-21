
public class Livro {
	
	private int codigo;
	private String titulo;
	private int paginas;
	
	void cadastrar(int codigo, String titulo, int paginas) {
		this.codigo = codigo;
		this.titulo = titulo;
		this.paginas = paginas;
	}

	String mostrar() { 
		return "Codigo: " + this.codigo + " | Titulo: " + this.titulo + " | Páginas: " + this.paginas;
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

	public int getPaginas() {
		return paginas;
	}

	public void setPaginas(int paginas) {
		this.paginas = paginas;
	}
	
	
}
