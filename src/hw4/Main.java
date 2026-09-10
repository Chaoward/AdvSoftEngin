package hw4;

import java.util.ArrayList;
import java.util.Random;

import hw4.inheritance.*;
import hw4.interfaces.*;

public class Main {
    public static void main(String[] args) {
        inheritance();
        interfacing();
    }

    public static void inheritance() {
        System.out.println("===== Inheirtance =====");
        Employee[] employees = new Employee[7];

        employees[0] = new SalariedEmployee("Joe", "Jones", "111-11-1111", 2500f);
        employees[1] = new HourlyEmployee("Stephanie", "Smith", "222-22-2222", 25f, 32f);
        employees[2] = new HourlyEmployee("Mary", "Quinn", "333-33-3333", 19f, 47f);
        employees[3] = new CommisionEmployee("Nicole", "Dior", "444-44-4444", 15f, 50000f);
        employees[4] = new SalariedEmployee("Renwa", "Chanel", "555-55-5555", 1700f);
        employees[5] = new BaseEmployee("Mike", "Davenport", "666-66-6666", 95000f);
        employees[6] = new CommisionEmployee("Mahnaz", "Vaziri", "777-77-7777", 22f, 40000f);

        for (Employee employee : employees) {
            System.out.println( employee.prettyInfo() );
            System.out.println("---");
        }
    }


    public static void interfacing() {
        System.out.println("===== Interface =====");
        ArrayList<IPayable> payList = new ArrayList<IPayable>();

        //populate list 
        Random rand = new Random(System.currentTimeMillis());
        double maxPay = 44d;
        double maxInvoice = 3000d;
        double maxHours = 300d;
        payList.add( new Freelancer("Joe", "Schmo", rand.nextDouble() * maxPay, rand.nextDouble() * maxHours) );
        payList.add( new Freelancer("Jane", "Doe", rand.nextDouble() * maxPay, rand.nextDouble() * maxHours) );
        payList.add( new VendorInvoice("Red Inc.", "0372372", rand.nextDouble() * maxInvoice) );
        payList.add( new VendorInvoice("Blu Co.", "1002122", rand.nextDouble() * maxInvoice) );
        
        //calculate total
        double total = 0d;
        for (IPayable pay : payList) {
            total += pay.calculatePayment();
            pay.print();
            System.out.println("\n---");
        }
        System.out.println("==================");
        System.out.print("Total Payout : $");
        System.out.format("%.2f", total);
        System.out.println();
    }
}