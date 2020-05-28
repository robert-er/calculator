package com.kodilla;

public class Main {

    public static void main(String[] args) {
        int a=3;
        int b=5;
        double aForSub = 4.5;
        double bForSub = 5.5;
        SimpleCalculator calculator = new SimpleCalculator(a,b);
        SimpleCalculator calcSub = new SimpleCalculator(aForSub,bForSub);

        int addResult = calculator.addAtoB();
        double subResult = calcSub.subAfromB();

        System.out.println("obiekt calculator:");
        System.out.println(calculator.getA());
        System.out.println(calculator.getB());
        System.out.println(calculator.getAForSub());
        System.out.println(calculator.getBForSub());

        System.out.println("obiekt calcSub:");
        System.out.println(calcSub.getA());
        System.out.println(calcSub.getB());
        System.out.println(calcSub.getAForSub());
        System.out.println(calcSub.getBForSub());

        System.out.println("Suma liczb " + calculator.getA() + " i " + calculator.getB() + " = " + addResult);
        System.out.println("Roznica liczb " + calcSub.getBForSub() + " - " + calcSub.getAForSub() + " = " + subResult);
    }
}
