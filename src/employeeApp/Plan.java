package employeeApp;

public enum Plan {
    PLAN("A",20);

    private String name;
    private double price;

    Plan(String name, double price){
        this.name = name;
        this.price = price;
    }

    public String getName(){
        return name;
    }

    public double getPrice(){
        return price;
    }
}
