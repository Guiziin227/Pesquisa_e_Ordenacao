import java.util.ArrayList;
import java.util.Random;

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

}
