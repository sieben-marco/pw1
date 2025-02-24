package testes;

import java.util.ArrayList;

import contatos.Telefone;
import pessoas.Proprietario;
import veiculos.Veiculo;

public class Teste4 {
	public static void main(String[] args) {
		ArrayList<Telefone> fones = new ArrayList<>();
		//adicionar 2 telefones?
		fones.add(new Telefone());
		fones.add(new Telefone(51, 66778899));
		
		Proprietario prop1 = new Proprietario();
		Proprietario prop2 =
				new Proprietario("Fulano", fones);
		
		System.out.println(prop1.toString());
		System.out.println(prop2.toString());
		
		Veiculo v = new Veiculo("Fiat", 1990, "Uno", 
				"ixs9089", prop2);
		System.out.println(v.toString());
	}
}
