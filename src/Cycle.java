import java.util.Arrays;

public class Cycle {

    public static void main(String[] args) {
        int[] array = new int[12];

        int a = 1;

        for (int i = 0; i < array.length; i++) {
            array[i] = a;
            a++;
        }

        System.out.println(Arrays.toString(array));

    }
}
