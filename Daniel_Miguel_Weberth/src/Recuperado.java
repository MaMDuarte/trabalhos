import java.util.ArrayList;
import java.util.List;

public class Recuperado {
	  // =======================================================
    // ===================== ATRIBUTOS =======================
    // =======================================================
	private List<Pessoa> recuperados = new ArrayList<Pessoa>();

	
	

    // =======================================================
    // ============ ACESSORES e MODIFICADORES ===============
    // =======================================================

	public List<Pessoa> getRecuperados() {
		return recuperados;
	}

	public void setSuspeitos(List<Pessoa> recuperado) {
		this.recuperados = recuperado;
	}

	public void addRecuperado(Pessoa recuperado) {
		this.recuperados.add(recuperado);
	}

	public void removeRecuperado(Pessoa recuperado) {
		this.recuperados.remove(recuperado);
	}
	


    // =======================================================
    // =================== CONSTRUTORES =====================
    // =======================================================

  
   
    // CONSTRUTOR DEFAULT
	public Recuperado(){
		
	}
   

    // CONSTRUTOR COM PARÂMETROS

	public Recuperado(List<Pessoa> recuperados) {
		super();
		this.recuperados = recuperados;
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
