package model;


public class Hufflepuff extends Hogwarts {
    private int diligence;
    private int loyalty;
    private int nonesty;


    public Hufflepuff(String name,
                      int magicalPower,
                      int transgressionDistance,
                      int diligence,
                      int loyalty,
                      int nonesty) {
        super(name, magicalPower, transgressionDistance);
        this.diligence = diligence;
        this.loyalty = loyalty;
        this.nonesty = nonesty;
    }


    public void printPowerDifference(Hufflepuff student) {
        if (this.getPower() > student.getPower()) {
            System.out.printf("%s лучший Пуфендуец,чем.%s%n", this.getName(), student, getName());
        } else if (this.getPower() < student.getPower()) {
            System.out.printf("%s лучший Пуфендуец чем %s%n", student.getName(), this.getName());
        } else
            System.out.printf("%s такой же Пуфендуец %s%n", this.getName(), student.getName());

    }

    protected int getPower() {
        return diligence + loyalty + nonesty;
    }

    @Override
    public String toString() {
        return "\nHufflepuff{" +
                "\nname=" + getName() +
                ",\ntransgressionDistance=" + getTransgressionDistance() +
                ",\ngetMagicalPower=" + getMagicalPower() +
                ",\ndiligence=" + diligence +
                ",\nloyalty=" + loyalty +
                ",\nbravery=" + nonesty +
                "} ";
    }


}
