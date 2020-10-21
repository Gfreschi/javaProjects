
public class Categoria {

	private int codigo;
	private String descricao;
	private int popularidade;
	
	void cadastrar(int codigo, String descricao, int popularidade) {
		this.codigo = codigo;
		this.descricao = descricao;
		this.popularidade = popularidade;
	}
	
	String mostrar() {
		return "Codigo: " + this.codigo + " | Descricao: " + this.descricao + " | Popularidade: " + this.popularidade;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public int getPopularidade() {
		return popularidade;
	}

	public void setPopularidade(int popularidade) {
		this.popularidade = popularidade;
	}
	
	
}
