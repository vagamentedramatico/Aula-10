package Ex1;

public class Cilindro implements figGeometricaTri {
    private int altura;
    private int raio;

    public Cilindro(int altura, int raio){
        this.altura = altura;
        this.raio = raio;
    }

    public int getRaio() {
        return raio;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public void setRaio(int raio) {
        this.raio = raio;
    }

    @Override
    public String getNomeFigTri() {
        return "Cilndro";
    }

    @Override
    public int getAltura() {
        return altura;
    }

    @Override
    public int getvolume() {
        Circulo base = new Circulo(raio);
        return base.getArea() * altura;
    }
}
