package com.company;

import java.util.ArrayList;

public class Aluno {

    // Parte A do entregável, com os atributos do objeto aluno.

    private String nome;
    private String sobrenome;
    private Integer codigoDeAluno;

    public Aluno(String nome, String sobrenome, Integer codigoDeAluno) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.codigoDeAluno = codigoDeAluno;
    } // Construtor. Eu esqueci de criar esse cara e o programa lembrou. Pq fazemos isso mesmo?

    // Métodos Getters e Setters do aluno.

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nomeSettado) { //Por que os sets não retornam nada mesmo?
        this.nome = nomeSettado;
    }

    public String getSobrenome() {
        return this.sobrenome;
    }

    public void setSobrenome(String sobrenomeSettado) {
        this.sobrenome = sobrenomeSettado;
    }

    public Integer getCodigoDeAluno() {
        return this.codigoDeAluno;
    }

    public void setCodigoDeAluno(Integer codigoDeAlunoSettado) {
        this.codigoDeAluno = codigoDeAlunoSettado;
    }

    //ArrayList de alunos e getters e setters:

    private ArrayList<Aluno> listaDeAlunos = new ArrayList<>();
    /* Não acho que entendi bem ArrayList, aqui sei que inicializei uma ArrayList na classe
    Aluno, certo? Dei a ela o nome listaDeAlunos? É isso? Por que os <> da 2a Array List são
    vazios? */

    public ArrayList<Aluno> getListaDeAlunos() {
        return this.listaDeAlunos;
    }

    public void setListaDeAlunos(ArrayList<Aluno> listaDeAlunosSet) {
        this.listaDeAlunos = listaDeAlunosSet;
    }
}