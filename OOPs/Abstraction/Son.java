package OOPs.Abstraction;

public class Son extends Parent {
    @Override
    void career(String name) {
        System.out.println(name + " is a Software Engineer.");
    }

    @Override
    void parent(String name, int age) {
        System.out.println(name + " is a parent of " + age + " years old son.");
    }

}
