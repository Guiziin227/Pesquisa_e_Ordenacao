/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ordenacoes;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;

/**
 *
 * @author apweb
 */
public class Ordenacoes {

        public static void main(String[] args) {
            Random random = new Random();
            String nomeArquivo = "numeros.txt";

            try (FileWriter writer = new FileWriter(nomeArquivo)) {
                for (int i = 0; i < 2000; i++) { //
                    int numero = random.nextInt(1000);
                    writer.write(numero + "\n");
                }
                System.out.println("Arquivo '" + nomeArquivo + "' gerado com sucesso!");
            } catch (IOException e) {
                System.out.println("Erro ao escrever no arquivo: " + e.getMessage());
            }
        }

}
