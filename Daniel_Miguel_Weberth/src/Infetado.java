import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Infetado {
	  // =======================================================
    // ===================== ATRIBUTOS =======================
    // =======================================================
	private List<Pessoa> infetados = new ArrayList<Pessoa>();
	

    // =======================================================
    // ============ ACESSORES e MODIFICADORES ===============
    // =======================================================
	public List<Pessoa> getInfetados() {
		return infetados;
	}

	public void setInfetados(List<Pessoa> infetados) {
		this.infetados = infetados;
	}

	public void addInfetado(Pessoa infetados) {
		this.infetados.add(infetados);
	}

	public void removeInfetado(Pessoa infetado) {
		this.infetados.remove(infetado);
	}
    // =======================================================
    // =================== CONSTRUTORES =====================
    // =======================================================

  
   
    // CONSTRUTOR DEFAULT
	public Infetado() {
		
	}
   

    // CONSTRUTOR COM PARÂMETROS


	public Infetado(List<Pessoa> infetados) {
		super();
		this.infetados = infetados;
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
