package hw4;

import java.util.ArrayList;
import java.util.Random;

import hw4.aggregation.*;
import hw4.inheritance.*;
import hw4.interfaces.*;
import hw4.polymorph.*;
import hw4.composition.*;

public class Main {
    public static void main(String[] args) {
        inheritance();
        interfacing();
        polymorphism();
        aggregation();
        composition();
    }

    public static void inheritance() {
        System.out.println("\n===== Inheirtance =====");
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
        System.out.println("\n===== Interface =====");
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

    public static void polymorphism() {
        System.out.println("\n===== Polymorphism =====");
        Random rand = new Random(System.currentTimeMillis());
        Ship[] ships = new Ship[3];

        ships[0] = new Ship("Normal Ship", Integer.toString(rand.nextInt(1970, 2026)));
        ships[1] = new CruiseShip("Cruise Ship", 
            Integer.toString(rand.nextInt(1950, 2026)), 
            rand.nextInt(100, 500)
        );
        ships[2] = new CargoShip("Cargo Ship",
            Integer.toString(rand.nextInt(1950, 2026)),
            rand.nextInt(1000, 500000)
        );

        for (Ship ship : ships) {
            ship.print();
            System.out.println("---");
        }

        System.out.println();
    }

    public static void aggregation() {
        System.out.println("\n===== Aggregation =====");
        Instructor instructor1 = new Instructor("Nima", "Davarpanah", "3-2636");
        Textbook textbook1 = new Textbook("Clean Code", "Robert C. Martin");
        Course course = new Course("Advance Software Engineering");
        course.instructor = instructor1;
        course.textbook = textbook1;
        course.print();
        System.out.println("------------------");
        Instructor instructor2 = new Instructor("John", "Smith", "1-2222");
        Textbook textbook2 = new Textbook("Spaghetti Code", "Me");
        course.instructor = instructor2;
        course.textbook = textbook2;
        course.print();
        System.out.println();
    }

    public static void composition() {
        System.out.println("\n===== Composition =====");
        Folder root = new Folder("php_demo1");
        Folder tempFolder = new Folder("Source Files");

        root.folderList.add(tempFolder);
        root.folderList.add(new Folder("Include Path"));
        root.folderList.add(new Folder("Remote Files"));
        tempFolder.fileList.add(new File(".htaccess"));
        tempFolder.fileList.add(new File(".htrouter.php"));
        tempFolder.fileList.add(new File("index.html"));
        tempFolder.folderList.add(new Folder(".phalcon"));
        tempFolder.folderList.add(new Folder("cache"));
        tempFolder.folderList.add(new Folder("public"));
        tempFolder.folderList.add(new Folder("app"));
        tempFolder = tempFolder.folderList.getLast();
        tempFolder.folderList.add(new Folder("config"));
        tempFolder.folderList.add(new Folder("controllers"));
        tempFolder.folderList.add(new Folder("library"));
        tempFolder.folderList.add(new Folder("migrations"));
        tempFolder.folderList.add(new Folder("views"));

        root.printAll();

        System.out.println("------------------");
        
        root.folderList.getFirst().folderList.removeLast();
        root.printAll();

        System.out.println("------------------");
        
        root.folderList.getFirst().folderList.removeLast();
        root.printAll();
    }
}