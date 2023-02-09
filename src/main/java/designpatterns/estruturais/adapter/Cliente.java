package designpatterns.estruturais.adapter;

import designpatterns.estruturais.adapter.external.EduzzPagamento;

public class Cliente {

  public static void main(String[] args) {

    EduzzPagamento eduzzPagamento = new EduzzPagamento();
    EduzzPagamentoAdapter eduzzPagamentoAdapter = new EduzzPagamentoAdapter(eduzzPagamento);

    HotmartPagamentoAdapter hotmartPagamentoAdapter = new HotmartPagamentoAdapter();

    Cobranca cobranca = new Cobranca(hotmartPagamentoAdapter);

    cobranca.setValor(1000);
    cobranca.setParcelas(10);
    cobranca.setCvv("123");
    cobranca.setNumeroCartao("5502 5502 5502 5502");

    cobranca.realizarPagamento();

    cobranca.setGateway(eduzzPagamentoAdapter);
    cobranca.realizarPagamento();

  }

}
