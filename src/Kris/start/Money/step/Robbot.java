package Kris.start.Money.step;

public class Robbot implements Jumprunable {
    private String name;
    private int jumpPower;
    private int runPower;

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

    public int getJumpPower() {
        return jumpPower;
    }

    public int getRunPower() {
        return runPower;
    }

    public Robbot(String name, int jumpPower, int runPower) {
        this.name = name;
        this.jumpPower = jumpPower;
        this.runPower = runPower;
    }
}
