package Kris.start.Money.step;

public class Wall implements Walltracable {
    private int size;


    public Wall(int size) {
        this.size = size;
    }

    public void checkMan(Man man) {

        if (man.getJumpPower() >= size && man.getJumpPower() > 0) {
            System.out.println(man.getName() + " перепрыгнул");
        } else {
            System.out.println(man.getName() + " не перепрыгнул");
        }

    }

    @Override
    public void checkCat(Cat cat) {
        if (cat.getJumpPower() >= size && cat.getJumpPower() > 0) {
            System.out.println(cat.getName() + " перепрыгнул");

        } else {
            System.out.println(cat.getName() + " не перепрыгнул");
        }


    }

    @Override
    public void checkRobbot(Robbot robbot) {
        if (robbot.getJumpPower() >= size && robbot.getJumpPower() > 0) {
            System.out.println(robbot.getName() + " перепрыгнул");
        } else {
            System.out.println(robbot.getName() + " не перепрыгнул");
        }

    }


}
