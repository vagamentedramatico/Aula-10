package Ex2;

public class Filme implements Comparable<Filme> {
    private String nome;
    private double score;
    private int ano;

    public Filme(String nome, double score, int ano){
        this.nome = nome;
        this.score = score;
        this.ano = ano;
    }

// Ordenar filmes por data

    /*
    @Override
    public int compareTo(Filme outro) {
        return this.ano - outro.ano;
    }
    */

// Ordenar filmes por pontuação

    /*
    @Override
    public int compareTo(Filme outro) {
        if (outro.score > this.score) {
            return 1;
        } else if (this.score > outro.score) {
            return -1;
        }
        return 0;
    }
    */

// Ordenar filmes por nome

    @Override
    public int compareTo(Filme outro) {
        return this.nome.compareTo(outro.nome);
    }

    @Override
    public String toString() {
        return this.nome + " - Score IMDB: " + this.score + " - Ano: "
                + this.ano;
    }
}
