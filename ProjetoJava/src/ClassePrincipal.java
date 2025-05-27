
public class ClassePrincipal {

	// Método chamado main
	public static void main(String[] args) {

		ClassePessoas objetoPessoa1 = new ClassePessoas();
		ClassePessoas objetoPessoa2 = new ClassePessoas();
		
		objetoPessoa1.receberNomeMet("Mel");
		objetoPessoa1.receberRendaMet(15_000);
		
		objetoPessoa2.receberNomeMet("Ryan");
		objetoPessoa2.receberRendaMet(15_000);
		
		objetoPessoa1.mostrarNomeMet();
		objetoPessoa1.mostrarRendaMet();
		
		objetoPessoa2.mostrarNomeMet();
		objetoPessoa2.mostrarRendaMet();
		
		ClasseFuncionario objetoFuncionario1 =  new ClasseFuncionario();
		objetoFuncionario1.receberNomeMet("Miguel");
		objetoFuncionario1.receberRendaMet(50_000);
		objetoFuncionario1.cargoAt = "CEO";
		
	}
	
	
	
	
	
	
	

}
