package org.example;

public class TransferenciaEntreContas {
    public void transfere(Conta conta, Conta contaDestino, int valor){
        if(valor <= 0){
            throw new IllegalArgumentException("erro! deve ser um valor maior que zero!");
        }
    }
}
