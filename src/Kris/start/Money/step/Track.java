package Kris.start.Money.step;

public class Track implements Walltracable {
    private int lengs;


    @Override
    public void checkMan(Man man) {
        if (man.getRunPower() >= lengs && man.getRunPower() > 0) {
            System.out.println(man.getName() + " пробежал");
        } else {
            System.out.println(man.getName() + " не пробежал");
        }
    }

    @Override
    public void checkCat(Cat cat) {
        if (cat.getRunPower() >= lengs && cat.getRunPower() > 0) {
            System.out.println(cat.getName() + " пробежал");

        } else {
            System.out.println(cat.getName() + " не пробежал");
        }
    }

    @Override
    public void checkRobbot(Robbot robbot) {
        if (robbot.getRunPower() >= lengs && robbot.getRunPower() > 0) {
            System.out.println(robbot.getName() + " пробежал");
        } else {
            System.out.println(robbot.getName() + " не пробежал");
        }
    }

    public Track(int lengs) {
        this.lengs = lengs;
    }
}
