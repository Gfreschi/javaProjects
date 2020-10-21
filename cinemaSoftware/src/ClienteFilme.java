
public class ClienteFilme {
	
	private Cliente cliente;
	private Filme filme;
	
	public ClienteFilme(Cliente cliente, Filme filme) {
		
		this.cliente = cliente;
		this.filme = filme;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public Filme getFilme() {
		return filme;
	}

	public void setFilme(Filme filme) {
		this.filme = filme;
	}
	
	
}
