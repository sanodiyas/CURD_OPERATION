package p1;

import java.util.Scanner;

public class Service {
    Product[] arr;
    int k = 0;
    Scanner ip = new Scanner(System.in);

    void createDatabase(int size) {
        arr = new Product[size];
        System.out.println("Database has been created with size " + size);
    }

    void addProduct() {
        System.out.println("==========ADDING INTO DATABASE");
        if (k == arr.length) {
            System.out.println("Database is full");
        } else {
            System.out.println("Enter the product id:");
            int pid = ip.nextInt();
            System.out.println("Enter product name:");
            String pname = ip.next();
            System.out.println("Enter product price:");
            double price = ip.nextDouble();
            System.out.println("Enter the product company:");
            String company = ip.next();
            System.out.println("Enter the quantity:");
            int qt = ip.nextInt();
            Product p = new Product(pid, pname, price, company, qt);
            arr[k] = p;
            k++;
            System.out.println("Product has been added to the database....");
        }
        System.out.println("==============================");
    }

    void findById() {
        System.out.println("====================");
        System.out.println("Enter the ID:");
        int c = 0;
        int pid = ip.nextInt();
        for (Product ole : arr) {
            if (ole != null && ole.getPid() == pid) {
                System.out.println("Pid: " + ole.getPid());
                System.out.println("Pname: " + ole.getPname());
                System.out.println("Price: " + ole.getPrice());
                System.out.println("Company: " + ole.getCompany());
                System.out.println("Qt: " + ole.getQt());
                c++;
                break;
            }
        }
        if (c == 0) {
            System.out.println("Product not found with ID " + pid);
        }
    }
}
