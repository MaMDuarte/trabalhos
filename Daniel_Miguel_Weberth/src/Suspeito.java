import java.util.Date;

public class Suspeito {
	// =======================================================
	// ===================== ATRIBUTOS =======================
	// =======================================================
	private Date periodaContagio;

	// =======================================================
	// ============ ACESSORES e MODIFICADORES ===============
	// =======================================================
	public Date getPeriodaContagio() {
		return periodaContagio;
	}

	public void setPeriodaContagio(Date periodaContagio) {
		this.periodaContagio = periodaContagio;
	}
	// =======================================================
	// =================== CONSTRUTORES =====================
	// =======================================================

	// CONSTRUTOR DEFAULT
	public Suspeito() {

	}

	// CONSTRUTOR COM PARÂMETROS
	public Suspeito(Date periodaContagio) {
		super();
		this.periodaContagio = periodaContagio;
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
