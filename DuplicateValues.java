public class DuplicateValues {
    public static void main(String[] args) {
        int [] arr = new int [] {10, 5, 6, 6, 7, 8, 9, 9, 3, 1, 0, 0};

        System.out.println("Duplicate elements in given array: ");
        for(int i = 0; i < arr.length; i++) {
            for(int j = i + 1; j < arr.length; j++) {
                if(arr[i] == arr[j])
                    System.out.println(arr[j]);
            }
        }
    }
}
