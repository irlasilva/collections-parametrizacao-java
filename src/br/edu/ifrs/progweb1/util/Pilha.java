/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifrs.progweb1.util;

/**
 *
 * @author IrlaSilvaCostaTrevis
 */
public interface Pilha<E> {
// interface tem construtor?
// tem getters e setters?

    public void inserir(E elemento);

    public E remover(E elemento);

    public int totalizar(E elemento);

    public void limpar(E elemento);

    public void ordenar(E elemento);

    @Override
    public String toString();
}
