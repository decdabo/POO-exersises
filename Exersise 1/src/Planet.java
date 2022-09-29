public abstract class Planet {
  private String name;
  private double id;
  private int mass;
  private int radius;
  private int density;
  private double sunDistance;

  public Planet( String name, int mass, int density, double sunDistance, int radius) {
    this.name = name;
    this.id = (int)(Math.random()*1000 + 1);
    this.mass = mass; 
    this.density = density;
    this.sunDistance = sunDistance;
    this.radius = radius;
  }

  public double getTheWorldAttraction(double distance, double planetMass) {
    double G = 0000000000.6672;

    return (G*mass*planetMass)/distance;
  }
  public double translationVelocity(int translationTime) {
    return sunDistance/translationTime;
  }
}
