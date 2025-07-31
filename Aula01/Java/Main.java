import java.util.ArrayList;

/***
 * @author Guilherme Weber Henriques
 */
public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> listNumeros = new ArrayList<>();
        ArrayList<String> listPalavras = new ArrayList<>();

        Utils.popularNumerosAleatorio(listNumeros,5,20,30);
        Utils.exibirListaNumeros(listNumeros);

        System.out.println("Lista 2");
        ArrayList<Integer> list2Numeros = new ArrayList<>(listNumeros);
        Utils.exibirListaNumeros(list2Numeros);


        Utils.popularPalavrasAleatorio(listPalavras,5,5);
        Utils.exibirListaPalavras(listPalavras);
    }
}