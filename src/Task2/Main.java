package Task2;

public class Main {
    public static void main(String[] args) {
        Instrument[] instruments = new Instrument[3];
        instruments[0] = new Guitar(20);
        instruments[1] = new Drum(30);
        instruments[2] = new Pipe(10);

        for(Instrument instrument : instruments){
            instrument.play();
        }
    }
}
