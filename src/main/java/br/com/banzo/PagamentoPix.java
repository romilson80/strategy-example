package br.com.banzo;

public class PagamentoPix implements Pagamento {

    @Override
    public void execute(double valor) {
        String resultado = String.format("Pagamento via Pix no valor de R$ %s realizado com sucesso!", valor);
        System.out.println(resultado);
    }
}
