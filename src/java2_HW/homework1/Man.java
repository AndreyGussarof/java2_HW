package java2_HW.homework1;
public class Man {
    private String name;
    private double manJumpHeight ;
    private int manRunLength ;


    public Man(String name, double manJumpHeight, int manRunLength) {
        this.name = name;
        this.manJumpHeight = manJumpHeight;
        this.manRunLength = manRunLength;

    }



    public  void jump(int wallheight) {
        if (manJumpHeight >= wallheight ){
            System.out.println(name + " jump " + manJumpHeight  );
        }
        else
        {System.out.println(name + " can not jump "  );
        }

        System.out.println(name + " jump " + manJumpHeight  );
    }

    public  void run(int treadmillength ) {
        if (manJumpHeight >= treadmillength ){
            System.out.println(name + " run " + manRunLength  );
        }
        else
        {System.out.println(name + " can not run "  );
        }

        System.out.println(name + " jump " + manRunLength  );
    }

}

