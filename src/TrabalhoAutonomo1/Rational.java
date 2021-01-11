package TrabalhoAutonomo1;

public class Rational implements Comparable<Rational> {
    private int numerator;
    private int denominator;

    public static void main(String[] args) {
        Rational r1 = new Rational(2, 3);
        Rational r2 = new Rational(3, 4);

        if (r1.compareTo(r2) > 0)
            System.out.println(r1 + " is bigger than " + r2);
        else if (r1.compareTo(r2) == 0)
            System.out.println(r1 + " is equal to " + r2);
        else
            System.out.println(r1 + " is not bigger than " + r2);
    }

    public Rational(int numerator, int denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
    }

    public int getNumerator() {
        return numerator;
    }

    public void setNumerator(int numerator) {
        this.numerator = numerator;
    }

    public int getDenominator() {
        return denominator;
    }

    public void setDenominator(int denominator) {
        this.denominator = denominator;
    }

    @Override
    public String toString() {
        return numerator + "/" + denominator;
    }

    /*
    @Override
    public int compareTo(Rational o) {
        if((this.getNumerator()/this.getDenominator()) > (o.getNumerator()/o.getDenominator())) {
            return 1;
        } else if((o.getNumerator()/o.getDenominator()) > (this.getNumerator()/this.getDenominator())) {
            return -1;
        }
        return 0;
    } */

    /*
    @Override
    public int compareTo(Rational o) {
        if ((this.getNumerator() * o.getDenominator()) > (o.getNumerator() * this.getDenominator())) {
            return 1;
        } else if ((o.getNumerator() * this.getDenominator()) > (this.getNumerator() * o.getDenominator())) {
            return -1;
        }
        return 0;
    } */

 /*
    // v1 prof
    @Override
    public int compareTo(Rational o) {
        double r1 = (double) this.getNumerator() / (double) this.getDenominator();
        double r2 = (double) o.getNumerator() / (double) o.getDenominator();
        if(r1 > r2) {
            return 1;
        } else if (r1 < r2) {
            return -1;
        }
        return 0;
    } */

    // v2 prof (melhor v)
    @Override
    public int compareTo(Rational o) {
        return this.getNumerator() * o.getDenominator() -
                o.getNumerator() * this.getDenominator();
    }
}



