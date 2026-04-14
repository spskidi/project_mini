package car_parking_system;

import java.util.Scanner;

public class parkingservice {
    cardata head;
    Scanner scan=new Scanner(System.in);
    int max=10;
    public parkingservice(){

    head = new cardata("", "", 0, 0, 0, "", 0);
    head.next = null;
    head.position = 0;
}
    
    public void addcar(){
        if(head.position==max){
            System.out.println("Parking is full!");
            return ;
        }
        billingservice.showcharges();
        System.out.print("Enter name: ");
        String name = scan.next();

        System.out.print("Enter car number: ");
        String num = scan.next();

        System.out.print("Enter time (hr min): ");
        int hr = scan.nextInt();
        int min = scan.nextInt();

        System.out.print("Enter seats (5/7): ");
        int seats = scan.nextInt();

        System.out.print("Enter phone: ");
        String phone = scan.next();

        cardata newcar = new cardata(name, num, hr, min, seats, phone, 0);


        if(head.next==null){
            head.next=newcar;
            newcar.position=1;
            head.position++;

            
        }

        else {
            cardata temp=head.next;
            if(temp.position!=1){
                newcar.position=1;
                newcar.next=head.next;
                head.next=newcar;
                head.position++;

            }
            else{
                boolean found=false;
                while(temp.next!=null){
                    if (temp.position+1!=temp.next.position){
                        newcar.position=temp.position+1;
                        newcar.next=temp.next;
                        temp.next=newcar;
                        head.position++;
                        found=true;
                        break;
                    }

                    temp=temp.next;
                }
                if(!found){
                    newcar.position=temp.position+1;
                    temp.next=newcar;
                    head.position++;
                }
            }

        }
        System.out.println("car parked at position: "+newcar.position);
        System.out.println("Remaining slots: "+(max-head.position));
    }
     public void removeCar() {
        if (head.next == null) {
            System.out.println("No cars parked");
            return;
        }
        System.out.print("Enter Car Number: ");
        String num = scan.next();

        System.out.print("Enter Exit Time (hour min): ");
        int hr = scan.nextInt();
        int min = scan.nextInt();

        int exitTime = hr * 60 + min;

        cardata temp = head.next;
        cardata prev = head;

        while (temp != null && !temp.num.equals(num)) {
            prev = temp;
            temp = temp.next;
        }
        if (temp == null) {
            System.out.println("Car not found!");
            return;
        }
        int price = billingservice.calculate(temp, exitTime);
        System.out.println("Total Charge: Rs." + price);
        prev.next = temp.next;
        head.position--;

        System.out.println("Car removed successfully");
        System.out.println("Remaining slots: " + (max - head.position));
    }
    public cardata getHead() {
        return head;
    }
}
