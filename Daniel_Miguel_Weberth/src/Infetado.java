import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Infetado {
	// =======================================================
	// ===================== ATRIBUTOS =======================
	// =======================================================
	private Date dataInfecao;
	private String condicao;
	private List<String> sintomas = new ArrayList<String>();

	// =======================================================
	// ============ ACESSORES e MODIFICADORES ===============
	// =======================================================
	public Date getDataInfecao() {
		return dataInfecao;
	}

	public void setDataInfecao(Date dataInfecao) {
		this.dataInfecao = dataInfecao;
	}

	public String getCondicao() {
		return condicao;
	}

	public void setIdade(String condicao) {
		this.condicao = condicao;
	}

	public List<String> getSintomas() {
		return sintomas;
	}

	public void setSintomas(List<String> sintomas) {
		this.sintomas = sintomas;
	}

	// =======================================================
	// =================== CONSTRUTORES =====================
	// =======================================================

	// CONSTRUTOR DEFAULT
	public Infetado() {

	}

	// CONSTRUTOR COM PARÂMETROS
	public Infetado(Date dataInfecao, String condicao, List<String> sintomas) {
		super();
		this.dataInfecao = dataInfecao;
		this.condicao = condicao;
		this.sintomas = sintomas;
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
