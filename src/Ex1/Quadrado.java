package Ex1;

public class Quadrado implements figGeometricaPlana {
    private int lado;

    public Quadrado(int lado) {
        this.lado = lado;
    }

    public int getLado() {
        return lado;
    }

    public void setLado(int lado) {
        this.lado = lado;
    }

    @Override
    public String getNomeFigPlana() {
        return "Quadrado";
    }

    @Override
    public int getArea() {
        return lado * lado;
    }

    @Override
    public int gerPerimetro() {
        return lado * 4;
    }
}
