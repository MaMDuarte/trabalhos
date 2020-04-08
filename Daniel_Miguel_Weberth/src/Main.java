

public class Main {

	public static void main(String[] args) {
		Pessoa pessoa1 = new Pessoa();
		pessoa1.setNome("Pessoa1");
		pessoa1.setLocalidade("Localidade");
		pessoa1.setIdade(24);
		
		Pessoa pessoa2 = new Pessoa();
		pessoa2.setNome("Pessoa2");
		pessoa2.setLocalidade("Localidade");
		pessoa2.setIdade(22);
		
		Pessoa pessoa3 = new Pessoa();
		pessoa2.setNome("Pessoa3");
		pessoa2.setLocalidade("Localidade");
		pessoa2.setIdade(28);
		
		Suspeito listaSuspeitos = new Suspeito();
		listaSuspeitos.addSuspeito(pessoa1);
		listaSuspeitos.addSuspeito(pessoa2);
		
		Infetado listaInfetados = new Infetado();
		listaInfetados.addInfetado(pessoa3);

	}

}
