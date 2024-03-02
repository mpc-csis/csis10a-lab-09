public class Particle {
  double startXVelocity;
  double startYVelocity;
  double startXPosition;
  double startYPosition;
  double xVelocity;
  double yVelocity;
  double xPosition;
  double yPosition;

  public Particle(double paramDouble1, double paramDouble2, double paramDouble3, double paramDouble4) {
    this.startXPosition = paramDouble1;
    this.startYPosition = paramDouble2;
    this.startXVelocity = paramDouble3;
    this.startYVelocity = paramDouble4;
    reset();
  }

  public void passTime(double paramDouble) {
    double d1 = this.xVelocity;
    double d2 = -9.8D * paramDouble + this.yVelocity;
    double d3 = this.xVelocity * paramDouble + this.xPosition;
    double d4 = -4.9D * paramDouble * paramDouble + this.yVelocity * paramDouble + this.yPosition;

    this.xVelocity = d1;
    this.yVelocity = d2;
    this.xPosition = d3;
    this.yPosition = d4;
  }

  public double getXPosition() {
    return this.xPosition;
  }

  public double getYPosition() {
    return this.yPosition;
  }

  public double getXVelocity() {
    return this.xVelocity;
  }

  public double getYVelocity() {
    return this.yVelocity;
  }

  public String toString() {
    return "Particle at (" + this.xPosition + "," + this.yPosition + ") with velocity (" + this.xVelocity + ","
        + this.yVelocity + ")";
  }

  public void print() {
    System.out.println(this);
  }

  public void reset() {
    this.xVelocity = this.startXVelocity;
    this.yVelocity = this.startYVelocity;
    this.xPosition = this.startXPosition;
    this.yPosition = this.startYPosition;
  }
}