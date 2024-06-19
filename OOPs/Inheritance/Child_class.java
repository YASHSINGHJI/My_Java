package OOPs.Inheritance;

public class Child_class extends Base_class {
    double weight;

    public Child_class() {
        this.weight = 0;
    }

    public Child_class(double h, double l, double w, double weight) {
        super(h, l, w); // used to initialize values present in parent class constructor.
        this.weight = weight;
    }
}
