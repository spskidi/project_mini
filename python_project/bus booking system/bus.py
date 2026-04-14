
bus_data = {}

def add_bus():
    bus_no = input("Enter bus number: ")
    seats = int(input("Enter total seats: "))

    bus_data[bus_no] = {"total": seats, "avail": seats}

    print("Bus added\n")


def view_bus():
    if len(bus_data) == 0:
        print("No bus available\n")
        return

    print("Bus list:")
    for i in bus_data:
        print("Bus:", i, "Seats left:", bus_data[i]["avail"])
    print()

