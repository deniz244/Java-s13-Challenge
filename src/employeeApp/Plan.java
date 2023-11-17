package employeeApp;

public enum Plan {

    //STATIC VARIABLE ZANNEDİLMEMESİ İÇİN BÜYÜK HARFLE YAZILIYOR
    BASIC("BASIC",3000),
    MEDIUM("MEDIUM",6000),
    ADVANCE("ADVANCE",10000);

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
