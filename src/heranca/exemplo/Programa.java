package heranca.exemplo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Programa {

	public static void main(String[] args) {
		
		//Única lista comporta todas as subclasses de paciente
		List<Paciente> pacientes = new ArrayList<>();
		
		//Instâncias dos objetos 
		Paciente p1 = new PacienteMasculino("Gustavo", 80f, 1.75f, 35, 100f);
		Paciente p2 = new PacienteFeminino("Maria", 80f, 1.75f, 35, new Date());
		
		//Variável por referência a ser inicializada após recuperada
		Paciente p3;
		
		System.out.println(p1);
		System.out.println(p2);
		
		//Resultados diferentes, mesmo com dados iguais, 
		//devido às fórmulas para cada sexo. Chamada polifórfica.  
		System.out.println(p1.calcularMTB());
		System.out.println(p2.calcularMTB());
		
		//Inserção dos elementos no array do tipo Paciente
		pacientes.add(p1);
		pacientes.add(p2);
		
		int index = pacientes.indexOf(new PacienteFeminino("Maria"));
		p3 = pacientes.get(index);
		
		System.out.println(p3);
		
	}
}
