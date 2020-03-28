package java2_HW.homework1.Obstacle;

import java2_HW.homework1.Athletes;

public class Run extends Obstacle {
    int length;

    public Run(int length) {
        this.length = length;
    }

    @Override
    public void doIt(Athletes athletes) {
        athletes.run(length);
    }
}
