package OOPs.Inheritance;

public class Base_class {
    double h, l, w;

    Base_class(double h, double l, double w) {
        this.h = h;
        this.l = l;
        this.w = w;
    }

    Base_class() {
        h = 0;
        l = 0;
        w = 0;
    }

    Base_class(Base_class ob) {
        h = ob.h;
        l = ob.l;
        w = ob.w;
    }
}
