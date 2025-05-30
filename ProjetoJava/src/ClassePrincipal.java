
public class ClassePrincipal {

	// Método chamado main
	public static void main(String[] args) {
	
		// Instanciei a classe alunos
		ClasseAlunos mikaelObj = new ClasseAlunos(); // Objeto 1
		ClasseAlunos abraaoObj = new ClasseAlunos(); // Objeto 2
		
		// Funciona, mas está errado
		// mikaelObj.nomeAt = "Mikael";
		// mikaelObj.cursoAt = "Informática";
		// mikaelObj.notaAt = 8.5F;
		
		mikaelObj.receberNomeMet("Mikael");
		mikaelObj.receberCursoMet("Informática");
		//mikaelObj.mostrarNotaMet(8.5F);
		
		
		// Funciona, mas está errado
		//System.out.println(mikaelObj.nomeAt); // sysout CTRL + SPACE
		//System.out.println(mikaelObj.cursoAt);
		//System.out.println(mikaelObj.notaAt);
		mikaelObj.mostrarNomeMet();
		mikaelObj.mostrarCursoMet();
		mikaelObj.mostrarNotaMet();

		
	}
	
}
