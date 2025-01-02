package br.com.banzo;

public class ClasseMae {

    public static void main(String[] args) {
        MetodoPagamento metodoPagamento = MetodoPagamento.getMetodoPagamento(2);
        metodoPagamento.getPagamento().execute(200);
    }
}
