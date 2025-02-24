package testes;

import java.util.ArrayList;

import contatos.Telefone;
import pessoas.Proprietario;

public class Teste3 {
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
	}
}
