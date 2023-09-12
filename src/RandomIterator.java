import java.util.Iterator;
import java.util.Random;

public class RandomIterator implements Iterator<Integer> {

    Random random;
    int min;
    int max;

    public RandomIterator(int min, int max, Random random) {
        this.random = random;
        this.min = min;
        this.max = max;
    }

    @Override
    public boolean hasNext() {
        return true;
    }

    @Override
    public Integer next() {
        return Integer.valueOf(random.nextInt(min,max));
    }
}
