package veiculos;

import pessoas.Proprietario;

//como fazer a herança?
public class Carro extends Veiculo{
    //quem é a super -> Veiculo
    //quem é a sub -> Carro
    private int numPortas;

    public Carro() {}
    //como fazer o construtor com parâmetros?
    public Carro(String marca, int ano, String modelo,
                 String placa, Proprietario proprietario,
                 int numPortas) {
        super(marca, ano, modelo, placa, proprietario);
        this.numPortas = numPortas;
    }
    @Override
    public String toString() {
        //como fazer o toString()?
        return "Tipo -> Carro\n"+
                super.toString()+
                "Número de portas -> "+ numPortas;
    }
    //Quais get/set precisamos fazer?
    public int getNumPortas() {
        return numPortas;
    }
    public void setNumPortas(int numPortas) {
        this.numPortas = numPortas;
    }



}
