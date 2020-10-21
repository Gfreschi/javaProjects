
public class ClassificacaoFilme {
	
	private Filme filme;
	private Classificacao classificacao;
	
	public ClassificacaoFilme(Classificacao classificacao, Filme filme) {
		this.filme = filme;
		this.classificacao = classificacao;
	}

	public Filme getFilme() {
		return filme;
	}

	public void setFilme(Filme filme) {
		this.filme = filme;
	}

	public Classificacao getClassificacao() {
		return classificacao;
	}

	public void setClassificacao(Classificacao classificacao) {
		this.classificacao = classificacao;
	}
	
	

}
