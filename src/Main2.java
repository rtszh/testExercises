import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main2 {
    public static void main(String[] args) {

        // найти максимальное значение в интервале, величиной k массива arr
        // написать сложность алгоритма
        int[] arr = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        List<Integer> result = new ArrayList<>();

        int k = 3;
        int i = 0;

        while (true) {
            if ((i + k - 1) < arr.length) {
                int[] newArr = new int[k];
                System.arraycopy(arr, i, newArr, 0, k);

                var max = Arrays.stream(newArr)
                        .max()
                        .getAsInt();

                result.add(max);
                i++;
            } else {
                break;
            }
        }

        System.out.println(result);

    }
}