
public class Pessoa {
	// =======================================================
	// ===================== ATRIBUTOS =======================
	// =======================================================
	private String nome;
	private int idade;
	private String localidade;

	// =======================================================
	// ============ ACESSORES e MODIFICADORES ===============
	// =======================================================
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String getLocalidade() {
		return localidade;
	}

	public void setLocalidade(String localidade) {
		this.localidade = localidade;
	}

	// =======================================================
	// =================== CONSTRUTORES =====================
	// =======================================================

	// CONSTRUTOR DEFAULT
	public Pessoa() {

	}

	// CONSTRUTOR COM PARÂMETROS
	public Pessoa(String nome, int idade, String localidade) {
		super();
		this.nome = nome;
		this.idade = idade;
		this.localidade = localidade;
	}

	// =======================================================
	// =================== .COMPORTAMENTOS ==================
	// =======================================================

	// =======================================================
	// ============== MÉTODOS COMPLEMENTARES ==============
	// =======================================================

	// ----> toString()

	// ----> equals()

}
