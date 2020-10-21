
public class ClienteLivro {
	
	private Livro livro;
	private Clientes cliente;
	
	public ClienteLivro(Clientes cliente, Livro livro) {
		this.livro = livro;
		this.cliente = cliente;
	}

	public Livro getLivro() {
		return livro;
	}

	public void setLivro(Livro livro) {
		this.livro = livro;
	}

	public Clientes getCliente() {
		return cliente;
	}

	public void setCliente(Clientes cliente) {
		this.cliente = cliente;
	}

	
}
