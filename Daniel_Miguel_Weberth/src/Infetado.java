import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Infetado {
	  // =======================================================
    // ===================== ATRIBUTOS =======================
    // =======================================================
	private Date dataInfecao;
	private String Idade;
	private List<Sintomas> sintomas = new ArrayList<Sintomas>();
	

    // =======================================================
    // ============ ACESSORES e MODIFICADORES ===============
    // =======================================================
public Date getDataInfecao() {
		return dataInfecao;
	}
	public void setDataInfecao(Date dataInfecao) {
		this.dataInfecao = dataInfecao;
	}
	public String getIdade() {
		return Idade;
	}
	public void setIdade(String idade) {
		Idade = idade;
	}
	public List<Sintomas> getSintomas() {
		return sintomas;
	}
	public void setSintomas(List<Sintomas> sintomas) {
		this.sintomas = sintomas;
	}
	


    // =======================================================
    // =================== CONSTRUTORES =====================
    // =======================================================

  
   
    // CONSTRUTOR DEFAULT
	public Infetado() {
		
	}
   

    // CONSTRUTOR COM PARÂMETROS
public Infetado(Date dataInfecao, String idade, List<Sintomas> sintomas) {
		super();
		this.dataInfecao = dataInfecao;
		Idade = idade;
		this.sintomas = sintomas;
	}

	



    // =======================================================
    // =================== .COMPORTAMENTOS ==================
    // =======================================================




    // =======================================================
    // ============== MÉTODOS COMPLEMENTARES ==============
    // =======================================================

    // ----> toString()
@Override
public String toString() {
	return "Infetado [dataInfecao=" + dataInfecao + ", Idade=" + Idade + "]";
}


    // ----> equals()

}
