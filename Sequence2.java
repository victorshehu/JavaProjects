import java.util.Iterator;

public class Sequence2 implements Iterable<Integer> {

    final int start, increment, limit;
    Sequence2(int start, int increment, int limit){
            this.start = start;
            this.increment = increment;
            this.limit = limit;

    }


    @Override
    public Iterator<Integer> iterator() {
        return new Sequence2Iterator(this);
    }

    public static void main (String[] args)
    {
        for (int S : new Sequence2(0,2,30)){
            System.out.println(S);
        }

    }


}
