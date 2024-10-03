package Entity;

public class Book {
    private String name;
    private Author author;
    private Double price;
    private int quantity;

    public Book(){;}
    public Book(String name, Author author, Double price, int quantity) {
        this.name = name;
        this.author = author;
        this.price = price;
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "{" +
                "name:'" + name + '\'' +
                "   author:" + author.getName() +
                "   price:" + price +
                "   quantity:" + quantity +
                '}';
    }

}
