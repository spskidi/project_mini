package car_parking_system;
import java.util.Scanner;

public class main {
     public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        parkingservice service = new parkingservice();
        searchservice searchservice = new searchservice();
        displayservice displayservice = new displayservice();

        while (true) {
            System.out.println("\n--- CAR PARKING SYSTEM ---");
            System.out.println("1. Park Car");
            System.out.println("2. Remove Car");
            System.out.println("3. Search Car");
            System.out.println("4. Display All Cars");
            System.out.println("5. Exit");

            System.out.print("Enter choice: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    service.addcar();
                    break;

                case 2:
                    service.removeCar();
                    
                    break;

                case 3:
                    searchservice.search(service.getHead());
                    break;

                case 4:
                    displayservice.display(service.getHead());
                    break;

                case 5:
                    System.exit(0);

                default:
                    System.out.println("Invalid choice");
            }
        }
    }
}
