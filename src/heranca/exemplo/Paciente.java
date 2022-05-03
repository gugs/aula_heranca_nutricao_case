package heranca.exemplo;

import java.util.Objects;

// Classe abstrata paciente comporta m�todos abstratos e n�o permite 
// inst�ncia a partir desta classe

public abstract class Paciente {

	String nome;
	Float peso;
	Float altura;
	Integer idade;
	
	//Construtores em sobrecarga
	public Paciente(String nome) {
		this.nome = nome;
	}
	//Construtores em sobrecarga
	public Paciente(String nome, Float peso, Float altura, Integer idade) {
		super();
		this.nome = nome;
		this.peso = peso;
		this.altura = altura;
		this.idade = idade;
	}

	@Override
	public int hashCode() {
		return Objects.hash(nome);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Paciente other = (Paciente) obj;
		return Objects.equals(nome, other.nome);
	}
	
	// M�todo abstrato calcularIMC - implementa��o por conta das classes filhas
	// Esse tipo de declara��o compreende apenas cabe�alho do m�todo, sem o seu escopo. 
	public abstract float calcularIMC();
	
	// M�todo abstrato calcularMTB - implementa��o por conta das classes filhas
	// Esse tipo de declara��o compreende apenas cabe�alho do m�todo, sem o seu escopo.
	public abstract float calcularMTB();
	
	
}
