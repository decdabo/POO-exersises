class Vehicle {
  private String brandAndModel;
  private String idDate;
  private String vehicleType;
  private int passengersCapacity;
  public Vehicle(String brandAndModel, String idDate, String vehicleType, int passengersCapacity) {
    this.brandAndModel = brandAndModel;
    this.idDate = idDate;
    this.vehicleType = vehicleType;
    this.passengersCapacity = passengersCapacity; 
  } 
  public String getName() {
    return this.brandAndModel;
  }
  public void printInfo() {
    System.out.println(this.brandAndModel);
    System.out.println(this.idDate);
    System.out.println(this.vehicleType);
    System.out.println(this.passengersCapacity);
  }
}