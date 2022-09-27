import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        int[] array = new int[]{5, 7, 1, 3, 10, 9};

        var max = Arrays.stream(array)
                .max()
                .getAsInt();

        System.out.println(max);
    }
}