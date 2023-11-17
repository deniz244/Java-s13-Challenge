package employeeApp;

import java.util.Arrays;

public class Company {
    private long id;
    private String name;
    private double giro;
    private String[] developerNames;

    //DIŞARIDAN HİÇBİR ŞEKİLDE ULAŞILMASINA İHTİYAÇ OLMADIĞI İÇİN PRIVATE
    private void checkGiro(double giro){
        if (giro < 0){
            this.giro = 0;
        }else {
            this.giro = giro;
        }
    }
    public Company(long id, String name, double giro, String[] developerNames) {
        this.id = id;
        this.name = name;
        this.giro = giro;
        checkGiro(this.giro);
        this.developerNames = developerNames;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getGiro() {
        return giro;
    }

    public void setGiro(double giro) {
        checkGiro(giro);
    }

    public String[] getDeveloperNames() {
        return developerNames;
    }

    public void setDeveloperNames(String[] developerNames) {
        this.developerNames = developerNames;
    }


    @Override
    public String toString() {
        return "Company{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", giro=" + giro +
                ", developerNames=" + Arrays.toString(developerNames) +
                '}';
    }

    public void addEmployee(int index, String name){
        try {
            if (developerNames[index] != null) {
                System.out.println("This index is not empty can't add developer name");
            } else {
                developerNames[index] = name;
                System.out.println("Developer " + name + " added successfully");
            }
            }catch (ArrayIndexOutOfBoundsException ex){
                System.out.println("Invalid index: " + ex.getMessage());
            }catch (Exception ex){
            System.out.println(ex.getMessage());}
        }
}
