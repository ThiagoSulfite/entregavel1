package com.company;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class Curso {

    // Parte B do entregável, com os atributos do objeto curso.

    private String nome;
    private Integer codigoDeCurso;

    // Parte E do entregável, com os atributos das classes abstratas de professor.

    private ProfessorTitular professorTitular;
    private ProfessorAdjunto professorAdjunto;
    private Integer quantidadeMaxDeAlunos;
    private static ArrayList<Aluno> listaDeAlunos;

    public Curso (String nome, int codigoDeCurso) {
        this.nome = nome;
        this.codigoDeCurso = codigoDeCurso;
    }

    /* Métodos Getters e Setters do curso. O atalho para o generate é Alt + Insert.
    Pergunta: Quando eu uso o Alt + Insert para gerar os Getter e Setters, os gets só
    vem com um return nome do atributo / método. Por que nós usamos o this, se o this
    só referencia o próprio atributo / método e o mesmo já está sendo chamado? */

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nomeSettado) {
        this.nome = nomeSettado;
    }

    public Integer getCodigoDeCurso() {
        return this.codigoDeCurso;
    }

    public void setCodigoDeCurso(Integer codigoDeCursoSettado) {
        this.codigoDeCurso = codigoDeCursoSettado;
    }

    public ProfessorTitular getProfessorTitular() {
        return this.professorTitular;
    }

    public void setProfessorTitular(ProfessorTitular professorTitularSettado) {
        this.professorTitular = professorTitularSettado;
    }

    public ProfessorAdjunto getProfessorAdjunto() {
        return this.professorAdjunto;
    }

    public void setProfessorAdjunto(ProfessorAdjunto professorAdjuntoSettado) {
        this.professorAdjunto = professorAdjuntoSettado;
    }

    public Integer getQuantidadeMaxDeAlunos() {
        return this.quantidadeMaxDeAlunos;
    }

    public void setQuantidadeMaxDeAlunos(Integer quantidadeMaxDeAlunosSettado) {
        this.quantidadeMaxDeAlunos = quantidadeMaxDeAlunosSettado;
    }

    public ArrayList<Aluno> getListaDeAlunos() {
        return this.listaDeAlunos = listaDeAlunos;
    } /* DEUS. O TRABALHO QUE ISSO DEU. Preciso que o Yuri e o João me explique como
    implementar uma ArrayList de uma classe em outra, se eu fiz isso do jeito certo,
    especialmente quando usa métodos getters e setters. */

    public void setListaDeAlunos() {
        this.listaDeAlunos = listaDeAlunos;
    }

    // ArrayList do Curso e getters e setters dessa ArrayList

    private ArrayList<Curso> listaDeCursos = new ArrayList<>();

    public ArrayList<Curso> getListaDeCursos() {
        return this.listaDeCursos;
    }

    public void setListaDeCursos(ArrayList<Curso> listaDeCursosSet) {
        this.listaDeCursos = listaDeCursosSet;
    }

    // Parte H - Métodos da classe curso

    public boolean adicionarUmAluno(Aluno umAluno) {
        getListaDeAlunos().add(umAluno);
        return true;
    }
}

