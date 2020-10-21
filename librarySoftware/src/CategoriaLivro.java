public class CategoriaLivro {
	
	private Livro livro;
	private Categoria categoria;
	
	public CategoriaLivro(Categoria categoria, Livro livro) {
		this.livro = livro;
		this.categoria = categoria;
	}

	public Livro getLivro() {
		return livro;
	}

	public void setLivro(Livro livro) {
		this.livro = livro;
	}

	public Categoria getCategoria() {
		return categoria;
	}

	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}
	
	
}