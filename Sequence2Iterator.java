import java.util.Iterator;

class Sequence2Iterator implements Iterator<Integer> {
    private Sequence2 sequence;
    private  int nextVal;


    Sequence2Iterator(Sequence2 sequence) {
        this.sequence = sequence;
        this.nextVal = sequence.start;
    }

    @Override
    public boolean hasNext() {
        return this.nextVal<= sequence.limit;
    }

    @Override
    public Integer next() {
        int value = nextVal;
        nextVal += this.sequence.increment;

        return  value;
    }
}