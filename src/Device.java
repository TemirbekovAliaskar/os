import java.time.LocalDate;

public class Device extends  Product{

    private  String brand;
    private String color;
    private String inNew;
    private String memory;

    public Device(String name, String description, int price, LocalDate data, String brand, String color, String inNew, String memory) {
        super(name, description, price, data);
        this.brand = brand;
        this.color = color;
        this.inNew = inNew;
        this.memory = memory;
    }


    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getInNew() {
        return inNew;
    }

    public void setInNew(String inNew) {
        this.inNew = inNew;
    }

    public String getMemory() {
        return memory;
    }

    public void setMemory(String memory) {
        this.memory = memory;
    }

    public static void allDevice(Product[] products){
        System.out.println("Баардык техникалар 📸💻📳:");
        for (Product produc : products){
            if (produc instanceof Device){
                System.out.println(produc);
            }
        }
    }




    @Override
    public String toString() {
        return super.toString() +
               "\nbrand :" + brand + '\n' +
               "color :" + color + '\n' +
               "isNew :" + inNew + '\n' +
               "memory:'" + memory + '\n' +
               "; " ;
    }

}
