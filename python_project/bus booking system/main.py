
from bus import add_bus, view_bus
from booking import book_ticket, cancel_ticket, show_booking

while True:
    print("---- Bus System ----")
    print("1 Add Bus")
    print("2 View Bus")
    print("3 Book Ticket")
    print("4 Cancel Ticket")
    print("5 Show Booking")
    print("6 Exit")

    ch = input("Enter choice: ")

    if ch == "1":
        add_bus()

    elif ch == "2":
        view_bus()

    elif ch == "3":
        book_ticket()

    elif ch == "4":
        cancel_ticket()

    elif ch == "5":
        show_booking()

    elif ch == "6":
        print("Exit")
        break

    else:
        print("Wrong choice\n")
