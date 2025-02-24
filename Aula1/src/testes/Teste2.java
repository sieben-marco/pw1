package testes;
import veiculos.*;

public class Teste2 {
    public static void main(String[] args) {
    	Veiculo[] vet = new Veiculo[3];
    	vet[0] = new Veiculo();
    	vet[1] = new Carro();
    	for (Veiculo veiculo : vet) {
    		if(veiculo != null) {
	        	System.out.println(veiculo.toString());			
	        	System.out.println(veiculo.getPlaca());
	        	if(veiculo instanceof Carro)
	        	   System.out.println(
	        			   ((Carro)veiculo).getNumPortas());
    		}
		}
    }
}
