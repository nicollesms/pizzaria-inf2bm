package com.itb.inf2bm.pizzaria.exceptions;

public class BadRequest extends RuntimeException {

    // extends : HERANÇA, significa que BadResquest herda características de RuntimeException

    // Construtor: Ele possui o mesmo nome da classe, utilizamos quando precisamos
    //             criar um objeto JÁ PASSANDO PARÂMETRO(S)
    // Toda classe possui o construtor padrão, a partir do momento que vc cria outros
    // construtores a classe perde o construtor padrão, devendo ser recriado a critério.

    // O construtor padrão não possui parâmetros
    // Veja:
    public BadRequest() {

    }
    // super: Acessando o construtor da super classe 'classe mãe'

    public BadRequest(String message) {
        super(message);
    }
}
