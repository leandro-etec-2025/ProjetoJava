
public class ClassePessoas {
	
	// Atributo
	String nomeAt;
	int idadeAt;
	
	// Construtor
	public ClassePessoas(String n, int i) {
		this.nomeAt = n;
		this.idadeAt = i;
	}
	
	public ClassePessoas() {
		
	}
	
	// Métodos
	public void receberNome(String name) {
		this.nomeAt = name;
	}
	
	public void receberIdade(int age) {
		this.idadeAt = age;
	}
	
}






