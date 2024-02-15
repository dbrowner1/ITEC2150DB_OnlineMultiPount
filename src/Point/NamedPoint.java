package Point;

public class NamedPoint extends Point {
    private String name;

    public NamedPoint(String name, double x, double y) {
        super(x, y);
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return name + super.toString();
    }
}
