import java.util.Collections;
import java.util.Comparator;

public class LambdaTest {
    public static void main(String[] args) {
        Comparator bookComparator= Comparator.comparing(Book::getPrice);
        Comparator<Book> bookComparator2=(b1,b2)->{
            return(b1.getPrice().compareTo(b2.getPrice()));
        };
        Book book1=new Book("aaa",1);
        Book book2=new Book("bbb",2);
        System.out.println(bookComparator.compare(book1,book2));
        System.out.println(bookComparator2.compare(book1,book2));
    }

}
class Book{
    private String name;
    private Integer price;

    public Book(String name, Integer price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }
}
