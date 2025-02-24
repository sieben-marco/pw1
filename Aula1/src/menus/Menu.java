package menus;

import contatos.Telefone;
import org.w3c.dom.ls.LSOutput;
import pessoas.Proprietario;
import veiculos.*;

import java.util.ArrayList;
import java.util.Scanner;

public class Menu {
    static final Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        ArrayList<Veiculo> veiculos = new ArrayList<>();
        int menuOpcao;

        do {
            System.out.println();

            System.out.println("==== Menu ====");
            System.out.println("1. Cadastrar Veículo");
            System.out.println("2. Pesquisar Veículo por ano");
            System.out.println("3. Pesquisar Veículo por placa");
            System.out.println("4. Pesquisar Veículo por nome do proprietário");
            System.out.println("5. Pesquisar Veículo por número do telefone");
            System.out.println("6. Listar todos os Veículos");
            System.out.println("7. Sair");

            System.out.print("Escolha uma opção: ");
            menuOpcao = input.nextInt();

            System.out.println();

            switch (menuOpcao) {
                case 1:
                    veiculos.add(criarVeiculo());
                    break;
                case 2:
                    pesquisarPorAno(veiculos);
                    break;
                case 3:
                    pesquisarPorPlaca(veiculos);
                    break;
                case 4:
                    pesquisarPorNomeProprietario(veiculos);
                    break;
                case 5:
                    pesquisarPorNumeroPropritario(veiculos);
                    break;
                case 6:
                    listarVeiculos(veiculos);
                    break;
            }
        } while (menuOpcao != 7);
    }

    /**
     * Pesquisa os veículos pelo número de telefone do proprietário
     * @param veiculos Lista de veículos
     */
    private static void pesquisarPorNumeroPropritario(ArrayList<Veiculo> veiculos) {
        System.out.print("- Digite o DDD do número do proprietário que deseja pesquisar: ");
        int ddd = input.nextInt();
        System.out.print("- Digite o número do proprietário que deseja pesquisar: ");
        long numero = input.nextLong();

        for (var veiculo : veiculos) {
            if (
                veiculo.getProprietario()
                        .getTelefones()
                        .contains(new Telefone(ddd, numero))
            ) {
                System.out.println(veiculo);
            }
        }
    }

    /**
     * Pesquisa os veículos pelo nome do proprietário
     * @param veiculos Lista de veículos
     */
    private static void pesquisarPorNomeProprietario(ArrayList<Veiculo> veiculos) {
        System.out.print("- Digite o nome do proprietário que deseja pesquisar: ");
        String nome = input.next();

        for (var veiculo : veiculos) {
            if (veiculo.getProprietario().getNome().equals(nome)) {
                System.out.println(veiculo);
            }
        }
    }

    /**
     * Pesquisa os veículos pela placa
     * @param veiculos Lista de veículos
     */
    private static void pesquisarPorPlaca(ArrayList<Veiculo> veiculos) {
        System.out.print("- Digite a placa que deseja pesquisar: ");
        String placa = input.next();

        for (var veiculo : veiculos) {
            if (veiculo.getPlaca().equals(placa)) {
                System.out.println(veiculo);
            }
        }
    }

    /**
     * Pesquisa os veículos pelo ano
     * @param veiculos Um lista de veículos
     */
    private static void pesquisarPorAno(ArrayList<Veiculo> veiculos) {
        System.out.print("- Digite o ano que deseja pesquisar: ");
        int ano = input.nextInt();

        for (var veiculo : veiculos) {
            if (veiculo.getAno() == ano) {
                System.out.println(veiculo);
            }
        }
    }

    /**
     * Lista todos os veículos cadastrados
     * @param veiculos Lista de veículos
     */
    private static void listarVeiculos(ArrayList<Veiculo> veiculos) {
        for (int i = 0; i < veiculos.size(); i++) {
            System.out.println("= Veículo " + (i+1) + " =\n" + veiculos.get(i));

            if (veiculos.size() > 1 && (i != veiculos.size() - 1)) System.out.println();
        }
    }

    /**
     * Cria uma lista de telefones
     * @return Uma lista de telefones
     */
    private static ArrayList<Telefone> criarTelefone() {
        ArrayList<Telefone> telefones = new ArrayList<>();
        int opcao;

        do {
            System.out.print("- Digite o DDD do número do proprietátio: ");
            int ddd = input.nextInt();
            System.out.print("- Digite o número do proprietário: ");
            long numero = input.nextLong();
            telefones.add(new Telefone(ddd, numero));

            System.out.println("- O proprietário tem outro telefone?\n  1. Sim\n  2. Nao");
            System.out.print("Escolha uma opção: ");
            opcao = input.nextInt();
        } while (opcao == 1);

        return telefones;
    }

    /**
     * Cria um proprietário
     * @param telefones Lista de telefones do proprietário
     * @return Um proprietário
     */
    private static Proprietario criarProprietario(ArrayList<Telefone> telefones) {
        System.out.print("- Digite o nome do proprietário: ");
        String nome = input.next();

        return new Proprietario(nome, telefones);
    }

    /**
     * Cria um veículo
     * @return Um veículo
     */
    private static Veiculo criarVeiculo() {
        System.out.println("=== Cadastro de Veículo ===");

        Veiculo veiculo;

        ArrayList<Telefone> telefones = criarTelefone();
        var proprietario = criarProprietario(telefones);

        System.out.print("- Digite a marca do veículo: ");
        String marca = input.next();

        System.out.print("- Digite o modelo do veículo: ");
        String modelo = input.next();

        System.out.print("- Digite o ano do veículo: ");
        int ano = input.nextInt();

        System.out.print("- Digite a placa do veículo: ");
        String placa = input.next();

        System.out.println("- Informe o tipo de veículo: \n  1. Carro\n  2. Moto");
        System.out.print("Escolha uma opção: ");
        int tipo = input.nextInt();

        if (tipo == 1) {
            System.out.print("- Digite a quantidade de portas do carro: ");
            int numPortas = input.nextInt();

            veiculo = new Carro(marca, ano, modelo, placa, proprietario, numPortas);
        }
        else {
            System.out.print("- Digite as cilindradas da moto: ");
            int cilindradas = input.nextInt();

            veiculo = new Moto(marca, ano, modelo, placa, proprietario, cilindradas);
        }

        return veiculo;
    }
}
