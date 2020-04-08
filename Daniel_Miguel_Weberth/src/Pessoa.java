
public class Pessoa {
	// =======================================================
	// ===================== ATRIBUTOS =======================
	// =======================================================
	private String Nome;
	private String Idade;
	private String Localidade;

	// =======================================================
	// ============ ACESSORES e MODIFICADORES ===============
	// =======================================================
	public String getNome() {
		return Nome;
	}

	public void setNome(String nome) {
		Nome = nome;
	}

	public String getIdade() {
		return Idade;
	}

	public void setIdade(String idade) {
		Idade = idade;
	}

	public String getLocalidade() {
		return Localidade;
	}

	public void setLocalidade(String localidade) {
		Localidade = localidade;
	}

	// =======================================================
	// =================== CONSTRUTORES =====================
	// =======================================================

	// CONSTRUTOR DEFAULT
	public Pessoa() {

	}

	// CONSTRUTOR COM PARÂMETROS
	public Pessoa(String nome, String idade, String localidade) {
		super();
		Nome = nome;
		Idade = idade;
		Localidade = localidade;
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
