import java.util.Arrays;

public class ThirdHighestValue {
    public static void main(String[] args) {
        int array[]= {42, 30, 56, 63, 74, 86, 48};
        int size = array.length;
        Arrays.sort(array);
        System.out.println("sorted Array ::"+Arrays.toString(array));
        int res = array[size-3];
        System.out.println("2nd largest element is ::"+res);
    }
}
