package Task1;

public class Book implements Printable{
    private String name;
    private int price;

    public Book() {
    }

    public Book(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }


    @Override
    public void print() {
        System.out.println("Книга" + " " + name + " Ціна: " + price);
    }

    @Override
    public String toString() {
        return "Task1.Book{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
