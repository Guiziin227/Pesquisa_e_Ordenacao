package Atividade01;

import java.util.ArrayList;
import java.util.Random;
import java.io.*;

public class Utils {
    /***
     * Método para popular uma lista com numeros aleatorios
     * @param numeros lista
     * @param qnt tamanho
     * @param inicio range
     * @param fim range
     */
    public static void popularNumerosAleatorio(ArrayList<Integer> numeros, long qnt, long inicio, long fim) {
        Random r = new Random();
        for (; qnt > 0; qnt--) {
            numeros.add(r.nextInt((int) inicio, (int)fim));
        }
    }

    /***
     * Método que gera palavras aleatórias
     * @param palavras list
     * @param qnt quantity
     * @param tamanho size
     */
    public static void popularPalavrasAleatorio(ArrayList<String> palavras,long qnt, long tamanho) {
        String letras = "acbdefghijklmnopqrstuvwxyz";
        Random r = new Random();

        for (; qnt > 0; qnt--) {
            String palavraGerada = "";
            char letraSorteada;
            for (int i = 0; i < tamanho; i++) {
                letraSorteada = letras.charAt(r.nextInt(letras.length()));
                palavraGerada = palavraGerada + letraSorteada;
            }
            palavras.add(palavraGerada);
        }

    }

    /***
     * Método que exibe lista de numeros(integer)
     * @param numeros
     */
    public static void exibirListaNumeros(ArrayList<Integer> numeros) {
        for( Integer numero : numeros ) {
            System.out.println(numero);
        }
    }

    /***
     * Método que exibe lista de palavras(strings)
     * @param strings
     */
    public static void exibirListaPalavras(ArrayList<String> strings) {
        for( String string : strings ) {
            System.out.println(string);
        }
    }

    /***
     * Método para salvar lista de números em arquivo
     * @param numeros lista de números
     * @param nomeArquivo nome do arquivo
     */
    public static void salvarNumerosArquivo(ArrayList<Integer> numeros, String nomeArquivo) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(nomeArquivo))) {
            for (Integer numero : numeros) {
                writer.write(numero.toString());
                writer.newLine();
            }
            System.out.println("Números salvos no arquivo: " + nomeArquivo);
        } catch (IOException e) {
            System.err.println("Erro ao salvar números no arquivo: " + e.getMessage());
        }
    }

    /***
     * Método para carregar lista de números de arquivo
     * @param numeros lista para carregar os números
     * @param nomeArquivo nome do arquivo
     */
    public static void carregarNumerosArquivo(ArrayList<Integer> numeros, String nomeArquivo) {
        try (BufferedReader reader = new BufferedReader(new FileReader(nomeArquivo))) {
            numeros.clear();
            String linha;
            while ((linha = reader.readLine()) != null) {
                if (!linha.trim().isEmpty()) {
                    numeros.add(Integer.parseInt(linha.trim()));
                }
            }
            System.out.println("Números carregados do arquivo: " + nomeArquivo);
        } catch (IOException e) {
            System.err.println("Erro ao carregar números do arquivo: " + e.getMessage());
        } catch (NumberFormatException e) {
            System.err.println("Erro ao converter número: " + e.getMessage());
        }
    }

    /***
     * Método para salvar lista de palavras em arquivo
     * @param palavras lista de palavras
     * @param nomeArquivo nome do arquivo
     */
    public static void salvarPalavrasArquivo(ArrayList<String> palavras, String nomeArquivo) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(nomeArquivo))) {
            for (String palavra : palavras) {
                writer.write(palavra);
                writer.newLine();
            }
            System.out.println("Palavras salvas no arquivo: " + nomeArquivo);
        } catch (IOException e) {
            System.err.println("Erro ao salvar palavras no arquivo: " + e.getMessage());
        }
    }

    /***
     * Método para carregar lista de palavras de arquivo
     * @param palavras lista para carregar as palavras
     * @param nomeArquivo nome do arquivo
     */
    public static void carregarPalavrasArquivo(ArrayList<String> palavras, String nomeArquivo) {
        try (BufferedReader reader = new BufferedReader(new FileReader(nomeArquivo))) {
            palavras.clear();
            String linha;
            while ((linha = reader.readLine()) != null) {
                if (!linha.trim().isEmpty()) {
                    palavras.add(linha.trim());
                }
            }
            System.out.println("Palavras carregadas do arquivo: " + nomeArquivo);
        } catch (IOException e) {
            System.err.println("Erro ao carregar palavras do arquivo: " + e.getMessage());
        }
    }

}
