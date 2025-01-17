package employeeApp;

import java.util.Arrays;

/**
 * Uygulamanın amacı Java'da nesne tabanlı programlamanın temellerinin oluşturulmasıdır.
 *
 */
public class Main
{

    /**
     * Uygulamadaki tüm işlemler bu metotda yapılmalı
     */

    //main static olduğu ve static bir metod içinden static bir variable veya metod'a ulaşabili
    private static void workWithData ()
    {
        Company comp1 = new Company(12345,"COMP1",2100000,
                new String[]{"Ali", "Veli",null,null,null,null});
        Employee emp1 = new Employee(111111111,"Deniz Tunç", "adasd@mail.com",
                "12Asdsff", new String[]{"Plan A","Plan B",null,null,null,null});
        Healthplan hPlan1 = new Healthplan(1222333344,"Plan C",Plan.BASIC);
        System.out.println(comp1);
        System.out.println(comp1.getName());
        System.out.println(emp1);
        System.out.println(hPlan1);
        emp1.addHealthPlan(3,"Plan C");
        System.out.println(emp1);
        comp1.addEmployee(7,"Fatma");
        System.out.println(comp1);

        System.out.println(Arrays.toString(emp1.getHealthPlans()));
    }

    /**
     * Bu projenin ana(main) metodu. Java uygulamalarında main metot küçük bir metot olur.
     * Bir Java programınd ilgili işlemlerin çoğunluğu başka metodlarda yapılır.
     * Daha sonra ana metod diğer metodları çağırır. Böylece ana metodun içi kalabalık bir hale gelmemiş olur.

     *
     * @param args bu uygulamada kullanılmamaktadır. Command Line üzerinden argüman alan
     *             bir uygulamamız olsaydı kullanılacaktı.
     */
    public static void main(String[] args)
    {
        workWithData();
    }
}
