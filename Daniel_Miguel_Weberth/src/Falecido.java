import java.util.Date;

public class Falecido {
	// =======================================================
	// ===================== ATRIBUTOS =======================
	// =======================================================
	private Date dataFalecimento;

	// =======================================================
	// ============ ACESSORES e MODIFICADORES ===============
	// =======================================================
	public Date getDataFalecimento() {
		return dataFalecimento;
	}

	public void setDataFalecimento(Date dataFalecimento) {
		this.dataFalecimento = dataFalecimento;
	}

	// =======================================================
	// =================== CONSTRUTORES =====================
	// =======================================================

	// CONSTRUTOR DEFAULT
	public Falecido() {

	}

	// CONSTRUTOR COM PAR�METROS
	public Falecido(Date dataFalecimento) {
		super();
		this.dataFalecimento = dataFalecimento;
	}

	// =======================================================
	// =================== .COMPORTAMENTOS ==================
	// =======================================================

	// =======================================================
	// ============== M�TODOS COMPLEMENTARES ==============
	// =======================================================

	// ----> toString()

	// ----> equals()

}
