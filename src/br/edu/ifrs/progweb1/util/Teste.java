/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifrs.progweb1.util;

import java.util.TreeSet;

/**
 *
 * @author IrlaSilvaCostaTrevis
 */
public class Teste {

    public static void main(String[] args) {

        CD cd1 = new CD("Título CD 1", 2018, true, "artista irla", "genero música erudita");
        CD cd2 = new CD("Título CD 2", 2011, true, "Maria Rita", "Samba");
        CD cd3 = new CD("Título CD 3", 2009, true, "Jorge Ben Jor", "Samba rock, Sambalanço, Samba funk");

        MinhaPilha<CD> pilha = new MinhaPilha<>();

// como armazenar objetos da classe CD na pilha?
// ????
        pilha.itens.add(cd1);
        pilha.add(cd2);
        pilha.add(cd3);

//cada inserção a pilha deve ficar ordenada
        TreeSet<CD> arvore = new TreeSet<>();

    }
}
