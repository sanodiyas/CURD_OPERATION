package p2;
import java.util.Scanner;
import java.util.ArrayList;
public class Launch {
private static Scanner sc=new Scanner(System.in);
private static ArrayList<Product>al=new ArrayList<>();
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       
		while(true) {
			System.out.println("Press1->INSERT\nPRESS2->"+"READ\nPRESS3->UPDATE\nPRESS4->delete\nPRESS5->EXIT");
			System.out.println("Enter choice:");
			int choice=sc.nextInt();
			if(choice==5) {
				System.out.println("THANKS FOR USING:");
				break;
			}
			switch(choice) {
			case 1:
				insert();
				break;
			case 2:
				read();
				break;
			case 3:
				update();
				break;
			case 4:
				delete();
				break;
				default:
					System.out.println("wrong input");
					break;
			}
			
		}
	}
    private static void delete() {
    	
    }
    private static void update() {
    	System.out.println("enter pid");
    	int pid=sc.nextInt();
    	for(int i=0;i<al.size();i++) {
    		Product c=al.get(i);
    		int getpid=c.getPid();
    		if(pid==getpid) {
    			System.out.println("enter Price");
    			double newprice=sc.nextDouble();
    			c.setPrice(newprice);
    		}
    	}
    }
    private static void read() {
    	for(Product c:al) {
    		System.out.println(c.toString());
    	}
    }


private static void insert() {
	while(true) {
		System.out.println("Enter PID number");
		int pid=sc.nextInt();
		System.out.println("Enter Product Name:");
		String pname=sc.next();
		System.out.println("Enter Product price: ");
		double price=sc.nextDouble();
		System.out.println("Enter Company:");
		String company=sc.next();
		System.out.println("Enter Qt:");
		int qt=sc.nextInt();
		Product c=new Product(pid,pname,price,company,qt);
				al.add(c);
		System.out.println("do you want to insert more data(y/n) ");
		char cr=sc.next().charAt(0);
		if(cr=='n'||cr=='y') {
			break;
		}
		
	}
}
}