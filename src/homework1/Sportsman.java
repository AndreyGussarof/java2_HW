package homework1;

public class Sportsman implements Athletes {

    String name;
    int maxJumpHeight;
    int maxRunLength;
    boolean onCompetition;

    public Sportsman(String name, int maxJumpHeight, int maxRunLength, boolean onCompetition) {
        this.name = name;
        this.maxJumpHeight = maxJumpHeight;
        this.maxRunLength = maxRunLength;
        this.onCompetition = onCompetition;
    }

    @Override
    public void run(int runLength) {

        if (runLength <= maxRunLength) {
            System.out.println(name + "was able to run" );
        } else {
            System.out.println(name + " could not run ");
            onCompetition = false;
        }

    }


    @Override
    public void jump(int jumpHeight) {

        if (jumpHeight <= maxJumpHeight) {
            System.out.println(name + " was able to jump");
        } else {
            System.out.println(name + " could not jump ");
            onCompetition = false;

        }

    }

    @Override
    public boolean onCompetition() {
        return false;
    }

    @Override
    public void info() {
        System.out.println(name + onCompetition );

    }
}
