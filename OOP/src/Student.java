public class Student {
    private String name;
    private float mark;
    private int id;
    private static int mtrCounter = 712100;

    public Student(String name, float mark) {
        this.name = name;
        this.mark = mark;
        this.id = mtrCounter;
        mtrCounter++;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String n) {
        this.name = n;
    }


    public float getMark() {
        return this.mark;
    }

    public void setMark(float mark) {
        this.mark = mark;
    }

    public int getId() {
        return this.id;
    }


    @Override
    public String toString() {
        return "Name: " + this.name + ", Mtr: " + this.id + ", Note: " + this.mark;
    }
}
