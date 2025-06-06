
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
	
	public void mostrarNome() {
		System.out.println(this.nomeAt); // sysout CTRL SPACE;
	}
	
	public void mostrarIdade() {
		System.out.println(this.idadeAt); // sysout CTRL SPACE;
	}
	
	public String retornarNome() {
		return this.nomeAt;
	}
	
	public int retornarIdade() {
		return this.idadeAt;
	}
	
}






