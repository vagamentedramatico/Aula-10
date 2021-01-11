package Ex2;

import java.util.Arrays;

public class Main {
    public static void main(String[] args){

        Filme[] filmes = new Filme[3];
        filmes[0] = new Filme("Star Wars: Return of the Jedi",
                9.2, 1983);
        filmes[1] = new Filme("Star Wars: Empire Strikes Back",
                7.8, 1980);
        filmes[2] = new Filme("Senhor dos Aneis",
                9.5, 2001);

        Arrays.sort(filmes);

        for(Filme filme : filmes) {
            System.out.println(filme);
        }

    }
}
