public class Circle extends form {

    private float radius;

    public Circle(String name, String color, float radius) {
        super(name, color);
        this.radius = radius;
    }

    public float getRadius() {
        return radius;
    }

    public void setRadius(float radius) {
        this.radius = radius;
    }

   @Override
    public String toString() {
        return null;
   }
   @Override
   public double berechneFlaeche() {
       return 2 * Math.PI * Math.pow(radius, 2);
   }
}
