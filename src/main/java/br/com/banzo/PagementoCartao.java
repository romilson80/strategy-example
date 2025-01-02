package br.com.banzo;

public class PagementoCartao implements Pagamento{
    @Override
    public void execute(double valor) {
        String resultado = String.format("Pagamento Cartão no valor de R$ %s realizado com sucesso!", valor);
        System.out.println(resultado);
    }
}
