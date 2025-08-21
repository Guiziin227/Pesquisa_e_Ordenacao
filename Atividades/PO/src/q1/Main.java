package q1;

import java.util.Random;

public class Main {
    public static void main(String[] args) {

        Player player1 = new Player("Gui");
        Player player2 = new Player("Malu");

        System.out.println(player1.getNome());

        apostar(player1, player2);
        System.out.println(player1);
        System.out.println(player2);

        resultado(player1, player2);
    }

    public static void resultado(Player player1, Player player2) {
        Tipos tipo1 = player1.getTipo();
        Tipos tipo2 = player2.getTipo();

        if (tipo1 == tipo2) {
            System.out.println("Empate");
        } else if ((tipo1 == Tipos.PEDRA && tipo2 == Tipos.TESOURA) ||
                (tipo1 == Tipos.TESOURA && tipo2 == Tipos.PAPEL) ||
                (tipo1 == Tipos.PAPEL && tipo2 == Tipos.PEDRA)) {
            System.out.println(player1.getNome() + " venceu!");
        } else {
            System.out.println(player2.getNome() + " venceu!");
        }
    }

    public static void apostar(Player player1, Player player2) {
        player1.setTipo(aposta());
        player2.setTipo(aposta());
    }

    private static Tipos aposta() {
        return Tipos.values()[new Random().nextInt(Tipos.values().length)];
    }
}
