import java.lang.reflect.Array;

/**
 * A utility class that provides a generic method to merge two arrays of the same type.
 *
 * This method is useful in many real-life scenarios like:
 * - Merging API results
 * - Combining data from files or databases
 * - Reusable generic utilities
 *
 * It handles null inputs gracefully and preserves the original order of elements.
 */
public class GenericArrayUtility {

    public static <T> T[] mergeArrays(T[] a, T[] b) {
        if (a == null && b == null) {
            return null; // Both arrays are null, return null
        }
        if (a == null) return b; // Only first array is null
        if (b == null) return a; // Only second array is null

        int length = a.length + b.length;
        @SuppressWarnings("unchecked")
        T[] result = (T[]) Array.newInstance(a.getClass().getComponentType(), length);

        System.arraycopy(a, 0, result, 0, a.length);
        System.arraycopy(b, 0, result, a.length, b.length);

        return result;
    }
}







