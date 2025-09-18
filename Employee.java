
import java.util.Scanner;

public class Employee {
    String name;
    long phone;
    int id;
    static int temp = 0;

    public Employee(String name, long phone) {
        this.name = name;
        this.phone = phone;
        this.id = temp++;
    }

    public static void main(String[] args) {
        int i = 0;
        while (true) {
            Scanner sc = new Scanner(System.in);

            System.out.println("please enter the name  : ");
            String name1 = sc.next();
            System.out.println("please enter the phone number : ");
            long phone1 = sc.nextLong();

            // System.out.println("name : " + name1);
            // System.out.println("Phone Number : " + phone1);
            Employee em = new Employee(name1, phone1);

            System.out.println("Employee name : " + em.name);
            System.out.println("Employee phone : " + em.phone);
            System.out.println("Employee Id : " + em.id);
            System.out.println("---------------------");
        }
    }
}
