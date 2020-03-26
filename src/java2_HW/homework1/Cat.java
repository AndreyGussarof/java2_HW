package java2_HW.homework1;

public class Cat {
    private String name;
    private double catJumpHeight ;
    private int catRunLength ;

    public Cat(String name, double catJumpHeight, int catRunLength) {
        this.name = name;
        this.catJumpHeight = catJumpHeight;
        this.catRunLength = catRunLength;

    }

    public  void jump (int wallheight) {
        if (catJumpHeight >= wallheight ){
            System.out.println(name + " jump " + catJumpHeight  );
        }
        else
        {System.out.println(name + " can not jump "  );
        }

        System.out.println(name + " jump " + catJumpHeight  );
    }

    public  void run(int treadmillength ) {
        if (catJumpHeight >= treadmillength ){
            System.out.println(name + " run " + catRunLength  );
        }
        else
        {System.out.println(name + " can not run "  );
        }

        System.out.println(name + " jump " + catRunLength  );
    }


}
