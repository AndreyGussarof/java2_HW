package java2_HW.homework1.Obstacle;

import java2_HW.homework1.Athletes;

public class Wall extends Obstacle {
    int hight;

    public Wall(int hight) {
        this.hight = hight;
    }

    @Override
    public void doIt(Athletes athletes) {
       athletes.jump(hight);
    }
}
