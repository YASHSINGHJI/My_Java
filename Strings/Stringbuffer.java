package Strings;

// StringBuffer is mutable
public class Stringbuffer {
    public static void main(String[] args) {

        // Constructor 1
        StringBuffer sb = new StringBuffer();
        System.out.println(sb.capacity()); // default capacity is 16

        // Constructor 2
        StringBuffer sb1 = new StringBuffer("We make Devs");

        // Constructor 3
        StringBuffer sb2 = new StringBuffer(30);

        sb.append("We make Devs");
        // sb.insert(7, " Awesome");
        sb.replace(0, 2, "Abhinav"); // end index is exclusive
        sb.reverse();
        System.out.println(sb2.capacity());

    }
}