package homework2;

public class MySizeArrayException extends Throwable {
    private int i;
    private int j;

    public int getI() {
        return i;
    }

    public int getJ() {
        return j;
    }

    public MySizeArrayException( int i, int j) {
        this.i = i;
        this.j = j;
        System.out.println("Массив другого размера");
    }
}
