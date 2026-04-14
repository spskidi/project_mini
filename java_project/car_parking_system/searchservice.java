package car_parking_system;

import java.util.Scanner;

public class searchservice {
    public static void search(cardata head) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter position: ");
        int pos = sc.nextInt();

        cardata temp = head.next;

        while (temp != null && temp.position != pos) {
            temp = temp.next;
        }

        if (temp == null) {
            System.out.println("Car not found");
            return;
        }

        System.out.println("\nOwner Name: " + temp.name);
        System.out.println("Phone: " + temp.phone_no);
        System.out.println("Car Number: " + temp.num);
        System.out.println("Seats: " + temp.seats);
    }
    
}
