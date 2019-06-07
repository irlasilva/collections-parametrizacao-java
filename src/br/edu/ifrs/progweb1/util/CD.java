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
public class CD implements Comparable<CD> {

    private String titulo;
    private int ano;
    private boolean coletanea;
    private String artista;
    private String genero;

    // construtor default sem parametros
    public CD() {};

    public CD(String titulo, int ano, boolean coletanea, String artista, String genero) {
        setTitulo(titulo);
        setAno(ano);
        setColetanea(coletanea);
        setArtista(artista);
        setGenero(genero);
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public boolean isColetanea() {
        return coletanea;
    }

    public void setColetanea(boolean coletanea) {
        this.coletanea = coletanea;
    }

    public String getArtista() {
        return artista;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    @Override
    public int compareTo(CD obj) { // compara pelo ano
        if (this.ano < obj.getAno()) {
            return -1;
        }
        if (this.ano > obj.getAno()) {
            return 1;
        }
        return 0;
    }

    @Override
    public String toString() {
        return "CD{" + "titulo=" + titulo + ", ano=" + ano + ", coletanea=" + coletanea + ", artista=" + artista + ", genero=" + genero + '}';
    }

}

