package br.edu.ifrs.poa.pw1.menu;

public enum OpcoesMenu {
   CAD_VEICULO ("Cadastrar Veículo"),
   PESQ_ANO ("Pesquisar Veículo ano"), 
   PESQ_PLACA("Pesquisar Veículo placa"), 
   PESQ_NOME ("Pesquisar Veículo Nome proprietário"),
   PESQ_FONE ("Pesquisar Veículo Número do telefone"),
   LIST("Listar todos os veículos"), 
   SAIR("Sair");
 
   private String descricao;
   private OpcoesMenu(String descricao) {
	   this.descricao = descricao;
   }
   public String getDescricao() {
	   return descricao;
   }
}
	                 
