package car_parking_system;

public class displayservice {
    public static void display(cardata head) {
        if (head.next == null) {
            System.out.println("No cars parked");
            return;
        }

        cardata temp = head.next;

        System.out.println("\nOwner\tPhone_No\tCar No\tPosition");

        while (temp != null) {
            System.out.println(temp.name + "\t" + temp.phone_no + "\t" +
                    temp.num + "\t" + temp.position);
            temp = temp.next;
        }
    }
}
