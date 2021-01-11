package TrabalhoAutonomo2;

/*

Exercício 2 - Ordenação de números racionais (Interface Comparator)

Crie uma classe Aluno e implemente dois comparadores diferentes para essa classe: um que compara
por número de aluno; outro que compara por nome do aluno. Experimente ordenar uma lista de
alunos usando primeiro um comparador.

*/

import java.util.Arrays;
import java.util.Comparator;

public class Aluno {
    private int numero;
    private String nome;

    public Aluno(int numero, String nome) {
        this.numero = numero;
        this.nome = nome;
    }

    public static void main(String[] args) {
        Aluno[] alunos = new Aluno[6];
        alunos[0] = new Aluno(13, "Rosalia");
        alunos[1] = new Aluno(1, "Fever Ray");
        alunos[2] = new Aluno(9, "Matt");
        alunos[3] = new Aluno(7, "St Pepsi");
        alunos[4] = new Aluno(2, "Azealia");
        alunos[5] = new Aluno(4, "Bart");

        printAluno(alunos);
        Arrays.sort(alunos, new ComparadorNomes());
        printAluno(alunos);
        Arrays.sort(alunos, new ComparadorNumero());
        printAluno(alunos);

    }

    public static void printAluno(Aluno[] alunos) {
        System.out.println();
        for(Aluno aluno : alunos){
            System.out.println(aluno);
        }
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Aluno numero " + numero +
                ", " + nome;
    }
}

class ComparadorNomes implements Comparator<Aluno>{
    // comparator nomes
    @Override
    public int compare(Aluno o1, Aluno o2) {
        return o1.getNome().compareTo(o2.getNome());
    }
}

class ComparadorNumero implements Comparator<Aluno>{
    // comparator numero
    @Override
    public int compare(Aluno o1, Aluno o2) {
        return o1.getNumero() - (o2.getNumero());
    }
}
