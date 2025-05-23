
public class ClassePrincipal {

	// Método chamado main
	public static void main(String[] args) {
		
		String nome = "Mikael";
		
		System.out.println(nome); // sysout , CTRL + SPACE
		
		// Usar ClassePessoas
		ClassePessoas alunoObj = new ClassePessoas(); // Criei um objeto
													// instanciei Classe Pessoa
		
		alunoObj.nomeAt = "Luiz";
		alunoObj.rendaAt = 15_000;
		
		System.out.println(alunoObj.nomeAt);
		System.out.println(alunoObj.rendaAt);
	

	}

}
