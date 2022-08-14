class Receptionist {

    private String ID;
    private String name;
    private int age;
    private String address;
    private int workingHours;
    private Room room;


    // setters and getters
    public void setID(String ID) {
        this.ID = ID;
    }

    public String getID() {
        return ID;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getAddress() {
        return address;
    }

    public void setWorkingHours(int workingHours) {
        this.workingHours = workingHours;
    }

    public int getWorkingHours() {
        return workingHours;
    }

    // implement the method

    // method check room availability

    public void checkRoomavailablity(Room room) {

//		room.setRoomNo(roomNo);
        if (room.getRoomNo() == 10) {
            System.out.println("Room is available");
        } else {
            System.out.println("Room is not available");
        }
    }

    // calculate bill

    public double generateBill(int noOfDays, String roomType) {
        double luxaryRoomRate = 2000.0;
        double normalRoomRate = 1000.0;

        if (roomType == "Luxury") {
            return (luxaryRoomRate * noOfDays);
        } else {
            return (normalRoomRate * noOfDays);
        }
    }

    // get customer feeback

    public String getcustomerFeedback(String feedback) {
        return feedback;

    }
}
