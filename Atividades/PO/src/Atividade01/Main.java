package Atividade01;

import java.util.ArrayList;

/***
 * @author Guilherme Weber Henriques
 */
public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> listNumeros = new ArrayList<>();
        ArrayList<String> listPalavras = new ArrayList<>();

        Utils.popularNumerosAleatorio(listNumeros,5,20,30);
        System.out.println("Números gerados:");
        Utils.exibirListaNumeros(listNumeros);

        Utils.salvarNumerosArquivo(listNumeros, "./PO/numeros.txt");

        System.out.println("\nLista 2 - Cópia dos números:");
        ArrayList<Integer> list2Numeros = new ArrayList<>(listNumeros);
        Utils.exibirListaNumeros(list2Numeros);

        Utils.popularPalavrasAleatorio(listPalavras,5,5);
        System.out.println("\nPalavras geradas:");
        Utils.exibirListaPalavras(listPalavras);

        Utils.salvarPalavrasArquivo(listPalavras, "./PO/palavras.txt");

        System.out.println("\n--- Testando carregamento de arquivos ---");

        ArrayList<Integer> numerosCarregados = new ArrayList<>();
        Utils.carregarNumerosArquivo(numerosCarregados, "./PO/numeros.txt");
        System.out.println("Números carregados do arquivo:");
        Utils.exibirListaNumeros(numerosCarregados);

        ArrayList<String> palavrasCarregadas = new ArrayList<>();
        Utils.carregarPalavrasArquivo(palavrasCarregadas, "./PO/palavras.txt");
        System.out.println("\nPalavras carregadas do arquivo:");
        Utils.exibirListaPalavras(palavrasCarregadas);
    }
}

