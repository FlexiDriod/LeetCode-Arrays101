import java.util.HashSet;

public class CheckDoubleExist {
    public boolean checkIfExist(int...arr) {
        HashSet<Integer> seen = new HashSet<>();
        for (int num : arr) {
            if (seen.contains(2 * num) || (num % 2 == 0 && seen.contains(num / 2))) {
                return true;
            }
            seen.add(num);
        }

        return false;
    }

    public static void main(String[] args) {
        boolean out = new CheckDoubleExist().checkIfExist(2, 20, 10, 50, 5);
        System.out.println(out);
    }
}
