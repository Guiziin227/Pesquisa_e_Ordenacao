package atv1;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Temporizador {
    public void medirTempoDePopularListas() {
        long tempoInicio, tempoFim;

        tempoInicio = System.nanoTime();
        List<Integer> lista1 = new ArrayList<>();
        Random random = new Random();
        int min = 100;
        int max = 1000000;
        for (int i = 0; i < 100000; i++) {
            lista1.add(random.nextInt(max - min + 1) + min);
        }
        tempoFim = System.nanoTime();
        System.out.println("Tempo (ms) rotina 1: " + (tempoFim - tempoInicio) / 1000000.0);

        tempoInicio = System.nanoTime();
        List<Integer> lista2 = new ArrayList<>();
        for (int i = 0; i < 100000; i++) {
            lista2.add(i);
        }
        tempoFim = System.nanoTime();
        System.out.println("Tempo (ms) rotina 2: " + (tempoFim - tempoInicio) / 1000000.0);
    }
}