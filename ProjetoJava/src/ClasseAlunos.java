
public class ClasseAlunos extends ClassePessoas{
	
	// Atributo
	float notaAt; 
	String cursoAt;
	
	// Construtor
	public ClasseAlunos(String name, int age, int grade, String course) {
		super(name, age);
		this.notaAt = grade;
		this.cursoAt = course;
	}

}
