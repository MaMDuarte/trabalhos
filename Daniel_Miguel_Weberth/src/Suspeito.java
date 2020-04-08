import java.util.ArrayList;
import java.util.List;

public class Suspeito {
	// =======================================================
	// ===================== ATRIBUTOS =======================
	// =======================================================
	private List<Pessoa> suspeitos = new ArrayList<Pessoa>();

	// =======================================================
	// ============ ACESSORES e MODIFICADORES ===============
	// =======================================================

	

	public List<Pessoa> getSuspeitos() {
		return suspeitos;
	}

	public void setSuspeitos(List<Pessoa> suspeitos) {
		this.suspeitos = suspeitos;
	}

	public void addSuspeito(Pessoa suspeito) {
		this.suspeitos.add(suspeito);
	}

	public void removeSuspeito(Pessoa suspeito) {
		this.suspeitos.remove(suspeito);
	}
	// =======================================================
	// =================== CONSTRUTORES =====================
	// =======================================================

	// CONSTRUTOR DEFAULT
	public Suspeito() {

	}

	// CONSTRUTOR COM PARÂMETROS

	public Suspeito(List<Pessoa> suspeitos) {
		super();
		this.suspeitos = suspeitos;
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
