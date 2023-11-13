import java.time.LocalDate;

public class Book extends  Product{


    private String authorFullName;

    public Book(String name, String description, int price, LocalDate data, String authorFullName) {
        super(name, description, price, data);
        this.authorFullName = authorFullName;
    }

    public String getAuthorFullName() {
        return authorFullName;
    }

    public void setAuthorFullName(String authorFullName) {
        this.authorFullName = authorFullName;
    }



    public static void allBook (Product [] products){
        System.out.println("Баардык китептер 📔📗📕: ");
        for (Product product : products){
            if (product instanceof Book){
                System.out.println(product);
            }
        }
    }

    @Override
    public String toString() {
        return super.toString() +
               "authorFullName : " + authorFullName + '\n';
    }





    }
