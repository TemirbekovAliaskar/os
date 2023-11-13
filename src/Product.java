import java.time.LocalDate;
import java.util.Scanner;

public class Product {
        private String name;
        private String description;
        private int price;
        private LocalDate data;

        public Product(){}

        public Product(String name, String description, int price, LocalDate data) {
            this.name = name;
            this.description = description;
            this.price = price;
            this.data = data;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getDescription() {
            return description;
        }

        public void setDescription(String description) {
            this.description = description;
        }

        public int getPrice() {
            return price;
        }

        public void setPrice(int price) {
            this.price = price;
        }

        public LocalDate getData() {
            return data;
        }

        public void setData(LocalDate data) {
            this.data = data;
        }


    public static void addNewProduct(Product[] products, Scanner scanner) {
        while (true) {
            System.out.println("""
                    1. Add new Device
                    2. Add new Book
                    3. Back to main menu
                    """);
            System.out.println("Команданы танданыз :");
            String choice = scanner.nextLine();

            switch (choice) {
                case "1":
                    addDevice(products, scanner);
                    break;
                case "2":
                    addBook(products, scanner);
                    break;
                case "3":
                    return;
                default:
                    System.out.println("Туура эмес тандоо ! ");
            }

        }
    }

    public static void addDevice(Product[] products, Scanner scanner) {

        System.out.println("Name:");
        String name = scanner.nextLine();
        System.out.println("Description:");
        String descrip = scanner.nextLine();
        System.out.println("Price:");
            int price = scanner.nextInt();
        LocalDate data = LocalDate.now();
        scanner.nextLine();
        System.out.println("Brand:");
        String brand = scanner.nextLine();
        System.out.println("Color:");
        String color = scanner.nextLine();
        System.out.println("isNew:");
        String isNew = scanner.nextLine();
        System.out.println("Memory:");
        String memory = scanner.nextLine();

        for (int i = 0; i < products.length; i++) {
            if (products[i] == null) {
                products[i] = new Device(name, descrip, price, data, brand, color, isNew, memory);
                System.out.println("Ийгиликтуу кошулду 💻🖥📱!");
                return;
            }
        }

        System.out.println("Катачылык ! ");

    }

    public static void addBook(Product[] products, Scanner scanner) {

        System.out.println("Name:");
        String name = scanner.nextLine();
        System.out.println("Description:");
        String descrip = scanner.nextLine();
        System.out.println("Price:");
        int price = scanner.nextInt();
        LocalDate data = LocalDate.now();
        scanner.nextLine();
        System.out.println("Author:");
        String author = scanner.nextLine();

        for (int i = 0; i < products.length; i++) {
            if (products[i] == null) {
                products[i] = new Book(name, descrip, price, data, author);
                System.out.println("Ийгиликтуу кошулду  📕📕📕 !");
                return;
            }
        }

        System.out.println("Катачылык !");
    }




    public String toString() {
        return "Product : " +
               "name  :" + name + '\n' +
               "description  :" + description + '\n' +
               "price  :" + price +'\n'+
               "data  :" + data +
               ';';
    }

}
