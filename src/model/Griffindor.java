package model;

public class Griffindor extends Hogwarts {
    private int nobility;
    private int honor;
    private int bravery;


    public Griffindor(String name,
                      int magicalPower,
                      int transgressionDistance,
                      int nobility,
                      int honer,
                      int bravery) {
        super(name, magicalPower, transgressionDistance);
        this.nobility = nobility;
        this.honor = honer;
        this.bravery = bravery;
    }

    public void printPowerDifference(Griffindor student) {
        if (this.getPower() > student.getPower()) {
            System.out.printf("%s лучший Гриффиндорец,чем.%s%n", this.getName(), student.getName());
        } else if (this.getPower() < student.getPower()) {
            System.out.printf("%s лучший Грифиндорец чем %s%n", student.getName(), this.getName());
        } else
            System.out.printf("%s такой же Гриффиндорец %s%n", this.getName(), student.getName());

    }

    protected int getPower() {
        return nobility + honor + bravery;
    }


    @Override
    public String toString() {
        return "\nGriffindor{" +
                "\nname=" + getName() +
                ",\ntransgressionDistance=" + getTransgressionDistance() +
                ",\ngetMagicalPower=" + getMagicalPower() +
                ",\nnobility=" + nobility +
                ",\nhoner=" + honor +
                ",\nbravery=" + bravery +
                "}\n";
    }
}
