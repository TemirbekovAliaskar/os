import java.util.Scanner;

public class User {

    private String firstName;
    private String lastName;
    private String email;
    private String password;
    private Product product;


    public User(){}

    public User(String firstName, String lastName, String email, String password, Product product) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.password = password;
        this.product = product;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    @Override
    public String toString() {
        return "User :" +
               "firstName :'" + firstName + '\'' +
               "lastName :'" + lastName + '\n' +
               "email : " + email + '\n' +
               "password :" + password + '\n' +
               "product : " + product +
               '\n';
    }



    Scanner scanner = new Scanner(System.in);

    User [] user = new User[10];
    int count = 0;
    public void register (){
        User users = new User();
        System.out.println("Атынызды жазыныз :");
        users.setFirstName(scanner.nextLine());
        System.out.println("Фамилянызды жазыныз : ");
        users.setLastName(scanner.nextLine());
        users.setEmail(emailTrue());
//        System.out.println("Password :");
        users.setPassword(passwordTrue());
        System.out.println("Product :");


        user[count] = users;
        count++;
        System.out.println(" ");

    }

    public void login(){

        Scanner scanner1 = new Scanner(System.in);

        System.out.println("Login жаз : ");
        String login = scanner1.nextLine();
        System.out.println("Password жаз :");
        String password = scanner1.nextLine();

        for (int i = 0; i < count ; i++) {
            if (user[i].getEmail().equals(login) && user[i].getPassword().equals(password)){
                System.out.println("\uD83D\uDCA5\uD83D\uDCA5 Welcome \uD83D\uDCA5\uD83D\uDCA5"+user[i].getFirstName()+"  "+ user[i].getLastName());


            }

        }


    }
    public String emailTrue(){
        Scanner scanner1 = new Scanner(System.in);
        boolean isTrue = false;
        String email = "";
        while (!isTrue){
            System.out.println("Email жазыныз : ");
            email = scanner1.nextLine();
            if (email.endsWith("gmail.com")){
                System.out.println("Туура ! ");
                isTrue = true;
            }else System.err.println("Туура эмес кайра кайталаныз gmail.com кошуп жазыныз !");

        }
        return email;
    }

    public String passwordTrue(){
        Scanner scanner1 = new Scanner(System.in);
        boolean isTrue = false;
        String password = "";
        while (!isTrue) {
            System.out.println("Пароль жазыныз :");
            password = scanner1.nextLine();
            if (password.length() >= 4) {
                System.out.println("Туура !");
                isTrue = true;
            }else System.err.println("Пароль 4 цифрадан ойдо болуусу керек !");
        }
        return password;
    }



}
//
