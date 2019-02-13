public class Vehicle {

    private String vehicleType;
    private double tankSize;

    public Vehicle(String vehicleType, double tankSize) {
        this.vehicleType = vehicleType;
        this.tankSize = tankSize;
    }

    public String getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(String vehicleType) {
        this.vehicleType = vehicleType;
    }

    public double getTankSize() {
        return tankSize;
    }

    public void setTankSize(double tankSize) {
        this.tankSize = tankSize;
    }
}
