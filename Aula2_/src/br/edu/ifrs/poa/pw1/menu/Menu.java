package br.edu.ifrs.poa.pw1.menu;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import br.edu.ifrs.poa.pw1.contatos.Telefone;
import br.edu.ifrs.poa.pw1.pessoas.Proprietario;
import br.edu.ifrs.poa.pw1.veiculos.Carro;

public class Menu {
	public static void main(String[] args) {
	  ArrayList<Carro> carros = new ArrayList<>();
	  while(true) {
		switch(montaMenu()) {
			case 1://veiculo -> Carro
				 //cadastrar o proprietário
				  //pedir todos os atributos do proprietário
				  //nome e telefones
				  String nome = JOptionPane.showInputDialog("Informe o nome:");
				  String numFones= JOptionPane.showInputDialog("quantos telefones?");
				  int numFones2 = Integer.parseInt(numFones);
				  //cadastrar vários telefones
	   			  //telefone ddd + numero
				  ArrayList<Telefone> telefones = new ArrayList<>();
				  for(int i=0; i<numFones2; i++) {
					int ddd = Integer.parseInt(JOptionPane.showInputDialog("ddd"));
					long numero = Long.parseLong(JOptionPane.showInputDialog("número"));
					Telefone fone = new Telefone(ddd, numero);
					telefones.add(fone);
	   	          }
				  Proprietario proprietario = 
						          new Proprietario(nome, telefones);
				  //cadastrar o carro
	   			  //ordem dos atributos: marca, ano, modelo, placa, 
				  //proprietario, numPortas
				  String marca = JOptionPane.showInputDialog("Informe a marca:");
				  int ano= Integer.parseInt(JOptionPane.showInputDialog("Informe o ano:"));
				  String modelo = JOptionPane.showInputDialog("Informe a modelo:");
				  String placa = JOptionPane.showInputDialog("Informe a placa:");
				  int portas= Integer.parseInt(JOptionPane.showInputDialog("Informe o numero de portas:"));
			  Carro carro = new Carro(marca, ano, modelo, placa,
					        proprietario, portas);
			  carros.add(carro);
		      break;	
			case 2://Pesquisar Veículo ano
				   boolean flag = false; 
				   int anoPesq= Integer.parseInt(JOptionPane.showInputDialog("Informe o ano:"));
				   if(carros!=null) {
					   for (Carro carroPesq : carros) {
						  if(carroPesq != null) {
							  if(anoPesq == carroPesq.getAno()) {
								  JOptionPane.showMessageDialog(null, 
									 "Carro encontrado\n"+carroPesq.toString());
								  flag = true;
							  }
						  }
					   }
				   }
				   if(flag==false) //ou if(!flag)
					   JOptionPane.showMessageDialog(null,"Carro não encontrado");
				   break;	
			case 3://Pesquisar Veículo placa
				   flag = false; //declarando a variável
				   String placaPesq= JOptionPane.showInputDialog("Informe a placa para pesquisa:");
				   if(carros!=null) {
					   for (Carro carroPesq : carros) {
						  if(carroPesq != null) {
							  if(placaPesq.equals(carroPesq.getPlaca())) {
								  JOptionPane.showMessageDialog(null, 
									 "Carro encontrado\n"+carroPesq.toString());
								  flag = true;
							  }
						  }
					   }
				   }
				   if(flag==false) //ou if(!flag)
					   JOptionPane.showMessageDialog(null,"Carro não encontrado");
				   break;
			case 4://Pesquisar Veículo Nome proprietário
				   flag = false; //declarando a variável
				   String nomePesq= JOptionPane.showInputDialog("Informe o nome para pesquisa:");
				   if(carros!=null) {
					   for (Carro carroPesq : carros) {
						  if(carroPesq != null) {
							  if(nomePesq.equals(
									  carroPesq.getProprietario().getNome())) {
								  JOptionPane.showMessageDialog(null, 
									 "Carro encontrado\n"+carroPesq.toString());
								  
								  flag = true;
							  }
						  }
					   }
				   }
				   if(flag==false) //ou if(!flag)
					   JOptionPane.showMessageDialog(null,"Carro não encontrado");
				   break;
			case 5://Pesquisar Veículo telefone proprietário
				   flag = false; //declarando a variável
				   int dddPesq = Integer.parseInt(JOptionPane.showInputDialog("ddd"));
				   long numeroPesq = Long.parseLong(JOptionPane.showInputDialog("número"));
				   if(carros!=null) {
					   for (Carro carroPesq : carros) {
						  if(carroPesq != null) {
							  List<Telefone> fones = carroPesq.getProprietario().getTelefones();
							  for(Telefone fone: fones) {
							    if(fone!=null) {
							    	if(fone.getDdd() == dddPesq && 
							    	   fone.getNumero() == numeroPesq) {
								  JOptionPane.showMessageDialog(null, 
									 "fone encontrado\n"+carroPesq.toString());
								  flag = true;
							        }
							    }
							  }
						  }
					   }
				   }
				   if(flag==false) //ou if(!flag)
					   JOptionPane.showMessageDialog(null,"Carro não encontrado");
				   break;
			case 6:if(carros!=null) 
				   for (Carro carroPesq : carros) 
					  if(carroPesq != null) 
						  JOptionPane.showMessageDialog(null,carroPesq.toString());
				   break;	
			case 7:System.exit(0);
				   break;					   
		}
	  }
	}
	public static int montaMenu() {
		String menu = ""; /* = "1 - Cadastrar Veículo\n"+
	                  "2 - Pesquisar Veículo ano\n"+
	                  "3 - Pesquisar Veículo placa\n"+
	                  "4 - Pesquisar Veículo Nome proprietário\n"+
	                  "5 - Pesquisar Veículo Número do telefone\n"+
	                  "6 - Listar todos os veículos\n"+
	                  "7 - Sair\n";*/
		for(OpcoesMenu opcao : OpcoesMenu.values()) {
			menu += (opcao.ordinal() + 1) + " - " + opcao.getDescricao()+"\n";
		}
		String opcao = JOptionPane.showInputDialog(menu);
		//converte uma string para int
		int opcao2 = Integer.parseInt(opcao);
		return opcao2;
	}
}
