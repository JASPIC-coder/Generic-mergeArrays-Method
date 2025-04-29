
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Integer[] array1 = {1, 2, 3, 4};
        Integer[] array2 = {5, 6, 7, 8};

        Integer[] mergedIntegers = GenericArrayUtility.mergeArrays(array1, array2);
        System.out.println("Merged Integer Array: " + Arrays.toString(mergedIntegers));

        String[] stringArray1 = {"I", "LIKE", "NIKE"};
        String[] stringArray2 = {"SO", "SO", "MUCH"};

        String[] mergedStrings = GenericArrayUtility.mergeArrays(stringArray1, stringArray2);
        System.out.println("Merged String Array: " + Arrays.toString(mergedStrings));
    }
}

