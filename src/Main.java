import model.*;

public class Main {
    public static void main(String[] args) {
        Griffindor hermioneGranger = new Griffindor("Hermione Granger", 5, 5, 5, 6,6);
        Griffindor ronWeasley = new Griffindor("Ron Weasley", 7, 8, 7, 6,6);
        Slytherin dracoMalfoy = new Slytherin("Draco Malfoy", 5,5,5, 5, 5, 6,6);
        Hufflepuff сedricDiggory = new Hufflepuff("Cedric Diggory", 5, 5, 5, 6,6);
        Ravenclaw zlatopustLocons = new Ravenclaw("Zlatopust Locons", 5, 5, 5, 5, 6, 6);
        Hogwarts gari = new Hogwarts("Harry", 7, 6);
        Hogwarts john = new Hogwarts("John", 7, 6);

        System.out.println(hermioneGranger);
        System.out.println(ronWeasley);
        System.out.println(dracoMalfoy);
        System.out.println(сedricDiggory);
        System.out.println(zlatopustLocons);

        hermioneGranger.printPowerDifference(ronWeasley);

        gari.printPowerDifference(john);






    }
}
