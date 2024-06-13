package model;

import java.util.Objects;

public class Hogwarts {

    private String name;
    private int magicalPower;
    private int transgressionDistance;


    public Hogwarts(String name, int magicalPower, int transgressionDistance) {
        this.name = name;
        this.magicalPower = magicalPower;
        this.transgressionDistance = transgressionDistance;
    }

    public String getName() {
        return name;
    }

    public int getMagicalPower() {
        return magicalPower;
    }

    public int getTransgressionDistance() {
        return transgressionDistance;
    }

    public void printPowerDifference(Hogwarts student) {
        if (this.getPower() > student.getPower()) {
            System.out.printf(getPowerDifferenceResult(this.getName(), student.getName(),false));
        } else if (this.getPower() < student.getPower()) {
            System.out.printf(getPowerDifferenceResult(student.getName(),this.getName(),false));
        } else
            System.out.printf(getPowerDifferenceResult(this.getName(), student.getName(),true));

    }

    protected String getPowerDifferenceResult(String winner, String looser, boolean isDraw) {
        if (isDraw) {
            return String.format ("%s обладает такой же мощностью магии, %s %n", winner,looser);
        }
        return String.format("%s обладает большей мощностью маги,чем.%s %n", winner, looser);
    }


    protected int getPower() {
        return magicalPower + transgressionDistance;
    }




    @Override
    public String toString() {
        return "\nHogwarts{" +
                "name='" + name + '\'' +
                ",magicalPower=" + magicalPower +
                ", transgressionDistance=" + transgressionDistance +
                '}';
    }
}
