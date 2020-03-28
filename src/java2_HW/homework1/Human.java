package java2_HW.homework1;
public class Human implements Athletes {


    String name;
    int maxJumpHeight;
    int maxRunLength;
    boolean onCompetition;



    public Human(String name, int maxJumpHeight, int maxRunLength) {
        this.name = name;
        this.maxJumpHeight = maxJumpHeight;
        this.maxRunLength = maxRunLength;
        this.onCompetition = true;
    }

    public Human(String name) {
//        this(name,1,1);
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






//    private String name;
//    private double manJumpHeight ;
//    private int manRunLength ;


//    public Man(String name, double manJumpHeight, int manRunLength) {
//        this.name = name;
//        this.manJumpHeight = manJumpHeight;
//        this.manRunLength = manRunLength;
//
//    }



//    public  void jump(int wallheight) {
//        if (manJumpHeight >= wallheight ){
//            System.out.println(name + " jump " + manJumpHeight  );
//        }
//        else
//        {System.out.println(name + " can not jump "  );
//        }
//
//        System.out.println(name + " jump " + manJumpHeight  );
//    }
//
//    public  void run(int treadmillength ) {
//        if (manJumpHeight >= treadmillength ){
//            System.out.println(name + " run " + manRunLength  );
//        }
//        else
//        {System.out.println(name + " can not run "  );
//        }
//
//        System.out.println(name + " jump " + manRunLength  );
//    }

}

