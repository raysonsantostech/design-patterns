package designpatterns.comportamentais.templatemethod;

public class Cliente {
  public static void main(String[] args) {
    Gateway gateway = new Gateway();
    float valor = 1000;

    System.out.println("Pagamento em Crédito");
    PagamentoCredito pagamentoCredito = new PagamentoCredito(gateway, valor);
    pagamentoCredito.realizarCobranca();
    System.out.println();

    System.out.println("Pagamento em Débito");
    PagamentoDebito pagamentoDebito = new PagamentoDebito(gateway, valor);
    pagamentoDebito.realizarCobranca();
    System.out.println();

    System.out.println("Pagamento em Dinheiro");
    PagamentoDinheiro pagamentoDinheiro = new PagamentoDinheiro(gateway, valor);
    pagamentoDinheiro.realizarCobranca();
    System.out.println();

  }
}
