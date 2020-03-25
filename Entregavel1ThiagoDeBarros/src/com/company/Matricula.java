package com.company;

import java.util.ArrayList;
import java.util.Date;

public class Matricula {

    // Parte F do entregável, com os atributos do objeto matrícula.

    private Aluno aluno;
    private Curso curso;
    private Date dataDaMatricula;

    // Construtor da matrícula

    public Matricula (Aluno aluno, Curso curso, Date dataDaMatricula) {
        Date dataDoDia = new Date();
        this.aluno = aluno;
        this.curso = curso;
        this.dataDaMatricula = dataDoDia; /* Aqui talvez esteja a dica para eu entender
        todo o meu embrolho com a parte dos construtores. Prestar a atenção em como
        dataDaMatricula e dataDoDia se chamam de pontos diferentes. E por que diabos a linha de
        cima do comentário está com uma cor diferente? */
    }

    // Getters e Setters da Matrícula.

    public Aluno getAluno() {
        return aluno;
    }

    public void setAluno(Aluno aluno) {
        this.aluno = aluno;
    }

    public Curso getCurso() {
        return curso;
    }

    public void setCurso(Curso curso) {
        this.curso = curso;
    }

    public Date getDataDaMatricula() {
        return dataDaMatricula;
    }

    public void setDataDaMatricula(Date dataDaMatricula) {
        this.dataDaMatricula = dataDaMatricula;
    }

    // ArrayList de Matrícula e getters e setters

    private ArrayList<Matricula> listaDeMatriculas = new ArrayList<>();

    public ArrayList<Matricula> getListaDeMatriculas() {
        return this.listaDeMatriculas;
    }

    public void setListaDeMatriculas(ArrayList<Matricula> listaDeMatriculasSet) {
        this.listaDeMatriculas = listaDeMatriculasSet;
    }
}
