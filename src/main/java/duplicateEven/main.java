package duplicateEven;

import java.util.ArrayList;

public class main {
    public static void main(String[] args) {
        int[] array = {1,3,2,5,2,6,-2,3,-2,12,17,12,5,2};

        ArrayList<Integer> buffer = new ArrayList<>();
        ArrayList<Integer> dups = new ArrayList<>();

        for (int i: array) {
            if (!buffer.contains(i)) {
                buffer.add(i);
            }
            else {
                if (i % 2 == 0 && !dups.contains(i)) {
                    dups.add(i);
                }
            }
        }

        System.out.println("Birden fazla bulunan çift sayılar: " + dups);
    }
}
