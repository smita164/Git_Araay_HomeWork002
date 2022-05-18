import java.util.Arrays;

public class Q_2_AscendingOrder {
    public static void main(String[] args) {
        int[] array = new int[]{0, 29, 50, 189, 2, 332, 47, 43};

        {
            Arrays.sort(array);
            System.out.println("sort numbers in ascending order: ");
            for (int i = 0; i < array.length; i++) {
                System.out.println(array[i]);
            }
        }
    }

}
