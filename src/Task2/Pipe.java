package Task2;

public class Pipe implements Instrument{
    private int diameter;

    public Pipe() {
    }

    public Pipe(int diameter) {
        this.diameter = diameter;
    }

    public int getDiameter() {
        return diameter;
    }

    public void setDiameter(int diameter) {
        this.diameter = diameter;
    }

    @Override
    public void play() {
        System.out.println("Грає труба з з діаметром: " + diameter);
    }

    @Override
    public String toString() {
        return "Pipe{" +
                "diameter=" + diameter +
                '}';
    }
}
