
import java.lang.reflect.Array;

public class GenericArrayUtility {
    public static <T> T[] mergeArrays(T[] a, T[] b) {
        int length = a.length + b.length;
        @SuppressWarnings("unchecked")
        T[] result = (T[]) Array.newInstance(a.getClass().getComponentType(), length);
        System.arraycopy(a, 0, result, 0, a.length);
        System.arraycopy(b, 0, result, a.length, b.length);
        return result;
    }
}


