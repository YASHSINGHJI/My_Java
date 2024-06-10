package OOPs.Inheritance;

public class Main {
    public static void main(String[] args) {
        Child_class c = new Child_class();
        System.out.println(c.h + " " + c.l + " " + c.w + " " + c.weight);
        Child_class c1 = new Child_class(2, 3, 4, 10);
        System.out.println(c1.h + " " + c1.l + " " + c1.w + " " + c1.weight);
    }

}
