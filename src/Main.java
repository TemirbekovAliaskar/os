import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Product[] products = new Product[20];
        boolean isTrue = false;
        User user = new User();

        while (true) {
            if (!isTrue) {
                System.out.println("""
                        📌1. Register 
                        🔍2. Login
                        ⚔ 3. Exit
                        """);
                System.out.println("Команданы танданыз : ");
            } else {
                System.out.println("""
                        0. Logout
                        1. Add new product
                        2. Get all product
                        3. Get all book
                        4. Get all device
                        """);
                System.out.println("Команданы танданыз :");
            }

            if (!isTrue) {
                switch (scanner.nextLine()) {
                    case "1":
                        user.register();
                        break;
                    case "2":
                        isTrue = true;
                        user.login();
                        break;
                    case "3":
                        System.exit(0);
                        break;
                    default:
                        System.err.println("Error ❌❌❌!");
                }
            } else {
                switch (scanner.nextLine()) {
                    case "0":
                        isTrue = false;
                        break;
                    case "1":
                        Product.addNewProduct(products,scanner);
                        break;
                    case "2":
                        for (Product pr : products) {
                            if (pr != null) {
                                System.out.println(pr);
                            }
                        }
                        break;
                    case "3":
                        Book.allBook(products);
                        break;
                    case "4":
                        Device.allDevice(products);
                        break;
                    default:
                        System.out.println("Туура эмес тандоо ❌❌❌!");
                }
            }
        }
    }

}