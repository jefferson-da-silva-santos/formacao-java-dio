package com.projeto.atribuicaoreferencia;

public class Pilha {
    private No refNoEntradaPilha;

    public Pilha() {
        this.refNoEntradaPilha = null;
    }

    public No top() {

    }

    public boolean isEmpty() {
        return refNoEntradaPilha == null ? true : false;
    }
}
