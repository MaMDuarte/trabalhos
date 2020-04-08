import java.util.ArrayList;
import java.util.List;

public class Lista {
    // =======================================================
    // ===================== ATRIBUTOS =======================
    // =======================================================
	
	private List<Suspeito> listaSuspeitos = new ArrayList<Suspeito>();
	private List<Infetado> listaInfetados = new ArrayList<Infetado>();
	private List<Recuperado> listaRecuperados = new ArrayList<Recuperado>();
	private List<Falecido> listaFalecidos= new ArrayList<Falecido>();
	
	
    // =======================================================
    // ============ ACESSORES e MODIFICADORES ===============
    // =======================================================

	public List<Suspeito> getListaSuspeitos() {
		return listaSuspeitos;
	}
	public void setListaSuspeitos(List<Suspeito> listaSuspeitos) {
		this.listaSuspeitos = listaSuspeitos;
	}
	
	public void addSuspeito(Suspeito suspeito) {
		this.listaSuspeitos.add(suspeito);
	}
	
	public void removeSuspeito(Suspeito suspeito) {
		this.listaSuspeitos.remove(suspeito);
	}
	
	public List<Infetado> getListaInfetados() {
		return listaInfetados;
	}
	public void setListaInfetados(List<Infetado> listaInfetados) {
		this.listaInfetados = listaInfetados;
	}
	
	public void addInfetado(Infetado infetado) {
		this.listaInfetados.add(infetado);
	}
	
	public void removeInfetado(Infetado infetado) {
		this.listaInfetados.remove(infetado);
	}
	
	public List<Recuperado> getListaRecuperados() {
		return listaRecuperados;
	}
	public void setListaRecuperados(List<Recuperado> listaRecuperados) {
		this.listaRecuperados = listaRecuperados;
	}
	
	public void addRecuperado(Recuperado recuperado) {
		this.listaRecuperados.add(recuperado);
	}
	
	public void removeRecuperado(Recuperado recuperado) {
		this.listaRecuperados.remove(recuperado);
	}
	
	public List<Falecido> getListaFalecidos() {
		return listaFalecidos;
	}
	public void setListaFalecidos(List<Falecido> listaFalecidos) {
		this.listaFalecidos = listaFalecidos;
	}
	
	public void addFalecido(Falecido falecido) {
		this.listaFalecidos.add(falecido);
	}
	
	public void removeFalecido(Falecido falecido) {
		this.listaFalecidos.remove(falecido);
	}
	

    // =======================================================
    // =================== CONSTRUTORES =====================
    // =======================================================

  
   
    // CONSTRUTOR DEFAULT

	public Lista() {
		
	}

    // CONSTRUTOR COM PARÂMETROS

	public Lista(List<Suspeito> listaSuspeitos, List<Infetado> listaInfetados, List<Recuperado> listaRecuperados,
			List<Falecido> listaFalecidos) {
		super();
		this.listaSuspeitos = listaSuspeitos;
		this.listaInfetados = listaInfetados;
		this.listaRecuperados = listaRecuperados;
		this.listaFalecidos = listaFalecidos;
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
