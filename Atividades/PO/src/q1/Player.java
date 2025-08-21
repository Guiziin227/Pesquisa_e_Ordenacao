package q1;

public class Player {

    private String nome;
    private Tipos tipo;

    public Player() {}

    public Player(String nome) {
        this.nome = nome;
    }

    public Player(String nome, Tipos tipo) {
        this.nome = nome;
        this.tipo = tipo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Tipos getTipo() {
        return tipo;
    }

    public void setTipo(Tipos tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "Player{" +
                "nome='" + nome + '\'' +
                ", tipo=" + tipo +
                '}';
    }
}
