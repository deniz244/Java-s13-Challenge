package employeeApp;

import java.util.Arrays;

public class Company {
    private long id;
    private String name;
    private double giro;
    private String[] developerNames;

    public void checkGiro(double giro){
        if (giro < 0){
            this.giro = 0;
        }
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
        this.giro = giro;
    }

    public String[] getDeveloperNames() {
        return developerNames;
    }

    public void setDeveloperNames(String[] developerNames) {
        this.developerNames = developerNames;
    }

    public Company(long id, String name, double giro, String[] developerNames) {
        this.id = id;
        this.name = name;
        this.giro = giro;
        checkGiro(this.giro);
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
        if(index < 0 || index > developerNames.length){
            System.out.println("Error: Invalid index");
        }

        if(developerNames[index] != null){
            System.out.println("This index is not empty can't add developer name");
        }else{
            developerNames[index] = name;
            System.out.println("Developer name" + name + "added successfully");
        }
    }
}
