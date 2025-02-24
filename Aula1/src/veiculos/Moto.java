package veiculos;

import pessoas.Proprietario;

//como fazer a herança?
public class Moto extends Veiculo{
    //quem é a super -> Veiculo
    //quem é a sub -> Carro
    private int cilindradas;

    public Moto() {}
    //como fazer o construtor com parâmetros?
    public Moto(String marca, int ano, String modelo,
                String placa, Proprietario proprietario,
                int cilindradas) {
        super(marca, ano, modelo, placa, proprietario);
        this.cilindradas = cilindradas;
    }
    @Override
    public String toString() {
        //como fazer o toString()?
        return "Tipo -> Moto\n"+
                super.toString()+
                "Cilindradas -> "+ cilindradas;
    }
    //Quais get/set precisamos fazer?
    public int getcilindradas() {
        return cilindradas;
    }
    public void setcilindradas(int cilindradas) {
        this.cilindradas = cilindradas;
    }



}
