package heranca.exemplo;

import java.util.Date;

//Subclasse Paciente Feminino que herda atributos e métodos da superclasse Paciente
public class PacienteFeminino extends Paciente{

	Date dataUltimaMenstruacao;
	
	public PacienteFeminino(String nome) {
		super(nome);
	}
	
	public PacienteFeminino(String nome, Float peso, Float altura, Integer idade, Date dataMenstr) {
		super(nome, peso, altura, idade);
		// TODO Auto-generated constructor stub
		this.dataUltimaMenstruacao = dataMenstr;
	}
	
	// Método para calcular o índice de massa corpórea numa pseudo versão feminina 85%
	
	public float calcularIMC() {
		return (peso/(float)Math.pow(altura, 2)) * 0.85f;
	}
	
	//Método para calcular o metabolismo feminino por meio do polimorfismo
	
	public float calcularMTB() {
		
		if(idade >=0 && idade<=3)
			return (61f * peso) - 51;
		else if(idade > 3 && idade <= 10)
			return (22.5f * peso) + 499;
		else if(idade > 10 && idade <= 18)
			return (12.2f * peso) + 746;
		else if(idade > 18 && idade <= 30)
			return (14.7f * peso) + 496;
		else if(idade > 30 && idade <=60)
			return (8.7f * peso) + 829;
		else
			return (10.5f * peso) + 596;
	}

	@Override
	public String toString() {
		return "PacienteFeminino [nome=" + nome + ", peso=" + peso
				+ ", altura=" + altura + ", idade=" + idade +", Data últ.Menstruação="+dataUltimaMenstruacao+"]";
	}

	
}
