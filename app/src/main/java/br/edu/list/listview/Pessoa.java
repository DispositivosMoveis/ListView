package br.edu.list.listview;

/**
 * Created by welder on 31/03/17.
 */

public class Pessoa {

    private String nome;

    public Pessoa(String nome){
        this.nome = nome;
    }

    public String getNome(){
        return nome;
    }

    @Override
    public String toString() {
        return "Nome: "+nome;
    }

}
