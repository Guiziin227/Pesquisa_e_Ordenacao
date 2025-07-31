using System;
using System.Collections;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace PeO
{
    internal class Utils
    {

        public static void popularNumerosAleatorio(List<int> numeros, long qnt, long inicio, long fim)
        {
            Random rand = new Random();
            for (; qnt > 0; qnt--) { 
                numeros.Add(rand.Next((int)inicio,(int)fim));
            }

        }

        public static void popularPalavrasAleatorio(List<string> palavras, long qnt, long tamanho)
        {
            String letras = "acbdefghijklmnopqrstuvwxyz";
            Random r = new Random();

            for (; qnt > 0; qnt--)
            {
                String palavraGerada = "";
                char letraSorteada;
                for (int i = 0; i < tamanho; i++)
                {
                    letraSorteada = letras.ElementAt(r.Next(letras.Length));
                    palavraGerada = palavraGerada + letraSorteada;
                }
                palavras.Add(palavraGerada);
            }

        }



        public static void exibirNumeros(List<int> numeros)
        {
            foreach(int i in numeros)
            {
                Console.WriteLine(i);
            }
        }

        public static void exibirLetras(List<string> palavras)
        {
            foreach (string i in palavras)
            {
                Console.WriteLine(i);
            }
        }


    }
}
