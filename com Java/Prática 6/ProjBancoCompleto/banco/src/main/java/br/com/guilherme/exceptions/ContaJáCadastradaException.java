package br.com.guilherme.exceptions;

public class ContaJáCadastradaException extends RuntimeException {
    public ContaJáCadastradaException() {
        this("Erro! Esta conta já foi cadastrada!");
    }

    public ContaJáCadastradaException(String msg) {
        super(msg);
    }
}
