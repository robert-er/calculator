package com.kodilla;

public class SimpleCalculator {
    private int a;
    private int b;
    private double aForSub;
    private double bForSub;

    public SimpleCalculator(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public SimpleCalculator(double aForSub, double bForSub) {
        this.aForSub=aForSub;
        this.bForSub=bForSub;
    }

    public int addAtoB () {
        return this.a+this.b;
    }

    public double subAfromB () {
        return this.bForSub-this.aForSub;
    }

    public int getA() {
        return this.a;
    }

    public int getB() {
        return this.b;
    }

    public double getAForSub() {
        return this.aForSub;
    }

    public double getBForSub() {
        return this.bForSub;
    }
}
