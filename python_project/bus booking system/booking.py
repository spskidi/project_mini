
from bus import bus_data
from utils import get_id

book_list = []

def book_ticket():
    bus_no = input("Enter bus number: ")

    if bus_no not in bus_data:
        print("Bus not found\n")
        return

    if bus_data[bus_no]["avail"] == 0:
        print("No seats left\n")
        return

    name = input("Enter name: ")

    ticket = get_id()

    bus_data[bus_no]["avail"] -= 1

    data = {"name": name, "bus": bus_no, "id": ticket}
    book_list.append(data)

    print("Booked. Ticket id:", ticket, "\n")


def cancel_ticket():
    t_id = input("Enter ticket id: ")

    for i in book_list:
        if i["id"] == t_id:
            book_list.remove(i)
            bus_data[i["bus"]]["avail"] += 1
            print("Cancelled\n")
            return

    print("Ticket not found\n")


def show_booking():
    if len(book_list) == 0:
        print("No booking\n")
        return

    print("All bookings:")
    for i in book_list:
        print("Name:", i["name"], "| Bus:", i["bus"], "| ID:", i["id"])
    print()
