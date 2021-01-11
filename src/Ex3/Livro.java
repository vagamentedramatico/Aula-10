package Ex3;

import java.util.Arrays;
import java.util.Comparator;

public class Livro {
    private String nome;
    private int ano;
    private String editora;
    private String autor;

    public Livro(String nome, int ano, String editora, String autor) {
        this.nome = nome;
        this.ano = ano;
        this.editora = editora;
        this.autor = autor;
    }

    public static void main(String[] args){
        Livro[] livros = new Livro[5];
        livros[0]=new Livro("The Shinning",1990, "Texto", "Stephen King");
        livros[1]=new Livro("Harry Potter e a Pedra Filosofal", 2001, "ASA", "Joanne Rowling");
        livros[2]=new Livro("O Inferno de Dante", 1472, "Bertrand", "Dante");
        livros[3]=new Livro("Conde de Monte Cristo", 1844, "Texto", "Alexandre Dumas");
        livros[4]=new Livro("Desenhar Bases de Dados", 2016, "Texto", "Pedro Nogueira");

        printLivros(livros);

        Arrays.sort(livros, new ComparadorNome());

        printLivros(livros);

        Arrays.sort(livros, new ComparadorAutor());

        printLivros(livros);

        // ALT Comparator.comparing
        // Arrays.sort(livros, Comparator.comparing(Livro::getAutor));

    }

    public static void printLivros(Livro[] livros) {
        System.out.println("Livros: ");
        for(Livro livro : livros) {
            System.out.println(livro);
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public String getEditora() {
        return editora;
    }

    public void setEditora(String editora) {
        this.editora = editora;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    @Override
    public String toString() {
        return nome +
                ", " + ano +
                ", " + editora +
                ", " + autor;
    }
}

class ComparadorNome implements Comparator<Livro> {
    @Override
    public int compare(Livro o1, Livro o2) {
        return o1.getNome().compareTo(o2.getNome());
    }
}

class ComparadorAutor implements Comparator<Livro> {
    @Override
        public int compare(Livro o1, Livro o2) {
            return o1.getAutor().compareTo(o2.getAutor());
        }
}
