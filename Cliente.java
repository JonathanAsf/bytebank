package bytebank_composto;

public class Cliente {
	private String nome;
	private String cpf;
	private String profissao;
	
	//Métodos para o nome
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getNome() {
		return nome;
	}
	
	//Métodos para o CPF
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getCpf() {
		return cpf;
	}
	
	public void setProfissao(String profissao) {
		this.profissao = profissao;
	}
	public String getProfissao() {
		return profissao;
	}
	
}
