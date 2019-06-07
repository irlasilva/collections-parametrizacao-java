/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifrs.progweb1.util;

import java.util.Collections;
import java.util.LinkedList;

/**
 *
 * @author IrlaSilvaCostaTrevis
 */
public class MinhaPilha<E> implements Pilha<E> {

    //private LinkedList<E> itens = new LinkedList<>();
    
    public MinhaPilha() {};

    public MinhaPilha(E e) {
        super();
    }

    @Override
    public void inserir(E elemento) {
        itens.add(elemento);
    }

    @Override
    public E remover(E elemento) {
        return itens.remove();
    }

    @Override
    public int totalizar(E elemento) {
        return itens.size();
    }

    @Override
    public void limpar(E elemento) {
        itens.clear();
    }

    @Override
    public void ordenar(E elemento) {
        itens.s;
    }
    
    LinkedList<E> itens = new LinkedList<E>();
Collections.sort(itens, new Comparator<E>() {

    @Override
    public int compareTo(E objetoUm, E objetoDois) {
        // Sua implementação de comparador aqui
        return objetoUm.compareTo(objetoDois);
    }
});

}
