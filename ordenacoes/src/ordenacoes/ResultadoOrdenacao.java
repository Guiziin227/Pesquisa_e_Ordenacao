/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ordenacoes;

/**
 *
 * @author apweb
 */
public class ResultadoOrdenacao {
    private long comparacoes;
    private long trocas;

    public ResultadoOrdenacao() {
        this.comparacoes = 0;
        this.trocas = 0;
    }

    public void incrementarComparacoes() {
        comparacoes++;
    }

    public void incrementarTrocas() {
        trocas++;
    }

    public long getComparacoes() {
        return comparacoes;
    }

    public long getTrocas() {
        return trocas;
    }
}