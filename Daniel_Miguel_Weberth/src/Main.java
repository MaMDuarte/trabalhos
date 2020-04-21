
public class Main {

	public static void main(String[] args) {
		Pessoa pessoa1 = new Pessoa("Pessoa1",22,"Localidade");
        Pessoa pessoa2 = new Pessoa("Pessoa2",32,"Localidade");
        Pessoa pessoa3 = new Pessoa("Pessoa3",42,"Localidade");
        Pessoa pessoa4 = new Pessoa("Pessoa4",62,"Localidade");
        Pessoa pessoa5 = new Pessoa("Pessoa5",25,"Localidade");
        
        
        
        Suspeito listaSuspeitos = new Suspeito();
        Infetado listaInfetados = new Infetado();
        Recuperado listaRecuperados = new Recuperado();
        Falecido listaFalecidos = new Falecido();
        
        listaSuspeitos.addPessoa(pessoa1);
        listaInfetados.addPessoa(pessoa2);
        listaRecuperados.addPessoa(pessoa3);
        listaFalecidos.addPessoa(pessoa4);
        listaSuspeitos.addPessoa(pessoa5);
        
        System.out.println("Lista de Suspeitos: ");
        listaSuspeitos.imprimirLista();
        
        System.out.println("Lista de Infetados: ");
        listaInfetados.imprimirLista();
        
        System.out.println("Lista de Recuperados: ");
        listaRecuperados.imprimirLista();
    
        System.out.println("Lista de Falecidos: ");
        listaFalecidos.imprimirLista();
        
    
        System.out.println("-------------------------");
        listaSuspeitos.moveTo(listaInfetados, pessoa5);
    
        System.out.println("Lista de Suspeitos: ");
        listaSuspeitos.imprimirLista();
    
        System.out.println("Lista de Infetados: ");
        listaInfetados.imprimirLista();

		
	}

}
