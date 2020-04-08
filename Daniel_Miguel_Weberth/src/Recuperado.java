import java.util.Date;

public class Recuperado {
	  // =======================================================
    // ===================== ATRIBUTOS =======================
    // =======================================================
	private Date dataRecuperação;

	
	

    // =======================================================
    // ============ ACESSORES e MODIFICADORES ===============
    // =======================================================
public Date getDataRecuperação() {
		return dataRecuperação;
	}

	public void setDataRecuperação(Date dataRecuperação) {
		this.dataRecuperação = dataRecuperação;
	}

	


    // =======================================================
    // =================== CONSTRUTORES =====================
    // =======================================================

  
   
    // CONSTRUTOR DEFAULT
	public Recuperado(){
		
	}
   

    // CONSTRUTOR COM PARÂMETROS

public Recuperado(Date dataRecuperação) {
		super();
		this.dataRecuperação = dataRecuperação;
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
