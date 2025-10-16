/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package principal;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import java.util.Random;
import java.util.Scanner;


class Util{
    
    public static int geraHash(int numero, int tam){
        int hash = numero % tam;
        return hash;
    }

}
    

public class Principal {
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        ArrayList<Integer>[] tabela = new ArrayList[10];
      
        for(int i = 0; i < tabela.length; i++){
            tabela[i] = new ArrayList<>();
        }

        
        for(int i = 0; i < 5; i++){
            int numero = sc.nextInt();

            int hash = Util.geraHash(numero,tabela.length);
            System.out.println("Endereco gerado: "+hash);

            if (!tabela[hash].contains(numero)) {
                tabela[hash].add(numero); 
            } else {
                System.out.println("Número " + numero + " já esta na tabela.");
            }
        }
        
        
        for (List<Integer> linha : tabela) {
            System.out.println(linha);
        }

       System.out.print("Qual Numero quer procurar? ");
        int numeroBusca = sc.nextInt();
        int addrBusca = Util.geraHash(numeroBusca, tabela.length);

        if (tabela[addrBusca].contains(numeroBusca)) {
            System.out.println("Numero " + numeroBusca + " encontrado na posicao: " + addrBusca);
        } else {
            System.out.println("Numero " + numeroBusca + " nao encontrado.");
        }


        System.out.print("Qual Numero quer remover? ");
        int numeroRemove = sc.nextInt();
        int addrRemove = Util.geraHash(numeroRemove, tabela.length);

        if (tabela[addrRemove].contains(numeroRemove)) {
            tabela[addrRemove].remove(numeroRemove); 
            System.out.println("Numero " + numeroRemove + " removido.");
        } else {
            System.out.println("Numero " + numeroRemove + " nao encontrado para remocao.");
        }
        
        
        for (List<Integer> linha : tabela) {
            System.out.println(linha);
        }
        
 
    }
    
}
