import java.util.ArrayList;
import java.util.List;

public class Falecido {
	// =======================================================
	// ===================== ATRIBUTOS =======================
	// =======================================================

	private List<Pessoa> falecidos = new ArrayList<Pessoa>();

	// =======================================================
	// ============ ACESSORES e MODIFICADORES ===============
	// =======================================================

	public List<Pessoa> getFalecidos() {
		return falecidos;
	}

	public void setFalecidos(List<Pessoa> falecido) {
		this.falecidos = falecido;
	}

	public void addFalecido(Pessoa falecido) {
		this.falecidos.add(falecido);
	}

	public void removeRecuperado(Pessoa falecido) {
		this.falecidos.remove(falecido);
	}

	// =======================================================
	// =================== CONSTRUTORES =====================
	// =======================================================

	// CONSTRUTOR DEFAULT
	public Falecido() {

	}

	// CONSTRUTOR COM PARÂMETROS

	public Falecido(List<Pessoa> falecidos) {
		super();
		this.falecidos = falecidos;
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
