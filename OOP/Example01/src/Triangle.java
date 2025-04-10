public class Triangle extends form implements Coloring, VolumenRechner{
    private int length;

    public Triangle(String name, String color, int length) {
        super(name, color);
        this.length = length;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    @Override
    public String getName() {
        return "This is a Triangle --> " + super.getName();
    }

    @Override
    public double berechneFlaeche() {
        return length * length * length;
    }

    @Override
    public void setColor() {
        super.setColor("Triangle new Color -> Navi");
    }

    @Override
    public double berechneVolumen() {
        int z = 100;
        return z;
    }
}
