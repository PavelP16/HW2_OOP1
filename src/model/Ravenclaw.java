package model;

public class Ravenclaw extends Hogwarts {

    private int intelligence;
    private int wisdom;
    private int wit;
    private int creativity;

    public Ravenclaw(String name,
                     int magicalPower,
                     int transgressionDistance,
                     int intelligence,
                     int wisdom,
                     int wit,
                     int creativity) {
        super(name, magicalPower, transgressionDistance);
        this.intelligence = intelligence;
        this.wisdom = wisdom;
        this.wit = wit;
        this.creativity = creativity;
    }

    public void printPowerDifference(Ravenclaw student) {
        if (this.getPower() > student.getPower()) {
            System.out.printf("%s лучший Когтевранец,чем.%s%", this.getName(), student, getName());
        } else if (this.getPower() < student.getPower()) {
            System.out.printf("%s лучший Когтевранец чем %s%n", student.getName(), this.getName());
        } else
            System.out.printf("%s такой же Когтевранец %s%n", this.getName(), student.getName());

    }

    protected int getPower() {
        return intelligence + wisdom + wit + creativity;
    }

    @Override
    public String toString() {
        return "\nRavenclaw{" +
                "\nname=" + getName() +
                ",\ntransgressionDistance=" + getTransgressionDistance() +
                ",\ngetMagicalPower=" + getMagicalPower() +
                ",\nintelligence=" + intelligence +
                ",\nwisdom=" + wisdom +
                ",\nwit=" + wit +
                ",\ncreativity=" + creativity +
                "} \n";
    }
}


