package TrabalhoAutonomo3;

/*

Exercício 3 - Ordenação de números racionais (Interface Comparable)

Desenvolva uma classe que permita representar uma pessoa, de acordo com as seguintes indicações:
● A classe deve denominar-se Contacto;

● Deve incluir apenas um construtor, onde são passados o nome e o telefone da pessoa em questão;

● Deve disponibilizar, através de dois inspectores, a consulta do nome e telefone.

● Deve disponibilizar dois modificadores:
○ public void modificaTelefone(final int telefone), que muda o telefone da pessoa;
○ public void modificaNome(final String nome), que modifica o nome da pessoa.

● Deve redefinir o método equals e implementar o interface Comparable, sendo comparação por
ordem alfabética de nome;

● Inclua a possibilidade de pessoas com o mesmo nome serem ordenadas pelo número de telefone.

*/

public class Contacto {

    private String nome;
    private int telefone;

    public Contacto(String nome, int telefone){
        this.nome = nome;
        this.telefone = telefone;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getTelefone() {
        return telefone;
    }

    public void setTelefone(int telefone) {
        this.telefone = telefone;
    }

    /*

    ● Deve redefinir o método equals e implementar o interface Comparable, sendo comparação por
       ordem alfabética de nome;

    ● Inclua a possibilidade de pessoas com o mesmo nome serem ordenadas pelo número de telefone.

    */

    public void modificaTelefone(final int telefone) {
    }

    public void modificaNome(final String nome) {
    }

}
