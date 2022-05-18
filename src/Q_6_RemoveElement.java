import java.util.Arrays;

public class Q_6_RemoveElement {
    public static void main(String[] args) {

        int[] my_array = {22, 23, 24, 25, 26, 27, 28, 29, 30, 31};

        System.out.println("Main Array : "+ Arrays.toString(my_array));


        int removeIndex = 4;

        for(int i = removeIndex; i < my_array.length -1; i++){
            my_array[i] = my_array[i + 1];
        }
        System.out.println("After removing the element four: "+Arrays.toString(my_array));
    }
}
