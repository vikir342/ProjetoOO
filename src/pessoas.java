
public class pessoas {
	String nomeAt;
	String documentoAt;
	float rendaAt;
	
	
	//CONSTRUTOR 1
	public pessoas() {
		
	}
	
	//CONSTRUTOR 2
	public pessoas(String nomePar, String documentoPar, float rendaPar) {
		this.nomeAt = nomePar;
		this.documentoAt = documentoPar;
		this.rendaAt = rendaPar;
	}
	
	//SETTERS ALTERAR DADOS
	public void alterarNome(String nomePar) {
		this.nomeAt = nomePar;
	}
	public void alterarDocumento(String documentoPar) {
		this.nomeAt = documentoPar;
	}
	public void alterarRenda(String rendaPar) {
		this.nomeAt = rendaPar;
	}
}
