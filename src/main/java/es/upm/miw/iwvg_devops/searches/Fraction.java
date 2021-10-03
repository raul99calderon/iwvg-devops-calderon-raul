package es.upm.miw.iwvg_devops.searches;

import java.util.Objects;

public class Fraction {
    private int numerator;
    private int denominator;

    public Fraction(int numerator, int denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
    }

    public Fraction() {
        this(1, 1);
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

    public double decimal() {
        return (double) numerator / denominator;
    }

    public boolean isProper(){
        return this.numerator < this.denominator;
    }

    public boolean isNotProper(){
        return this.numerator > this.denominator;
    }

    public boolean isEquivalent(Fraction fraction) {
        if(this.decimal() == fraction.decimal())
            return true;
        return false;
    }

    public boolean isNegative() {
        return this.decimal() < 0;
    }

    public Fraction addition(Fraction fraction) {
        int mcm = ArithmeticUtils.mcm(this.getDenominator(),fraction.getDenominator());
        return new Fraction(mcm/this.getDenominator() * this.getNumerator() + (mcm/fraction.getDenominator()) * fraction.getNumerator(),mcm);
    }

    public Fraction substraction(Fraction fraction) {
        int mcm = ArithmeticUtils.mcm(this.getDenominator(),fraction.getDenominator());
        return new Fraction((mcm/this.getDenominator()) * this.getNumerator() - (mcm/fraction.getDenominator()) * fraction.getNumerator(),mcm);
    }

    public Fraction multiplicate(Fraction fraction) {
        return new Fraction(this.getNumerator()*fraction.getNumerator(),
                this.getDenominator()*fraction.getDenominator());
    }

    public Fraction divide(Fraction fraction) {
        return new Fraction(this.getNumerator()*fraction.getDenominator(),
                this.getDenominator()*fraction.getNumerator());
    }

    @Override
    public String toString() {
        return "Fraction{" +
                "numerator=" + numerator +
                ", denominator=" + denominator +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Fraction fraction = (Fraction) o;
        return numerator == fraction.numerator && denominator == fraction.denominator;
    }

    @Override
    public int hashCode() {
        return Objects.hash(numerator, denominator);
    }

    public int compareTo(Fraction f) {
        return Double.compare(this.decimal(), f.decimal());
    }
}
