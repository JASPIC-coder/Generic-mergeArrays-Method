
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // Integer arrays example
        Integer[] array1 = {1, 2, 3, 4};
        Integer[] array2 = {5, 6, 7, 8};
        Integer[] mergedIntegers = GenericArrayUtility.mergeArrays(array1, array2);
        System.out.println("Merged Integer Array: " + Arrays.toString(mergedIntegers));

        // String arrays example
        String[] stringArray1 = {"I", "LIKE", "NIKE"};
        String[] stringArray2 = {"SO", "SO", "MUCH"};
        String[] mergedStrings = GenericArrayUtility.mergeArrays(stringArray1, stringArray2);
        System.out.println("Merged String Array: " + Arrays.toString(mergedStrings));

        // One array is null
        String[] mergedWithNull = GenericArrayUtility.mergeArrays(null, stringArray2);
        System.out.println("Merged with one null: " + Arrays.toString(mergedWithNull));

        // Both arrays are null
        String[] mergedBothNull = GenericArrayUtility.mergeArrays(null, null);
        if (mergedBothNull != null) {
            System.out.println("Merged with both null: " + Arrays.toString(mergedBothNull));
        } else {
            System.out.println("Merged with both null: null (both arrays were null)");
        }
    }
}



