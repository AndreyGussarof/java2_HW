package java2_HW.homework1;

public class Robot {
    private String name;
    private double robotJumpHeight ;
    private int robotRunLength ;


    public Robot(String name, double robotJumpHeight, int robotRunLength) {
        this.name = name;
        this.robotJumpHeight = robotJumpHeight;
        this.robotRunLength = robotRunLength;


    }
    public  void jump (int wallheight) {
        if (robotJumpHeight >= wallheight ){
            System.out.println(name + " jump " + robotJumpHeight  );
        }
        else
        {System.out.println(name + " can not jump "  );
        }

        System.out.println(name + " jump " + robotJumpHeight  );
    }

    public  void run(int treadmillength ) {
        if (robotJumpHeight >= treadmillength ){
            System.out.println(name + " run " + robotRunLength  );
        }
        else
        {System.out.println(name + " can not run "  );
        }

        System.out.println(name + " jump " + robotRunLength  );
    }
}
