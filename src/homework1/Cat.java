package homework1;

public class Cat implements Athletes{


    String name;
    int maxJumpHeight;
    int maxRunLength;
    boolean onCompetition;



    public Cat(String name, int maxJumpHeight, int maxRunLength) {
        this.name = name;
        this.maxJumpHeight = maxJumpHeight;
        this.maxRunLength = maxRunLength;
        this.onCompetition = true;
    }

    public Cat(String name) {
        this(name,5,5);
        this.name = name;
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
