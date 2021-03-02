package Task1;

public class Magazine implements Printable{
    private String name;
    private int pages;

    public Magazine() {
    }

    public Magazine(String name, int pages) {
        this.name = name;
        this.pages = pages;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public static void printMagazines(Printable[] printable){
        for(Printable printable1 : printable){
            if(printable1 instanceof Magazine){
                System.out.println(printable1);
            }
        }
    }

    @Override
    public void print() {
        System.out.println("Журнал " + "Назва " + name + " " + "К-сть Cторінок: " + pages);
    }


    @Override
    public String toString() {
        return "Task1.Magazine{" +
                "name='" + name + '\'' +
                ", pages=" + pages +
                '}';
    }
}
