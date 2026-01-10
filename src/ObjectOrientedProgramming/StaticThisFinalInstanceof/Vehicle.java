package ObjectOrientedProgramming.StaticThisFinalInstanceof;

class Vehicle {

    static double registrationFee = 5000.0;

    final String registrationNumber;
    String ownerName;
    String vehicleType;

    Vehicle(String registrationNumber, String ownerName, String vehicleType) {
        this.registrationNumber = registrationNumber;
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
    }

    static void updateRegistrationFee(double fee) {
        registrationFee = fee;
    }

    void displayVehicleDetails() {
        System.out.println("Registration Fee: " + registrationFee);
        System.out.println("Registration Number: " + registrationNumber);
        System.out.println("Owner Name: " + ownerName);
        System.out.println("Vehicle Type: " + vehicleType);
    }

    public static void main(String[] args) {

        Vehicle v1 = new Vehicle("TN10AB1234", "Nandha Arul", "Car");
        Vehicle v2 = new Vehicle("TN22XY5678", "Rahul", "Bike");

        Vehicle.updateRegistrationFee(6500.0);

        if (v1 instanceof Vehicle) {
            v1.displayVehicleDetails();
        }

        if (v2 instanceof Vehicle) {
            v2.displayVehicleDetails();
        }
    }
}

