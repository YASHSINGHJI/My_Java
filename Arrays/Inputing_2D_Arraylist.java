import java.util.*;

public class Inputing_2D_Arraylist {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        // intializing the 2D arraylist
        for (int i = 0; i < 3; i++) {
            list.add(new ArrayList<>());
        }
        // inputing the 2D arraylist
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                list.get(i).add(sc.nextInt());
            }
        }
        // printing the 2D arraylist
        System.out.println(list);
    }
}