package Kris.start.Money.step;

public class Main {

    public static void main(String[] args) {


        Jumprunable[] players = new Jumprunable[2];
        Man man = new Man("Andrey", 1,350);
        Cat cat = new Cat("Tom", 3, 250);
        Robbot robbot = new Robbot("T-200", 5, 1000);

        Walltracable[] walltracables = new Walltracable[1];
        Wall wall = new Wall(2);
        Track track = new Track(300);

        wall.checkMan(man);
        wall.checkCat(cat);
        wall.checkRobbot(robbot);
        track.checkMan(man);
        track.checkCat(cat);
        track.checkRobbot(robbot);


    }
}