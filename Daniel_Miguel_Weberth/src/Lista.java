import java.util.ArrayList;
import java.util.List;

public abstract class Lista {
    // =======================================================
    // ===================== ATRIBUTOS =======================
    // =======================================================
	
	private List<Pessoa> lista = new ArrayList<Pessoa>();

	
	
    // =======================================================
    // ============ ACESSORES e MODIFICADORES ===============
    // =======================================================

	public List<Pessoa> getLista() {
		return lista;
	}
	public void setLista(List<Pessoa> listaSuspeitos) {
		this.lista = listaSuspeitos;
	}
	
	public void addPessoa(Pessoa pessoa) {
		this.lista.add(pessoa);
		
	}
	
	public void removePessoa(Pessoa pessoa) {
		this.lista.remove(pessoa);
	}
	

    // =======================================================
    // =================== CONSTRUTORES =====================
    // =======================================================

  
   
    // CONSTRUTOR DEFAULT

	public Lista() {
		
	}
	
	

    // CONSTRUTOR COM PARÂMETROS

	public Lista(List<Pessoa> lista) {
		super();
		this.lista = lista;
	}

    // =======================================================
    // =================== .COMPORTAMENTOS ==================
    // =======================================================
	public void moveTo(Lista lista, Pessoa pessoa) {
        this.removePessoa(pessoa);
        lista.addPessoa(pessoa);
    }
    
    
    public void imprimirLista() {
        for (Pessoa pessoa : this.lista) {
            System.out.println(pessoa.getNome() + " | " + pessoa.getIdade()+ " | " + pessoa.getLocalidade());
        }
        System.out.println();
    }
	



    // =======================================================
    // ============== MÉTODOS COMPLEMENTARES ==============
    // =======================================================

    // ----> toString()
	@Override
	public String toString() {
		return "Lista [lista=" + lista + "]";
	}
	
    // ----> equals()
}
