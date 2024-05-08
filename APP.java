package p1;

import java.util.Scanner;

public class APP {

    public static void main(String[] args) {
        Service s = new Service();
        System.out.println("========= Product Management System ========");
        Scanner ip = new Scanner(System.in);
        System.out.println("Enter size of database:");
        int size = ip.nextInt();
        s.createDatabase(size);

        while (true) {
            System.out.println("====== Menu =======");
            System.out.println("1. Add Product\n2. Find by ID");
            System.out.println("3. Find by company\n4. Update by ID");
            System.out.println("5. All details\n6. Exit");
            System.out.println("Enter the option: ");
            int op = ip.nextInt();
            switch (op) {
                case 1:
                    s.addProduct();
                    break;
                case 2:
                    s.findById();
                    break;
                case 3:
                    System.out.println("Not implemented");
                    break;
                case 4:
                    System.out.println("Not implemented");
                    break;
                case 5:
                    System.out.println("Not implemented");
                    break;
                case 6:
                    System.out.println("Thank you");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid option");
                    break;
            }
        }
    }
}
