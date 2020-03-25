package com.company;

public class ProfessorAdjunto extends Professor {

    // Parte D do entregável, com a classe abstrata do objeto professor (adjunto).

    private Integer quantidadeHorasDeMonitoria;

    public ProfessorAdjunto(String nome,
                            String sobrenome,
                            Integer tempoDeCasa,
                            Integer codigoDeProfessor) {
        super(nome, sobrenome, tempoDeCasa, codigoDeProfessor);
    }

    public Integer getQuantidadeHorasDeMonitoria() {
        return this.quantidadeHorasDeMonitoria;
    }

    public void setQuantidadeHorasDeMonitoria(Integer quantidadeHorasDeMonitoriaSettado) {
        this.quantidadeHorasDeMonitoria = quantidadeHorasDeMonitoriaSettado;
    }
}
