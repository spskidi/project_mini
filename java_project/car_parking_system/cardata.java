package car_parking_system;

public class cardata {
    String name;
    String num;
    int hr, min;
    String phone_no;
    int entry_time;
    int position;
    int flag;
    int seats;
    cardata next;

    public cardata(String name, String number, int hr, int min, int seats, String phone_no,int flag) {
        this.name = name;
        this.num = number;
        this.hr = hr;
        this.min = min;
        this.seats = seats;
        this.phone_no = phone_no;
        this.flag = flag;
        this.entry_time =hr*60 + min;
        
        
        this.next = null;
    }

    
}

