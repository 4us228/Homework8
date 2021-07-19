package Kris.start.Money.step;

public class Man implements Jumprunable {
    private String name;
    private int jumpPower;
    private int runPower;


    public Man(String name, int jumpPower,int runPower) {
        this.name = name;
        this.jumpPower = jumpPower;
        this.runPower=runPower;
    }

    public int getRunPower() {
        return runPower;
    }

    public int getJumpPower() {
        return jumpPower;
    }

    @Override
    public void jump() {
        System.out.println(name + " jump");
    }

    @Override
    public void run() {
        System.out.println(name + " run");
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Man{" +
                "name='" + name + '\'' +
                ", jumpPower=" + jumpPower +
                '}';
    }
}
