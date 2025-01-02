package br.com.banzo;

public class PagamentoDinheiro implements Pagamento {

    @Override
    public void execute(double valor) {
        String resultado = String.format("Pagamento em Dinheiro no valor de R$ %s realizado com sucesso!", valor);
        System.out.println(resultado);
    }
}
