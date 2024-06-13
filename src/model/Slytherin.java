package model;


public class Slytherin extends Hogwarts {
    private int cunning;
    private int determined;
    private int ambitious;
    private int resourcefil;
    private int powerHungry;


    public Slytherin(String name,
                     int magicalPower,
                     int transgressionDistance,
                     int cunning,
                     int determined,
                     int ambitious,
                     int resourcefil,
                     int powerHungry) {
        super(name, magicalPower, transgressionDistance);
        this.cunning = cunning;
        this.determined = determined;
        this.ambitious = ambitious;
        this.resourcefil = resourcefil;
        this.powerHungry = powerHungry;
    }

    public void printPowerDifference(Slytherin student) {
        if (this.getPower() > student.getPower()) {
            System.out.printf("%s лучший Слизериниец,чем.%s%n", this.getName(), student, getName());
        } else if (this.getPower() < student.getPower()) {
            System.out.printf("%s лучший Слизериниец чем %s%n", student.getName(), this.getName());
        } else
            System.out.printf("%s такой же Слизериниец %s%n", this.getName(), student.getName());

    }

    protected int getPower() {
        return cunning + determined + ambitious + resourcefil +powerHungry;
    }

    @Override
    public String toString() {
        return "\nSlytherin{" +
                "\nname=" + getName() +
                ",\ntransgressionDistance=" + getTransgressionDistance() +
                ",\ngetMagicalPower=" + getMagicalPower() +
                ",\ncunning=" + cunning +
                ",\ndetermined=" + determined +
                ",\nambitious=" + ambitious +
                ",\nresourcefil=" + resourcefil +
                ",\npowerHumgry=" + powerHungry +
                "} ";
    }
}
