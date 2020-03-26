package java2_HW.homework1;

public class Main {
    public static void main(String[] args) {
        Man[] manArray = new Man[4];
        manArray [0] = new Man("Man1", 2, 5);
        manArray [1] = new Man("Man2",1,3);
        manArray [2] = new Man("Man3",1,3);
        manArray [3] = new Man("Man4",1,3);

        Cat[] catArray = new Cat[4];
        catArray [0] = new Cat("Cat1", 0.5, 1);
        catArray [1] = new Cat("Cat2",1,2);
        catArray [2] = new Cat("Cat3",2,1);
        catArray [3] = new Cat("Cat4",1,2);

        Robot[] robotArray = new Robot[4];
        robotArray [0] = new Robot("Robot1", 3, 5);
        robotArray [1] = new Robot("Robot2",2,6);
        robotArray [2] = new Robot("Robot3",0.5,1);
        robotArray [3] = new Robot("Robot4",6,1);


        for (Man man : manArray) {
            man.run(5);
            man.jump(1);
        }

        for (Cat cat : catArray) {
            cat.run(5);
            cat.jump(1);
        }

        for (Robot robot : robotArray) {
            robot.run(5);
           robot.jump(1);
        }





        
//        manArray[0].jump(5);




    }

}


