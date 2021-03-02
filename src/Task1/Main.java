package Task1;

public class Main {
    public static void main(String[] args) {
        Printable[] printables = new Printable[6];
        printables[0] = new Book("Айвенго",40);
        printables[1] = new Book("Енеїда",30);
        printables[2] = new Book("Інструкція",20);
        printables[3] = new Magazine("Новини",10);
        printables[4] = new Magazine("ГратиХлопчик",20);
        printables[5] = new Magazine("Погода",3);

        for(Printable printable : printables){
            printable.print();
        }

        Magazine.printMagazines(printables);
    }
}
