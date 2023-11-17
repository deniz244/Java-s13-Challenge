package employeeApp;

import java.util.Arrays;

//POJO -> Plain Old Java Object
public class Employee {

    private long id;
    private String fullName;
    private String email;
    private String password;
    private String[] healthPlans;

    public Employee(long id, String fullName, String email, String password, String[] healthplans) {
        this.id = id;
        this.fullName = fullName;
        this.email = email;
        this.password = password;
        this.healthPlans = healthplans;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
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

    public String[] getHealthPlans() {
        return healthPlans;
    }

    public void setHealthPlans(String[] healthPlans) {
        this.healthPlans = healthPlans;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", fullName='" + fullName + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", healthPlans=" + Arrays.toString(healthPlans) +
                '}';
    }

    //healthPlans  ["A Sigorta" null,null,null]
    //flag(boolean)
    public void addHealthPlan(int index, String name){

        //GUARDING ÖNCELİKLİ -> ÖNCE BÜTÜN OLUMSUZ KOŞULLARI DÜŞÜN
        //index < 0 || index >= healthPlans.length de yazılablirdi if içinde
        if(index < 0 ){
            System.out.println("Error: Invalid index, index < 0");
        }else {
            try {
                boolean isExist = false;
                for (String healthPlan : healthPlans) {
                    if (healthPlan != null && healthPlan.equals(name)) {
                        isExist = true;
                        System.out.println(name + "is already in the health plans array ");
                        break;
                    }
                }

                if (!isExist) {
                    if (healthPlans[index] != null) {
                        System.out.println("This index is not empty can't add health plan name");
                    } else {
                        healthPlans[index] = name;
                        System.out.println("Health plan " + name + " added successfully");
                    }
                }
            }catch (ArrayIndexOutOfBoundsException ex){
                System.out.println("Invalid index: " + index);
            }catch (NullPointerException npe){
                System.out.println("Null pointer exception" + npe.getMessage());
            }catch (Exception ex){
                System.out.println(ex.getMessage());
            }
        }
    }
}
