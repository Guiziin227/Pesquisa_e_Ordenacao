import random;

class Utils:
    @staticmethod
    def popular_numeros_aleatorio(numerosList, quantidade, inicio, fim):
        for _ in range(quantidade):
            numerosList.append(random.randint(inicio,fim))

    @staticmethod
    def popular_palavras_aleatorio(palavrasList, quantidade, tamanho):
        letras = "abcdefghijklmnopqrstuvwxyz"
        for _ in range(quantidade):
            palavraGerada = ""
            for _ in range(tamanho):
                letraSorteada = random.choice(letras)
                palavraGerada += letraSorteada
            palavrasList.append(palavraGerada)

    @staticmethod
    def exibir_numeros(numerosList):
        for n in numerosList:
            print(n)

    @staticmethod
    def exibir_palavras(palavrasList):
        for palavra in palavrasList:
            print(palavra)

    