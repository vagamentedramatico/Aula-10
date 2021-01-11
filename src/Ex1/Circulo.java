package Ex1;

public class Circulo implements figGeometricaPlana {
    private int raio;

    public Circulo(int raio) {
        this.raio = raio;
    }

    public int getRaio() {
        return raio;
    }

    public void setRaio(int raio) {
        this.raio = raio;
    }

    @Override
    public String getNomeFigPlana() {
        return "Circulo";
    }

    @Override
    public int getArea() {
        return (int) (Math.PI * raio * raio);
    }

    @Override
    public int gerPerimetro() {
        return (int) (2 * Math.PI * raio);
    }
}
