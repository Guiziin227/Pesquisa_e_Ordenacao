import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {
    public static void main(String[] args) {

        List<Integer> lista = new ArrayList<>();


        System.out.println("SORT BOLHA");
        List<Integer> lista2 = listaAleatoria(lista,10000);
        long tempoInicio = System.nanoTime();
        Sorts.bolha(lista2);
        long tempoFim = System.nanoTime();
        System.out.println("Tempo (ms) rotina 2: " + (tempoFim - tempoInicio) / 1000000.0);

        System.out.println("SORT SELECAO");
        List<Integer> lista3 = listaAleatoria(lista,10000);
        tempoInicio = System.nanoTime();
        Sorts.selecao(lista3);
        tempoFim = System.nanoTime();
        System.out.println("Tempo (ms) rotina 3: " + (tempoFim - tempoInicio) / 1000000.0);

        System.out.println("SORT INSERCAO");
        List<Integer> lista4 = listaAleatoria(lista,10000);
        tempoInicio = System.nanoTime();
        Sorts.insercao(lista4);
        tempoFim = System.nanoTime();
        System.out.println("Tempo (ms) rotina 4: " + (tempoFim - tempoInicio) / 1000000.0);


        System.out.println("SORT PADRAO");
        List<Integer> lista1 = listaAleatoria(lista,10000);
        tempoInicio = System.nanoTime();
        lista1.sort(Integer::compareTo);
        tempoFim = System.nanoTime();
        System.out.println("Tempo (ms) rotina 1: " + (tempoFim - tempoInicio) / 1000000.0);
    }

    public static List<Integer> listaAleatoria(List<Integer> lista, int tamanho) {
        Random random = new java.util.Random();
        for (int i = 0; i < tamanho; i++) {
            lista.add(random.nextInt());
        }
        return lista;
    }
}

