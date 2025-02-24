package pessoas;

import java.util.*;

import contatos.Telefone;

public class Proprietario {
    private String nome;
    //proprietário tem vários telefones
    private List<Telefone> telefones;
    //como dizer que um proprietario tem vários telefones?

    public Proprietario() {}
    public Proprietario(String nome,
                        ArrayList<Telefone> telefones) {
        this.nome = nome;
        this.telefones = telefones;
    }

    public String toString() {
        String aux="";
        //colocar os telefones um abaixo do outro
        if(telefones != null) {
            for (Telefone telefone : telefones) {
                if(telefone != null)
                    aux += telefone.toString() + "\n";
            }
        }
        return "Nome do proprietário -> " + nome + "\n" + aux;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public List<Telefone> getTelefones() {
        return telefones;
    }
    public void setTelefones(List<Telefone> telefones) {
        this.telefones = telefones;
    }
}
