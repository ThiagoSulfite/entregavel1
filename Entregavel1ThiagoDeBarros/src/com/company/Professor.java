package com.company;

public class Professor {

    // Parte C do entregável, com os atributos do objeto professor.

    private String nome;
    private String sobrenome;
    private Integer tempoDeCasa;
    private Integer codigoDeProfessor;

    public Professor (String nome,
                      String sobrenome,
                      Integer tempoDeCasa,
                      Integer codigoDeProfessor) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.tempoDeCasa = tempoDeCasa;
        this.codigoDeProfessor = codigoDeProfessor;
    }

    // Métodos Getters e Setters do professor.

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nomeSettado) {
        this.nome = nomeSettado;
    }

    public String getSobrenome() {
        return this.sobrenome;
    }

    public void setSobrenome(String sobrenomeSettado) {
        this.sobrenome = sobrenomeSettado;
    }

    public Integer getTempoDeCasa() {
        return this.tempoDeCasa;
    }

    public void setTempoDeCasa(Integer tempoDeCasaSettado) {
        this.tempoDeCasa = tempoDeCasaSettado;
    }

    public Integer getCodigoDeProfessor() {
        return this.codigoDeProfessor;
    }

    public void setCodigoDeProfessor(Integer codigoDeProfessorSettado) {
        this.codigoDeProfessor = codigoDeProfessorSettado;
    }
}
