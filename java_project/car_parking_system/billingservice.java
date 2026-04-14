package car_parking_system;

public class billingservice {
    public static void showcharges(){
        System.out.println("\n******Rate*******");
        System.out.println("For 5 seater:");
        System.out.println("Parking:RS 6 per min");
        
        
        System.out.println("For 7 seater:");
        System.out.println("Parking: Rs 12 per min");
        

    }

    public static int calculate(cardata car,int exittime){
        int total=0;
        int time=exittime-car.entry_time;
        if(car.seats==5){
            total+=6*time;
        }
        else{
            total+=12*time;
        }
        return total;

    }
    
}
