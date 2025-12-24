package java_Constructors;

class Vehicle {
    String ownerName;
    String vehicleType;
    static double registrationFee;

    public Vehicle(String ownerName, String vehicleType) {
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
    }

    public void displayVehicleDetails() {
        System.out.println("Owner Name: " + ownerName);
        System.out.println("Vehicle Type: " + vehicleType);
        System.out.println("Registration Fee: $" + registrationFee);
    }

    public static void updateRegistrationFee(double fee) {
        registrationFee = fee;
    }

    public static void main(String[] args) {
        Vehicle.updateRegistrationFee(150.0);

        Vehicle v1 = new Vehicle("Alice", "Car");
        Vehicle v2 = new Vehicle("Bob", "Motorbike");

        v1.displayVehicleDetails();
        System.out.println();
        v2.displayVehicleDetails();

        System.out.println("\nUpdating registration fee to $200...\n");
        Vehicle.updateRegistrationFee(200.0);

        v1.displayVehicleDetails();
        System.out.println();
        v2.displayVehicleDetails();
    }
}
