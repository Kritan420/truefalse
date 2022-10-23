import java.util.ArrayList;
import java.util.Random;

public class RandNumber {
    private int value = 0;
    private int size = 0;
    Random rand = new Random();

    public RandNumber(ArrayList<Statements> list) {
        size = list.size();
        value = rand.nextInt(size);
    }

    public void newRand() {
        value = rand.nextInt(size);
    }

    public int getValue() {
        return value;
    }

}
