public abstract class BaseDish {
    private String name;
    private double price;

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public BaseDish(String name, double price){
        this.name = name;
        this.price = price;


    }
}
