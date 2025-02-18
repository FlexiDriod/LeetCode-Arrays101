public class ValidateMountainArr {
    public boolean validMountainArray(int...arr) {
        int n = arr.length;
        // The array must have at least 3 elements to form a mountain
        if (n < 3) {
            return false;
        }
        int i = 0;
        // Ascend until the peak
        while (i + 1 < n && arr[i] < arr[i + 1]) {
            i++;
        }
        // Peak cannot be at the first or last element
        if (i == 0 || i == n - 1) {
            return false;
        }
        // Descend after the peak
        while (i + 1 < n && arr[i] > arr[i + 1]) {
            i++;
        }
        // If we reached the end of the array, it's a valid mountain
        return i == n - 1;
    }

    public static void main(String[] args) {
        ValidateMountainArr obj = new ValidateMountainArr();

        // Test cases
        System.out.println(obj.validMountainArray(2, 1));  // Output: false
        System.out.println(obj.validMountainArray(3, 8, 5));  // Output: false
        System.out.println(obj.validMountainArray(0, 3, 2, 1));  // Output: true
    }
}
