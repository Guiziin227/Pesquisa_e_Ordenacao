// AlgoritmosOrdenacao.java
package ordenacoes;
import ordenacoes.ResultadoOrdenacao;

import java.util.*;

public class AlgoritmosOrdenacao {

    public ResultadoOrdenacao ordenar(String metodo, List<Integer> numeros) {
        switch (metodo.toLowerCase()) {
            case "selecao": return ordenacaoSelecao(numeros);
            case "bolha": return ordenacaoBolha(numeros);
            case "insercao": return ordenacaoInsercao(numeros);
            case "shell": return ordenacaoShell(numeros);
            case "pente": return ordenacaoPente(numeros);
            case "agitacao": return ordenacaoAgitacao(numeros);
            case "quick": return ordenacaoRapida(numeros);
            default: throw new IllegalArgumentException("Método não encontrado: " + metodo);
        }
    }

    private ResultadoOrdenacao ordenacaoSelecao(List<Integer> vetor) {
        ResultadoOrdenacao resultado = new ResultadoOrdenacao();
        int tamanho = vetor.size();

        for (int i = 0; i < tamanho - 1; i++) {
            int indiceMenor = i;
            for (int j = i + 1; j < tamanho; j++) {
                resultado.incrementarComparacoes();
                if (vetor.get(j) < vetor.get(indiceMenor)) {
                    indiceMenor = j;
                }
            }
            if (indiceMenor != i) {
                Collections.swap(vetor, i, indiceMenor);
                resultado.incrementarTrocas();
            }
        }

        return resultado;
    }

    private ResultadoOrdenacao ordenacaoBolha(List<Integer> vetor) {
        ResultadoOrdenacao resultado = new ResultadoOrdenacao();
        int tamanho = vetor.size();

        for (int i = 0; i < tamanho - 1; i++) {
            for (int j = 0; j < tamanho - i - 1; j++) {
                resultado.incrementarComparacoes();
                if (vetor.get(j) > vetor.get(j + 1)) {
                    Collections.swap(vetor, j, j + 1);
                    resultado.incrementarTrocas();
                }
            }
        }

        return resultado;
    }

    private ResultadoOrdenacao ordenacaoInsercao(List<Integer> vetor) {
        ResultadoOrdenacao resultado = new ResultadoOrdenacao();

        for (int i = 1; i < vetor.size(); i++) {
            int chave = vetor.get(i);
            int j = i - 1;

            while (j >= 0) {
                resultado.incrementarComparacoes();
                if (vetor.get(j) > chave) {
                    vetor.set(j + 1, vetor.get(j));
                    resultado.incrementarTrocas();
                    j--;
                } else {
                    break;
                }
            }
            vetor.set(j + 1, chave);
        }

        return resultado;
    }

    private ResultadoOrdenacao ordenacaoShell(List<Integer> vetor) {
        ResultadoOrdenacao resultado = new ResultadoOrdenacao();
        int tamanho = vetor.size();

        for (int intervalo = tamanho / 2; intervalo > 0; intervalo /= 2) {
            for (int i = intervalo; i < tamanho; i++) {
                int temporario = vetor.get(i);
                int j;

                for (j = i; j >= intervalo; j -= intervalo) {
                    resultado.incrementarComparacoes();
                    if (vetor.get(j - intervalo) > temporario) {
                        vetor.set(j, vetor.get(j - intervalo));
                        resultado.incrementarTrocas();
                    } else {
                        break;
                    }
                }
                vetor.set(j, temporario);
            }
        }

        return resultado;
    }

    private ResultadoOrdenacao ordenacaoPente(List<Integer> vetor) {
        ResultadoOrdenacao resultado = new ResultadoOrdenacao();
        int tamanho = vetor.size();
        int intervalo = tamanho;
        boolean trocou = true;

        while (intervalo != 1 || trocou) {
            intervalo = Math.max(1, (intervalo * 10) / 13);
            trocou = false;

            for (int i = 0; i < tamanho - intervalo; i++) {
                resultado.incrementarComparacoes();
                if (vetor.get(i) > vetor.get(i + intervalo)) {
                    Collections.swap(vetor, i, i + intervalo);
                    resultado.incrementarTrocas();
                    trocou = true;
                }
            }
        }

        return resultado;
    }

    private ResultadoOrdenacao ordenacaoAgitacao(List<Integer> vetor) {
        ResultadoOrdenacao resultado = new ResultadoOrdenacao();
        int tamanho = vetor.size();
        boolean trocou = true;
        int inicio = 0;
        int fim = tamanho - 1;

        while (trocou) {
            trocou = false;

            for (int i = inicio; i < fim; i++) {
                resultado.incrementarComparacoes();
                if (vetor.get(i) > vetor.get(i + 1)) {
                    Collections.swap(vetor, i, i + 1);
                    resultado.incrementarTrocas();
                    trocou = true;
                }
            }

            if (!trocou) break;

            fim--;
            trocou = false;

            for (int i = fim - 1; i >= inicio; i--) {
                resultado.incrementarComparacoes();
                if (vetor.get(i) > vetor.get(i + 1)) {
                    Collections.swap(vetor, i, i + 1);
                    resultado.incrementarTrocas();
                    trocou = true;
                }
            }

            inicio++;
        }

        return resultado;
    }

    private ResultadoOrdenacao ordenacaoRapida(List<Integer> vetor) {
        ResultadoOrdenacao resultado = new ResultadoOrdenacao();
        quickSortAuxiliar(vetor, 0, vetor.size() - 1, resultado);
        return resultado;
    }

    private void quickSortAuxiliar(List<Integer> vetor, int baixo, int alto, ResultadoOrdenacao resultado) {
        if (baixo < alto) {
            int indicePivo = particionar(vetor, baixo, alto, resultado);
            quickSortAuxiliar(vetor, baixo, indicePivo - 1, resultado);
            quickSortAuxiliar(vetor, indicePivo + 1, alto, resultado);
        }
    }

    private int particionar(List<Integer> vetor, int baixo, int alto, ResultadoOrdenacao resultado) {
        int pivo = vetor.get(alto);
        int i = baixo - 1;

        for (int j = baixo; j < alto; j++) {
            resultado.incrementarComparacoes();
            if (vetor.get(j) < pivo) {
                i++;
                Collections.swap(vetor, i, j);
                resultado.incrementarTrocas();
            }
        }

        Collections.swap(vetor, i + 1, alto);
        resultado.incrementarTrocas();
        return i + 1;
    }
}