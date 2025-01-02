package br.com.banzo;

import java.util.Arrays;

public enum MetodoPagamento {
    CARTAO(0, new PagementoCartao()),
    DINHEIRO(1, new PagamentoDinheiro()),
    PIX(2, new PagamentoPix());

    private final Integer tipoPagamento;

    private final Pagamento pagamento;

    public Pagamento getPagamento() {
        return pagamento;
    }

    public Integer getTipoPagamento() {
        return tipoPagamento;
    }

    MetodoPagamento(Integer tipo, Pagamento pagamento) {
        this.tipoPagamento = tipo;
        this.pagamento = pagamento;
    }

    public static MetodoPagamento getMetodoPagamento(Integer tipoPagamento) {
        return Arrays.stream(MetodoPagamento.values()).filter(p -> p.getTipoPagamento().equals(tipoPagamento)).findFirst()
                .orElseThrow( () -> new IllegalArgumentException("Tipo de pagamento inválido: " + tipoPagamento));
    }
}
