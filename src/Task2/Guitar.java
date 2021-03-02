package Task2;

public class Guitar implements Instrument{
    private int wire;

    public Guitar() {
    }

    public Guitar(int wire) {
        this.wire = wire;
    }

    public int getWire() {
        return wire;
    }

    public void setWire(int wire) {
        this.wire = wire;
    }

    @Override
    public void play() {
        System.out.println("Грає гітара з кількітю струн: " + wire);
    }

    @Override
    public String toString() {
        return "Guitar{" +
                "wire=" + wire +
                '}';
    }
}
