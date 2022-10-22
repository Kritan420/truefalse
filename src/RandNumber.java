import java.util.ArrayList;
import java.util.Random;

public class RandNumber {
    private int value = 0;
    private int size = 0;
    

    public RandNumber(ArrayList<Statements> list) {
        Random rand = new Random();
        size = list.size();
        value = rand.nextInt(size);
    }

    public void newRand() {
        Random rand = new Random();
        value = rand.nextInt(size);
    }

    public int getValue() {
        return value;
    }

}
