// See https://aka.ms/new-console-template for more information
using System.Collections;
using PeO;

namespace PeO
{
   class Program
    {
        static void Main(string[] args)
        {
            Console.WriteLine("Hello, World!");

            List<int> listArray = new List<int>();
            List<string> listPalavras = new List<string>();


            Utils.popularNumerosAleatorio(listArray, 5, 20, 30);
            Utils.exibirNumeros(listArray);

            Console.WriteLine("Lista 2");
            List<int> list2Numeros = new List<int>(listArray);
            Utils.exibirNumeros(list2Numeros);


            Utils.popularPalavrasAleatorio(listPalavras, 5, 5);
            Utils.exibirLetras(listPalavras);
        }
    }
}
