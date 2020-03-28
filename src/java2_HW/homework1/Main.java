package java2_HW.homework1;

import java2_HW.homework1.Obstacle.Obstacle;
import java2_HW.homework1.Obstacle.Run;
import java2_HW.homework1.Obstacle.Wall;

public class Main {
    public static void main(String[] args) {

        Athletes[] athletes = {
                new Human("Man1", 2, 5),
//                new Human("Man2", 1, 3),
                new Robot("T800", 1, 2),
//                new Robot("T1000", 2, 6),
                new Cat("Cat1", 1, 1),
//                new Cat("Cat2", 1, 2)
        };
        Obstacle[] obstacles = {
                new Run(2),
                new Wall(1)

        };

        for (Athletes a : athletes) {
            for (Obstacle o : obstacles) {
                o.doIt(a);
                if (!a.onCompetition()) {
                    break;
                }
            }
        }
        for (Athletes a:athletes) {
         a.info();
        }

//        Man[] manArray = new Man[4];
//        manArray [0] = new Man("Man1", 2, 5);
//        manArray [1] = new Man("Man2",1,3);
//        manArray [2] = new Man("Man3",1,3);
//        manArray [3] = new Man("Man4",1,3);
//
//        Cat[] catArray = new Cat[4];
//        catArray [0] = new Cat("Cat1", 0.5, 1);
//        catArray [1] = new Cat("Cat2",1,2);
//        catArray [2] = new Cat("Cat3",2,1);
//        catArray [3] = new Cat("Cat4",1,2);
//
//        Robot[] robotArray = new Robot[4];
//        robotArray [0] = new Robot("Robot1", 3, 5);
//        robotArray [1] = new Robot("Robot2",2,6);
//        robotArray [2] = new Robot("Robot3",0.5,1);
//        robotArray [3] = new Robot("Robot4",6,1);
//
//
//        for (Man man : manArray) {
//            man.run(5);
//            man.jump(1);
//        }
//
//        for (Cat cat : catArray) {
//            cat.run(5);
//            cat.jump(1);
//        }
//
//        for (Robot robot : robotArray) {
//            robot.run(5);
//           robot.jump(1);
//        }


    }

}


