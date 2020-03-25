package com.company;

public class ProfessorTitular extends Professor {

    // Parte D do entregável, com a classe abstrata do objeto professor (titular).

    private String especialidade;

    public ProfessorTitular (String nome,
                            String sobrenome,
                            Integer tempoDeCasa,
                            Integer codigoDeProfessor) {
        super (nome, sobrenome, tempoDeCasa, codigoDeProfessor);
    } // Pra que serve o super mesmo?

    public String getEspecialidade() {
        return this.especialidade;
    }

    public void setEspecialidade(String especialidadeSettado) {
        this.especialidade = especialidadeSettado;
    }
}
