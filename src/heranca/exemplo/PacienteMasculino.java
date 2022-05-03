package heranca.exemplo;

//Subclasse Paciente Masculino que herda atributos e métodos da superclasse Paciente
public class PacienteMasculino extends Paciente{

	float taxaTestosterona;
	
	public PacienteMasculino(String nome) {
		super(nome);
	}
	
	public PacienteMasculino(String nome, Float peso, Float altura, Integer idade, float testo) {
		super(nome, peso, altura, idade);
		// TODO Auto-generated constructor stub
		this.taxaTestosterona = testo;
	}
	
	// Método para calcular o índice de massa corpórea numa pseudo versão masculina
	
	public float calcularIMC() {
		return (peso/(float)Math.pow(altura, 2));
	}
	
	//Método para calcular o metabolismo masculino por meio do polimorfismo
	
	public float calcularMTB() {
		
		if(idade >=0 && idade<=3)
			return (60.9f * peso) - 54;
		else if(idade > 3 && idade <= 10)
			return (22.7f * peso) + 495;
		else if(idade > 10 && idade <= 18)
			return (17.5f * peso) + 651;
		else if(idade > 18 && idade <= 30)
			return (15.3f * peso) + 679;
		else if(idade > 30 && idade <=60)
			return (11.6f * peso) + 879;
		else
			return (13.5f * peso) + 487;
	}

	@Override
	public String toString() {
		return "PacienteMasculino [nome=" + nome + ", peso=" + peso + ", altura="
				+ altura + ", idade=" + idade +"testoterona="+taxaTestosterona+ "]";
	}
	
	

}
